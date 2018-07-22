package jp.co.ha.web.file.csv.writer;

import java.io.PrintWriter;
import java.util.StringJoiner;

import jp.co.ha.common.file.csv.CsvConfig;
import jp.co.ha.common.file.csv.writer.CsvWriter;
import jp.co.ha.common.util.DateFormatPattern;
import jp.co.ha.common.util.DateUtil;
import jp.co.ha.common.util.StringUtil;
import jp.co.ha.web.file.csv.model.ReferenceCsvDownloadModel;

/**
 * 結果照会CSVWriterクラス<br>
 *
 */
public class ReferenceCsvWriter extends CsvWriter<ReferenceCsvDownloadModel> {

	/**
	 * コンストラクタ<br>
	 *
	 * @param conf
	 *     CSV設定情報
	 * @param printWriter
	 *     出力用PrintWriter
	 */
	public ReferenceCsvWriter(CsvConfig conf, PrintWriter printWriter) {
		super(conf, printWriter);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void writeData(StringJoiner recordJoiner, ReferenceCsvDownloadModel model) {

		LOG.info(model);
		// 1項目ごと区切る
		StringJoiner joiner = new StringJoiner(StringUtil.COMMA);

		// ユーザID
		write(joiner, model.getUserId());
		// 身長
		write(joiner, conf.useMask() ? MASK : model.getHeight().toString());
		// 体重
		write(joiner, conf.useMask() ? MASK : model.getWeight().toString());
		// BMI
		write(joiner, conf.useMask() ? MASK : model.getBmi().toString());
		// 標準体重
		write(joiner, conf.useMask() ? MASK : model.getStandardWeight().toString());
		// 登録日時
		write(joiner, DateUtil.toString(model.getRegDate(), DateFormatPattern.YYYYMMDD_HHMMSS));

		// 1行書き込む
		recordJoiner.add(joiner.toString());
	}

}
