package jp.co.ha.web.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.ha.api.response.HealthInfoRegistResponse;
import jp.co.ha.business.find.HealthInfoSearchService;
import jp.co.ha.common.entity.HealthInfo;
import jp.co.ha.common.util.BeanUtil;
import jp.co.ha.common.util.DateFormatDefine;
import jp.co.ha.common.util.DateUtil;
import jp.co.ha.common.util.StringUtil;
import jp.co.ha.web.form.ResultSearchForm;
import jp.co.ha.web.service.ResultReferenceService;

/**
 * 結果照会画面サービスインターフェース実装クラス<br>
 *
 */
@Service
public class ResultReferenceServiceImpl implements ResultReferenceService {

	/** 健康情報検索サービス */
	@Autowired
	private HealthInfoSearchService healthInfoSearchService;

	/**
	 * 健康情報を取得する<br>
	 *
	 * @param form
	 *            ResultSearchForm
	 * @param userId
	 *            ユーザID
	 * @return
	 */
	private List<HealthInfo> getHealthInfo(ResultSearchForm form, String userId) {

		List<HealthInfo> resultList = null;
		Date regDate = editStrDate(form.getFromRegDate());
		if (StringUtil.isTrue(form.getRegDateSelectFlag())) {
			// 登録日直接指定フラグがONの場合
			resultList = healthInfoSearchService.findByUserIdAndRegDate(userId, regDate);
		} else {
			Date toRegDate = editStrDate(form.getToRegDate());
			resultList = healthInfoSearchService.findByUserIdBetweenRegDate(userId, regDate, toRegDate);
		}
		return resultList;
	}

	/**
	 * 指定した文字列型のyyyy-MM-ddをDate型(yyyy/MM/dd)で返す<br>
	 *
	 * @param date
	 *            日付
	 * @return
	 */
	private Date editStrDate(String date) {
		String strDate = date.replace(StringUtil.HYPHEN, StringUtil.THRASH);
		return DateUtil.toDate(strDate, DateFormatDefine.YYYYMMDD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<HealthInfoRegistResponse> getHealthInfoResponseList(ResultSearchForm form, String userId) {

		// ユーザIDと検索条件フォームから健康情報Entityを取得
		List<HealthInfo> entityList = getHealthInfo(form, userId);
		List<HealthInfoRegistResponse> resultList = new ArrayList<HealthInfoRegistResponse>();
		entityList.stream().forEach(entity -> {
			HealthInfoRegistResponse response = new HealthInfoRegistResponse();
			BeanUtil.copy(entity, response);
			response.setRegDate(DateUtil.toString(entity.getRegDate(), DateFormatDefine.YYYYMMDD_HHMMSS));
			resultList.add(response);
		});
		return resultList;
	}

}
