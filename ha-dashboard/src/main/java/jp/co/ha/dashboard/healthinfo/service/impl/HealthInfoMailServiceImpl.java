package jp.co.ha.dashboard.healthinfo.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.ha.business.api.aws.AwsSesComponent;
import jp.co.ha.business.api.healthinfo.response.HealthInfoRegistResponse;
import jp.co.ha.business.db.crud.read.MailInfoSearchService;
import jp.co.ha.common.exception.BaseException;
import jp.co.ha.common.util.DateTimeUtil;
import jp.co.ha.common.util.DateTimeUtil.DateFormatType;
import jp.co.ha.dashboard.healthinfo.service.HealthInfoMailService;
import jp.co.ha.db.entity.MailInfo;

/**
 * 健康情報メールサービス実装クラス
 *
 * @version 1.0.0
 */
@Service
public class HealthInfoMailServiceImpl implements HealthInfoMailService {

    /** 健康情報登録メールテンプレートID */
    private static final String TEMPLATE_ID = "mail-template/healthinfo-regist-template.txt";

    /** メール情報検索サービス */
    @Autowired
    private MailInfoSearchService mailInfoSearchService;
    /** AwsSesComponent */
    @Autowired
    private AwsSesComponent sesComponent;

    @Override
    public void sendHealthInfoMail(HealthInfoRegistResponse apiResponse)
            throws BaseException {

        String userId = apiResponse.getAccount().getUserId();
        Optional<MailInfo> mailOptional = mailInfoSearchService.findById(userId);

        if (mailOptional.isPresent()) {
            // メール情報が登録されている場合

            String to = mailInfoSearchService.findById(userId).get().getMailAddress();
            String titleText = "健康情報登録完了メール"
                    + DateTimeUtil.toString(DateTimeUtil.getSysDate(),
                            DateTimeUtil.DateFormatType.YYYYMMDD_NOSEP);
            Map<String, String> bodyMap = new HashMap<>();
            bodyMap.put("${userId}", userId);
            bodyMap.put("${seqHealthInfoId}",
                    apiResponse.getHealthInfo().getSeqHealthInfoId().toString());
            bodyMap.put("${height}", apiResponse.getHealthInfo().getHeight() + "cm");
            bodyMap.put("${weight}", apiResponse.getHealthInfo().getWeight() + "kg");
            bodyMap.put("${bmi}", apiResponse.getHealthInfo().getBmi().toString());
            bodyMap.put("${standardWeight}",
                    apiResponse.getHealthInfo().getStandardWeight() + "kg");
            bodyMap.put("${healthInfoRegDate}",
                    DateTimeUtil.toString(
                            DateTimeUtil.toLocalDateTime(
                                    apiResponse.getHealthInfo().getHealthInfoRegDate()),
                            DateFormatType.YYYYMMDDHHMMSS));

            sesComponent.sendMail(to, titleText, TEMPLATE_ID, bodyMap);
        }
    }
}
