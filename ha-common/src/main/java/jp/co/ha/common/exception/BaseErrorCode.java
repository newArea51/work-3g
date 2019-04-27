package jp.co.ha.common.exception;

import jp.co.ha.common.log.type.LogLevel;

/**
 * エラーコードの基底インターフェース
 */
public interface BaseErrorCode {

	/**
	 * エラーコード(外部用)を返却
	 *
	 * @return
	 */
	String getOuterErrorCode();

	/**
	 * ログレベルを返却
	 *
	 * @return
	 */
	LogLevel getLogLevel();
}
