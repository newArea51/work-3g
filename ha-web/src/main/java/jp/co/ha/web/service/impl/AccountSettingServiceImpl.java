package jp.co.ha.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.ha.business.create.MailInfoCreateService;
import jp.co.ha.business.find.AccountSearchService;
import jp.co.ha.business.find.MailInfoSearchService;
import jp.co.ha.business.update.AccountUpdateService;
import jp.co.ha.business.update.MailInfoUpdateService;
import jp.co.ha.common.entity.Account;
import jp.co.ha.common.entity.MailInfo;
import jp.co.ha.common.util.BeanUtil;
import jp.co.ha.web.form.AccountSettingForm;
import jp.co.ha.web.service.AccountSettingService;

/**
 * アカウント設定サービス実装クラス<br>
 *
 */
@Service
public class AccountSettingServiceImpl implements AccountSettingService {

	/** アカウント検索サービス */
	@Autowired
	private AccountSearchService accountSearchService;
	/** アカウント更新サービス */
	@Autowired
	private AccountUpdateService accountUpdateService;
	/** メール情報検索サービス */
	@Autowired
	private MailInfoSearchService mailInfoSearchService;
	/** メール情報作成サービス */
	@Autowired
	private MailInfoCreateService mailInfoCreateService;
	/** メール情報更新サービス */
	@Autowired
	private MailInfoUpdateService mailInfoUpdateService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void execute(AccountSettingForm form) {

		// アカウント情報を検索し、マージする
		Account befAccount = accountSearchService.findByUserId(form.getUserId());
		mergeAccount(befAccount, form);

		// メール情報を検索し、マージする
		MailInfo befMailInfo = mailInfoSearchService.findByUserId(form.getUserId());
		mergeMailInfo(befMailInfo, form);

		if (BeanUtil.isNull(befMailInfo.getUserId())) {
			// メール情報が登録されてない場合
			MailInfo mailInfo = convertMailInfo(form);
			// メール情報を新規登録する
			mailInfoCreateService.create(mailInfo);
			// アカウント情報を更新する
			accountUpdateService.update(befAccount);
		} else {
			// 更新処理を行う
			update(befAccount, befMailInfo);
		}
	}

	/**
	 * 更新処理を行う<br>
	 *
	 * @param account
	 *            Account
	 * @param mainlInfo
	 *            MailInfo
	 */
	private void update(Account account, MailInfo mailInfo) {

		// アカウント情報を更新する
		accountUpdateService.update(account);

		// メール情報を更新する
		mailInfoUpdateService.update(mailInfo);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deleteAccount(AccountSettingForm form) {
		// FIXME AccountDeleteService#delete(String userId)で削除するように修正
		//  accountDao.deleteAccount(form.getUserId());
	}

	/**
	 * フォーム情報をアカウント情報にマージする<br>
	 *
	 * @param account
	 *            Account
	 * @param form
	 *            AccountSettingForm
	 * @return
	 */
	private void mergeAccount(Account account, AccountSettingForm form) {
//		account.setPassword(form.getPassword());
//		account.setFileEnclosureCharFlag(form.getFileEnclosureCharFlag());
//		account.setHealthInfoMaskFlag(form.getHealthInfoMaskFlag());
//		account.setDeleteFlag(form.getDeleteFlag());
//		account.setRemarks(form.getRemarks());
		BeanUtil.copy(form, account, List.of("userId"));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MailInfo convertMailInfo(AccountSettingForm form) {

		MailInfo mailInfo = new MailInfo();
//		mailInfo.setUserId(form.getUserId());
//		mailInfo.setMailAddress(form.getMailAddress());
//		mailInfo.setMailPassword(form.getMailPassword());
		BeanUtil.copy(form, mailInfo);

		return mailInfo;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void mergeMailInfo(MailInfo mailInfo, AccountSettingForm form) {
		BeanUtil.copy(form, mailInfo, List.of("userId"));
//		mailInfo.setMailAddress(form.getMailAddress());
//		mailInfo.setMailPassword(form.getMailPassword());
	}

}
