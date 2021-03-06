package jp.co.ha.business.io.file.csv.writer;

import java.io.PrintWriter;
import java.util.StringJoiner;

import jp.co.ha.business.io.file.csv.model.ReferenceCsvDownloadModel;
import jp.co.ha.common.io.file.csv.CsvConfig;
import jp.co.ha.common.io.file.csv.writer.CsvWriter;
import jp.co.ha.common.log.Logger;
import jp.co.ha.common.log.LoggerFactory;
import jp.co.ha.common.log.MaskExecutor;
import jp.co.ha.common.util.DateTimeUtil;
import jp.co.ha.common.util.DateTimeUtil.DateFormatType;
import jp.co.ha.common.util.StringUtil;

/**
 * 結果照会CSVWriterクラス
 *
 * @version 1.0.0
 */
public class ReferenceCsvWriter extends CsvWriter<ReferenceCsvDownloadModel> {

    /** LOG */
    private static final Logger LOG = LoggerFactory.getLogger(ReferenceCsvWriter.class);

    /**
     * コンストラクタ
     *
     * @param conf
     *     CSV設定情報
     * @param pw
     *     {@linkplain PrintWriter}
     */
    public ReferenceCsvWriter(CsvConfig conf, PrintWriter pw) {
        super(conf, pw);
    }

    @Override
    protected void writeData(StringJoiner record, ReferenceCsvDownloadModel model) {

        LOG.debugBean(model);
        // 1項目ごと区切る
        StringJoiner body = new StringJoiner(StringUtil.COMMA);

        // ユーザID
        write(body, model.getSeqUserId().toString());
        // 身長
        write(body, conf.useMask() ? MaskExecutor.MASK : model.getHeight().toString());
        // 体重
        write(body, conf.useMask() ? MaskExecutor.MASK : model.getWeight().toString());
        // BMI
        write(body, conf.useMask() ? MaskExecutor.MASK : model.getBmi().toString());
        // 標準体重
        write(body, conf.useMask() ? MaskExecutor.MASK
                : model.getStandardWeight().toString());
        // 健康情報作成日時
        write(body, DateTimeUtil.toString(model.getHealthInfoRegDate(),
                DateFormatType.YYYYMMDDHHMMSS));

        // 1行書き込む
        record.add(body.toString());
    }

}
