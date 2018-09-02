package jp.co.ha.common.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 文字列のUtilクラス<br>
 *
 */
public class StringUtil {

	/** カンマ */
	public static final String COMMA = ",";
	/** ハイフン */
	public static final String HYPHEN = "-";
	/** コロン */
	public static final String COLON = ":";
	/** ピリオド */
	public static final String PERIOD = ".";
	/** 空文字 */
	public static final String EMPTY = "";
	/** イコール */
	public static final String EQUAL = "=";
	/** 改行 */
	public static final String NEW_LINE = "\r\n";
	/** 半角スペース */
	public static final String SPACE = " ";
	/** 半角スラッシュ */
	public static final String THRASH = "/";
	/** 真偽値:true */
	public static final String TRUE_FLAG = "1";
	/** 真偽値:false */
	public static final String FALSE_FLAG = "0";

	/**
	 * プライベートコンストラクタ<br>
	 */
	private StringUtil() {
	}

	/**
	 * 対象文字列<code>target</code>を区切り文字<code>delim</code>で、区切ったリストを返す
	 *
	 * @param target
	 *     対象文字列
	 * @param delim
	 *     区切り文字
	 * @return List<String>
	 */
	public static List<String> toStrList(String target, String delim) {
		return isEmpty(target) ? null : Stream.of(target.split(delim)).collect(Collectors.toList());
	}

	/**
	 * 空文字かどうか判定する<br>
	 * トリム処理を行う<br>
	 * 空文字の場合true, それ以外の場合false<br>
	 *
	 * @param target
	 *     対象文字列
	 * @return 判定結果
	 */
	public static boolean isEmpty(String target) {
		return BeanUtil.isNull(target) || EMPTY.equals(target.trim());
	}

	/**
	 * 空文字かどうか判定する<br>
	 * 空文字の場合、true, それ以外の場合false
	 *
	 * @param target
	 *     対象文字列
	 * @return 判定結果
	 */
	public static boolean isBrank(String target) {
		return BeanUtil.isNull(target) || EMPTY.equals(target);
	}

	/**
	 * 指定されたflagがtrueかどうか判定する<br>
	 *
	 * @param flag
	 *     フラグ
	 * @return
	 */
	public static boolean isTrue(String flag) {
		return TRUE_FLAG.equals(flag);
	}

	/**
	 * 指定されたflagがfalseかどうか判定する<br>
	 *
	 * @see StringUtil#isTrue(String)
	 * @param flag
	 *     フラグ
	 * @return
	 */
	public static boolean isFalse(String flag) {
		return !isTrue(flag);
	}

}
