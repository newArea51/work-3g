package jp.co.ha.dashboard.service;

import jp.co.ha.business.dto.AccountDto;
import jp.co.ha.common.exception.BaseException;

/**
 * アカウント登録サービスインターフェース
 *
 */
public interface AccountRegistService {

	/**
	 * 登録処理を行う
	 *
	 * @param dto
	 *     アカウント登録DTO
	 * @throws BaseException
	 *     基底例外
	 */
	void regist(AccountDto dto) throws BaseException;

}