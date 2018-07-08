package jp.co.ha.business.find.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.ha.business.find.HealthInfoFileSettingSearchService;
import jp.co.ha.common.dao.HealthInfoFileSettingDao;
import jp.co.ha.common.entity.HealthInfoFileSetting;

/**
 * 健康情報ファイル設定検索サービスインターフェース実装クラス<br>
 *
 */
@Service
public class HealthInfoFileSettingSearchServiceImpl implements HealthInfoFileSettingSearchService {

	/** 健康情報ファイル設定Dao */
	@Autowired
	private HealthInfoFileSettingDao healthInfoFileSettingDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HealthInfoFileSetting findByUserId(String userId) {
		return healthInfoFileSettingDao.selectByUserId(userId);
	}

}
