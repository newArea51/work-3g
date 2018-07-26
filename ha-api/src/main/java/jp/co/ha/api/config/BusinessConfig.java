package jp.co.ha.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.co.ha.business.create.HealthInfoCreateService;
import jp.co.ha.business.create.impl.HealthInfoCreateServiceImpl;
import jp.co.ha.business.find.AccountSearchService;
import jp.co.ha.business.find.HealthInfoSearchService;
import jp.co.ha.business.find.impl.AccountSearchServiceImpl;
import jp.co.ha.business.find.impl.HealthInfoSearchServiceImpl;
import jp.co.ha.business.healthInfo.HealthInfoCalcService;
import jp.co.ha.business.healthInfo.HealthInfoFunctionService;
import jp.co.ha.business.healthInfo.impl.HealthInfoCalcServiceImpl;
import jp.co.ha.business.healthInfo.impl.HealthInfoFunctionServiceImpl;

/**
 * Businessの設定クラス<br>
 *
 */
@Configuration
public class BusinessConfig {

	/**
	 * アカウント情報検索サービス
	 *
	 * @return
	 */
	@Bean
	public AccountSearchService accountSearchService() {
		return new AccountSearchServiceImpl();
	}

	/**
	 * 健康情報検索サービス
	 *
	 * @return
	 */
	@Bean
	public HealthInfoSearchService healthInfoSearchService() {
		return new HealthInfoSearchServiceImpl();
	}

	/**
	 * 健康情報作成サービス
	 *
	 * @return
	 */
	@Bean
	public HealthInfoCreateService healthInfoCreateService() {
		return new HealthInfoCreateServiceImpl();
	}

	/**
	 * 健康情報計算サービス
	 *
	 * @return
	 */
	@Bean
	public HealthInfoCalcService healthInfoCalcService() {
		return new HealthInfoCalcServiceImpl();
	}

	/**
	 * 健康情報利用機能サービス
	 *
	 * @return
	 */
	@Bean
	public HealthInfoFunctionService healthInfoFunctionService() {
		return new HealthInfoFunctionServiceImpl();
	}

}