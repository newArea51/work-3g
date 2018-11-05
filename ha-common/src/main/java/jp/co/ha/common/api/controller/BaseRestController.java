package jp.co.ha.common.api.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import jp.co.ha.common.api.request.BaseRequest;
import jp.co.ha.common.api.response.BaseResponse;
import jp.co.ha.common.api.response.ErrorResponse;
import jp.co.ha.common.api.service.BaseService;
import jp.co.ha.common.exception.ApiException;
import jp.co.ha.common.exception.BaseException;
import jp.co.ha.common.exception.ErrorCode;
import jp.co.ha.common.log.Logger;
import jp.co.ha.common.log.LoggerFactory;
import jp.co.ha.common.log.type.LogLevel;

/**
 * RestAPI基底コントローラ<br>
 * すべてのRestAPIコントローラはこのクラスを継承すること<br>
 *
 * @param <Rq>
 *     リクエスト
 * @param <Rs>
 *     レスポンス
 * @param <S>
 *     サービスクラス
 */
public abstract class BaseRestController<Rq extends BaseRequest, Rs extends BaseResponse, S extends BaseService<Rq, Rs>> {

	/** LOG */
	protected final Logger LOG = LoggerFactory.getLogger(this.getClass());

	/**
	 * POST通信の処理を行う<br>
	 *
	 * @param apiRequest
	 *     Rq
	 * @return
	 * @throws BaseException
	 *     アプリ例外
	 */
	@PostMapping
	public Rs doPost(@RequestBody Rq apiRequest) throws BaseException {

		Rs apiResponse = this.execute(apiRequest);

		return apiResponse;
	}

	/**
	 * 継承先のコントローラクラスで処理する<br>
	 *
	 * @param request
	 *     リクエストクラス
	 * @return response レスポンスクラス
	 * @throws BaseException
	 *     例外クラス
	 */
	protected abstract Rs execute(Rq request) throws BaseException;

	/**
	 * JSONで例外が起きた場合のエラーハンドリング<br>
	 *
	 * @param e
	 *     JSON系のエラー
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@ExceptionHandler(JsonProcessingException.class)
	public Rs jsonProcessingExceptionHandle(JsonProcessingException e) {

		BaseException baseException = null;
		if (e instanceof InvalidFormatException) {
			InvalidFormatException jfe = (InvalidFormatException) e;
			baseException = new ApiException(ErrorCode.JSON_FORMAT_ERROR, jfe.getValue() + "はリクエスト形式エラーです");
		} else if (e instanceof JsonParseException) {
			baseException = new ApiException(ErrorCode.JSON_PARSE_ERROR, e.getLocation().getColumnNr() + "行目がjson形式ではありません");
		} else if (e instanceof JsonProcessingException) {
			baseException = new ApiException(ErrorCode.JSON_PARSE_ERROR, e.getLocation().getColumnNr() + ":json形式ではありません");
		}
		Rs apiResponse = (Rs) new ErrorResponse(baseException);
		LOG.warnRes(apiResponse, baseException);
		return apiResponse;
	}

	/**
	 * アプリケーション例外のエラーハンドリング<br>
	 *
	 * @param e
	 *     アプリエラー
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@ExceptionHandler(BaseException.class)
	public Rs appExceptionHandle(BaseException e) {
		Rs apiResponse = (Rs) new ErrorResponse(e);
		if (LogLevel.WARN == e.getErrorCode().getLogLevel()) {
			LOG.warnRes(apiResponse, e);
		} else if (LogLevel.ERROR == e.getErrorCode().getLogLevel()) {
			LOG.errorRes(apiResponse, e);
		}
		return apiResponse;
	}

}