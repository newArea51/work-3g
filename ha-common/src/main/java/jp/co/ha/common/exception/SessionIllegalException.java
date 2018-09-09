package jp.co.ha.common.exception;

/**
 * セッション不正例外クラス<br>
 *
 */
public class SessionIllegalException extends BaseException {

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
	public SessionIllegalException(ErrorCode errorCode, String detail) {
		super(errorCode, detail);
	}

}