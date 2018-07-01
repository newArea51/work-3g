package jp.co.ha.common.file.csv.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import jp.co.ha.common.exception.AppIOException;
import jp.co.ha.common.exception.ErrorCode;
import jp.co.ha.common.file.csv.annotation.CsvModel;
import jp.co.ha.common.file.csv.model.BaseCsvModel;
import jp.co.ha.common.log.AppLogger;
import jp.co.ha.common.log.AppLoggerFactory;
import jp.co.ha.common.util.BeanUtil;
import jp.co.ha.common.util.StringUtil;

/**
 * CSV読込クラス<br>
 *
 * @param <T>
 *            CSVモデル
 */
public abstract class CsvReader<T extends BaseCsvModel> {

	private final AppLogger LOG = AppLoggerFactory.getLogger(this.getClass());

	/**
	 * 1行読込を行う<br>
	 *
	 * @param record
	 *            レコード
	 * @return
	 */
	public T read(String record) {

		Class<T> clazz = (Class<T>) BeanUtil.getParameterType(this.getClass());
		List<String> colList = List.of(clazz.getAnnotation(CsvModel.class).headerNames());
		List<String> dataList = StringUtil.toStrList(record, StringUtil.COMMA);
		if (hasFileLengthError(colList, dataList)) {
			throw new AppIOException(ErrorCode.FILE_UPLOAD_ERROR, "CSVの件数が一致しません。");
		}

		T model = null;
		try {
			model = clazz.getDeclaredConstructor().newInstance();
			for (int i = 0; i < colList.size(); i++) {
				String column = colList.get(i);
				String data = dataList.get(i);
				for (Field f : BeanUtil.getFieldList(clazz)) {
					if (column.equals(f.getName())) {
						// setter呼び出し
						Method setter = BeanUtil.getSetter(f.getName(), clazz);
						setter.invoke(model, data);
					}
				}
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		LOG.info(model);
		return model;
	}

	/**
	 * ファイル内の長さチェックを行う<br>
	 *
	 * @param colList
	 *            カラムリスト
	 * @param dataList
	 *            データリスト
	 */
	private boolean hasFileLengthError(List<String> colList, List<String> dataList) {
		return dataList.size() != colList.size();
	}

	/**
	 * 入力されたファイルをリストで返す<br>
	 *
	 * @param is
	 *            InputStream
	 * @return
	 * @throws IOException
	 */
	public List<String> toList(InputStream is) throws IOException {

		List<String> list = new ArrayList<String>();
		try (InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {
			String line;
			while (BeanUtil.notNull(line = br.readLine())) {
				list.add(line);
			}
		}
		return list;
	}

}
