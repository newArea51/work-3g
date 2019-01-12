package jp.co.ha.web.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.ha.business.db.crud.read.AccountSearchService;
import jp.co.ha.business.interceptor.annotation.NonAuth;
import jp.co.ha.business.login.LoginCheck;
import jp.co.ha.business.login.LoginCheckResult;
import jp.co.ha.common.exception.BaseException;
import jp.co.ha.common.system.SessionManageService;
import jp.co.ha.common.util.StringUtil;
import jp.co.ha.common.web.controller.BaseWebController;
import jp.co.ha.db.entity.Account;
import jp.co.ha.web.form.LoginForm;
import jp.co.ha.web.view.ManageWebView;

/**
 * 健康管理_ログイン画面コントローラ
 *
 */
@Controller
@RequestMapping("login")
public class LoginController implements BaseWebController {

	/** sessionサービス */
	@Autowired
	private SessionManageService sessionService;
	/** アカウント検索サービス */
	@Autowired
	private AccountSearchService accountSearchService;
	/** MessageSource */
	@Autowired
	private MessageSource messageSource;

	/**
	 * Formを返す
	 *
	 * @return LoginForm
	 */
	@ModelAttribute
	public LoginForm setUpForm() {
		return new LoginForm();
	}

	/**
	 * ログイン画面
	 *
	 * @param request
	 *     HttpServletRequest
	 * @return ログイン画面
	 */
	@NonAuth
	@GetMapping("/index.html")
	public String index(HttpServletRequest request) {
		// sessionに格納している情報をすべて削除する
		sessionService.removeValues(request.getSession());
		return getView(ManageWebView.LOGIN);
	}

	/**
	 * TOP画面
	 *
	 * @param model
	 *     Model
	 * @param request
	 *     HttpServletRequest
	 * @param form
	 *     LoginForm
	 * @param result
	 *     BindingResult
	 * @return TOP画面
	 * @throws BaseException
	 *     基底例外
	 */
	@NonAuth
	@PostMapping("/top.html")
	public String top(Model model, HttpServletRequest request, @Valid LoginForm form, BindingResult result) throws BaseException {

		if (result.hasErrors()) {
			// validationエラーの場合
			return getView(ManageWebView.LOGIN);
		}

		// アカウント情報を検索
		Account account = accountSearchService.findByUserId(form.getUserId());
		LoginCheckResult checkResult = new LoginCheck().check(account, form.getUserId(), form.getPassword());
		if (checkResult.hasError()) {
			String errorMessage = messageSource.getMessage(checkResult.getErrorCode().getValidateMessage(), null, Locale.getDefault());
			model.addAttribute("errorMessage", errorMessage);
			return getView(ManageWebView.LOGIN);
		}

		// セッションにユーザIDを登録する。
		sessionService.setValue(request.getSession(), "userId", form.getUserId());

		return getView(ManageWebView.TOP);

	}

	/**
	 * TOP画面
	 *
	 * @param request
	 *     HttpServletRequest
	 * @return TOP画面
	 */
	@GetMapping("/top.html")
	public String top(HttpServletRequest request) {

		String userId = sessionService.getValue(request.getSession(), "userId", String.class);
		return getView(StringUtil.isEmpty(userId) ? ManageWebView.LOGIN : ManageWebView.TOP);
	}
}
