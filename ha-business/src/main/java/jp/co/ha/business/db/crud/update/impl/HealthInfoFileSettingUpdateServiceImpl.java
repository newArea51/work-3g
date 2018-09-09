package jp.co.ha.business.db.crud.update.impl;

import org.apache.ibatis.session.SqlSession;

import jp.co.ha.business.db.crud.update.HealthInfoFileSettingUpdateService;
import jp.co.ha.business.db.dao.MyBatisDao;
import jp.co.ha.business.db.entity.HealthInfoFileSetting;
import jp.co.ha.business.db.mapper.HealthInfoFileSettingMapper;
import jp.co.ha.common.exception.DataBaseException;

/**
 * 健康情報ファイル設定更新サービス実装クラス
 *
 */
public class HealthInfoFileSettingUpdateServiceImpl implements HealthInfoFileSettingUpdateService, MyBatisDao {

//	/** 健康情報ファイル設定Dao */
//	@Autowired
//	private HealthInfoFileSettingDao healthInfoFileSettingDao;
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public void update(HealthInfoFileSetting entity) throws DataBaseException {
//		healthInfoFileSettingDao.update(entity);
//	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void update(HealthInfoFileSetting entity) throws DataBaseException {
		try (SqlSession session = getSqlSession()) {
			HealthInfoFileSettingMapper mapper = session.getMapper(HealthInfoFileSettingMapper.class);
			mapper.updateByPrimaryKey(entity);
			session.commit();
		}
	}

}