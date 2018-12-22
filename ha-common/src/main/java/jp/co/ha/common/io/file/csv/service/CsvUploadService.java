package jp.co.ha.common.io.file.csv.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import jp.co.ha.common.exception.AppIOException;
import jp.co.ha.common.exception.BaseException;
import jp.co.ha.common.exception.ErrorCode;
import jp.co.ha.common.io.file.csv.model.BaseCsvModel;
import jp.co.ha.common.util.BeanUtil;

/**
 * CSVアップロードサービスインターフェース<br>
 *
 * @param <T>
 *     CSVモデル
 */
public interface CsvUploadService<T extends BaseCsvModel> {

	/**
	 * アップロードファイルを解析し、CSVモデルリストを返す<br>
	 *
	 * @param uploadFile
	 *     アップロードファイル
	 * @return List<T> CSVアップロードモデルリスト
	 * @throws BaseException
	 *     基底例外
	 */
	List<T> execute(MultipartFile uploadFile) throws BaseException;


	/**
	 * 入力されたファイルをリストで返す<br>
	 *
	 * @param is
	 *     InputStream
	 * @return 文字列リスト
	 * @throws BaseException
	 *     基底例外
	 */
	default public List<String> toList(InputStream is) throws BaseException {

		List<String> list = new ArrayList<>();
		try (InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {
			String line;
			while (BeanUtil.notNull(line = br.readLine())) {
				list.add(line);
			}
		} catch (IOException e) {
			throw new AppIOException(ErrorCode.FILE_READING_ERROR, "ファイルの読込に失敗しました。");
		}
		return list;
	}
}
