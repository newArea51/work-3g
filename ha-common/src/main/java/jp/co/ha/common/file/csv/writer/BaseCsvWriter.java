package jp.co.ha.common.file.csv.writer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringJoiner;

import javax.servlet.http.HttpServletResponse;

import org.springframework.util.MimeTypeUtils;

import jp.co.ha.common.exception.AppIOException;
import jp.co.ha.common.exception.ErrorCode;
import jp.co.ha.common.file.csv.CsvConfig;
import jp.co.ha.common.file.csv.model.BaseCsvModel;
import jp.co.ha.common.util.StringUtil;

/**
 * CSV書き込み基底クラス<br>
 *
 * @param <M>
 *            CSV出力モデルリスト
 */
public abstract class BaseCsvWriter<M extends BaseCsvModel> {

	/** CSV設定情報 */
	protected CsvConfig csvConfig;
	/** モデルリスト */
	protected List<M> modelList;

	/**
	 * コンストラクタ<br>
	 *
	 * @param csvConfig
	 *            CSV設定情報
	 * @param modelList
	 *            モデルリスト
	 */
	public BaseCsvWriter(CsvConfig csvConfig, List<M> modelList) {
		this.csvConfig = csvConfig;
		this.modelList = modelList;
	}

	/**
	 * メイン処理を実施<br>
	 *
	 * @param response
	 *            HttpServletResponse
	 */
	public void execute(HttpServletResponse response) {

		// 初期化処理
		this.init(response);

		try (PrintWriter writer = response.getWriter()) {
			StringJoiner recordJoiner = new StringJoiner(StringUtil.NEW_LINE);
			// ヘッダーを書込
			writeHeader(recordJoiner);

			// データを書込
			modelList.stream().forEach(model -> writeData(recordJoiner, model));
			writer.print(recordJoiner.toString());

		} catch (AppIOException e) {
			throw new AppIOException(ErrorCode.FILE_WRITE_ERROR, "ファイルの出力処理に失敗しました");
		} catch (IOException e) {
			throw new AppIOException(ErrorCode.FILE_WRITE_ERROR, "ファイルの出力処理に失敗しました");
		}

	}

	/**
	 * 初期処理<br>
	 *
	 * @param response
	 *            HttpServletResponse
	 */
	private void init(HttpServletResponse response) {
		response.setContentType(MimeTypeUtils.APPLICATION_OCTET_STREAM_VALUE + ";charset=" + csvConfig.getCharset().toString().toLowerCase());
		response.setHeader("Content-Disposition", "attachment; filename=" + csvConfig.getFileName());
	}

	/**
	 * 指定されたデータの書き込み処理を行う<br>
	 *
	 * @param joiner
	 *            StringJoiner
	 * @param data
	 *            書き込みたいデータ
	 */
	protected void write(StringJoiner joiner, String data) {
		String enclosureChar = csvConfig.isHasEnclosure() ? csvConfig.getEnclosureChar() : StringUtil.EMPTY;
		joiner.add(enclosureChar + data + enclosureChar);
	}

	/**
	 * ヘッダーレコードをつめる<br>
	 *
	 * @param recordJoiner
	 *            StringJoiner
	 */
	protected abstract void writeHeader(StringJoiner recordJoiner);

	/**
	 * データレコードをつめる<br>
	 *
	 * @param recordJoiner
	 *            StringJoiner
	 * @param model
	 *            M CSV出力モデル
	 */
	protected abstract void writeData(StringJoiner recordJoiner, M model);

}
