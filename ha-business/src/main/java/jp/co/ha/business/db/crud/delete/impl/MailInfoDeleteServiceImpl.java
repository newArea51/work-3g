package jp.co.ha.business.db.crud.delete.impl;

import org.apache.ibatis.session.SqlSession;

import jp.co.ha.business.db.SqlSessionFactory;
import jp.co.ha.business.db.crud.delete.MailInfoDeleteService;
import jp.co.ha.common.exception.BaseException;
import jp.co.ha.db.mapper.MailInfoMapper;

/**
 * メール情報削除サービスインターフェース実装クラス
 *
 */
public class MailInfoDeleteServiceImpl implements MailInfoDeleteService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deleteByUserId(String userId) throws BaseException {
		try (SqlSession session = SqlSessionFactory.getInstance().getSqlSession()) {
			MailInfoMapper mapper = session.getMapper(MailInfoMapper.class);
			mapper.deleteByPrimaryKey(userId);
			session.commit();
		}
	}

}
