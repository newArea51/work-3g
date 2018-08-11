package jp.co.ha.web.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.web.servlet.ModelAndView;

import jp.co.ha.common.exception.BaseException;
import jp.co.ha.common.exception.BaseExceptionHandler;
import jp.co.ha.common.exception.ErrorCode;
import jp.co.ha.common.log.LoggerFactory;
import jp.co.ha.web.view.ManageWebView;

/**
 * 画面例外ハンドラー<br>
 *
 */
public class WebExceptionHandler implements BaseExceptionHandler {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {

		ModelAndView modelView = new ModelAndView();
		modelView.setViewName(ManageWebView.ERROR.getName());
		request.setAttribute("errorMessage", buildErrorMessage(e));
		LOGGER.error(buildErrorMessage(e), e);
//		if (e instanceof MultipartException) {
//			return modelView;
//		}
		return modelView;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String buildErrorMessage(Exception e) {
		String detail;
		String errorCode;
		if (e instanceof BaseException) {
			detail = ((BaseException) e).getDetail();
			errorCode = ((BaseException) e).getErrorCode().getOuterErrorCode();
		} else {
			// 予期せぬ例外にする
			detail = ErrorCode.UNEXPECTED_ERROR.getErrorMessage();
			errorCode = ErrorCode.UNEXPECTED_ERROR.getOuterErrorCode();
		}
		return detail + "(" + errorCode + ")";
	}
}
