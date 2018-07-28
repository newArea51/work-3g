package jp.co.ha.common.log;

import java.lang.reflect.Field;

import jp.co.ha.common.log.annotation.Mask;
import jp.co.ha.common.util.BeanUtil;

/**
 * マスク判定クラス<br>
 *
 */
public class MaskExecutor {

	// マスク文字列
	public static final String MASK = "****";

	/**
	 * マスク対象かどうか判定する<br>
	 * マスク対象の場合true, それ以外の場合false<br>
	 *
	 * @param field
	 *     フィールド名
	 * @return
	 */
	public static boolean isMask(Field field) {
		return BeanUtil.notNull(field.getAnnotation(Mask.class));
	}

}