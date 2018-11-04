package jp.co.ha.common.log;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.StringJoiner;

import jp.co.ha.common.log.annotation.Ignore;
import jp.co.ha.common.type.AccessorType;
import jp.co.ha.common.type.DateFormatType;
import jp.co.ha.common.util.BeanUtil;
import jp.co.ha.common.util.DateUtil;
import jp.co.ha.common.util.StringUtil;

/**
 * ログメッセージ作成クラス
 *
 */
public class LogMessageFactory {

	/** LOG */
	private final static Logger LOG = LoggerFactory.getLogger(LogMessageFactory.class);

	/**
	 * プライベートコンストラクタ<br>
	 */
	private LogMessageFactory() {
	}

	public static String getLogMessage(Object bean) {
		StringJoiner body = new StringJoiner(", ");
		Class<?> clazz = bean.getClass();

		for (Field f : BeanUtil.getFieldList(clazz)) {
			if (isIgnore(f)) {
				// 出力非対象項目
				continue;
			}
			String name = f.getName();
			if (MaskExecutor.isMask(f)) {
				body.add(name + StringUtil.EQUAL + MaskExecutor.MASK);
			} else {
				body.add(name + StringUtil.EQUAL + editValue(getValue(bean, name)));
			}
		}
		return clazz.getName() + StringUtil.SPACE + body.toString();
	}

	/**
	 * 出力対象かどうか判定する<br>
	 * 出力対象の場合true, それ以外の場合false<br>
	 *
	 * @param field
	 *     フィールド名
	 * @return
	 */
	private static boolean isIgnore(Field field) {
		return BeanUtil.notNull(field.getAnnotation(Ignore.class));
	}

	/**
	 * 値を取得<br>
	 *
	 * @param bean
	 *     Bean
	 * @param fieldName
	 *     フィールド名
	 * @return
	 */
	private static Object getValue(Object bean, String fieldName) {
		Object value = null;
		try {
			Method getter = BeanUtil.getAccessor(fieldName, bean.getClass(), AccessorType.GETTER);
			value = getter.invoke(bean);
		} catch (IllegalAccessException e) {
			LOG.error("不正アクセスです" + fieldName, e);
		} catch (IllegalArgumentException e) {
			LOG.error("不正な引数です" + fieldName, e);
		} catch (InvocationTargetException e) {
			LOG.error("項目が不正です" + fieldName, e);
		}

		return value;
	}

	/**
	 * 値を出力用に編集する<br>
	 *
	 * @param value
	 *     値
	 * @return
	 */
	private static String editValue(Object value) {
		String strValue;
		if (BeanUtil.isNull(value)) {
			strValue = StringUtil.EMPTY;
		} else if (value instanceof Date) {
			strValue = DateUtil.toString((Date) value, DateFormatType.YYYYMMDD_HHMMSS);
		} else {
			strValue = value.toString();
		}
		return strValue;
	}

}
