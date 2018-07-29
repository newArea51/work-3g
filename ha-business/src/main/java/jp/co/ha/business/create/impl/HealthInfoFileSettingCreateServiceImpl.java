package jp.co.ha.business.create.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.ha.business.create.HealthInfoFileSettingCreateService;
import jp.co.ha.common.dao.HealthInfoFileSettingDao;
import jp.co.ha.common.entity.HealthInfoFileSetting;
import jp.co.ha.common.exception.BaseException;

/**
 * 健康情報ファイル設定作成サービスインターフェース実装クラス<br>
 *
 */
@Service
public class HealthInfoFileSettingCreateServiceImpl implements HealthInfoFileSettingCreateService {

	/** 健康情報ファイル設定Dao */
	@Autowired
	private HealthInfoFileSettingDao healthInfoFileSettingDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create(HealthInfoFileSetting entity) throws BaseException {
		healthInfoFileSettingDao.create(entity);
	}

}
