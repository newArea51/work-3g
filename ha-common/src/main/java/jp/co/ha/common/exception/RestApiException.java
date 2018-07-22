package jp.co.ha.common.exception;

/**
 * API例外クラス<br>
 *
 */
public class RestApiException extends BaseAppException {

	/** シリアルバージョンUID */
	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタ<br>
	 *
	 * @param errorCode
	 *     エラーコード
	 * @param detail
	 *     詳細
	 */
	public RestApiException(ErrorCode errorCode, String detail) {
		super(errorCode, detail);
	}

}