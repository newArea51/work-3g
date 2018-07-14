package jp.co.ha.common.dao.impl;

import java.sql.SQLException;

import org.springframework.dao.DuplicateKeyException;

import jp.co.ha.common.dao.BaseDaoImpl;
import jp.co.ha.common.dao.MailInfoDao;
import jp.co.ha.common.entity.MailInfo;
import jp.co.ha.common.exception.DataBaseException;
import jp.co.ha.common.exception.ErrorCode;
import jp.co.ha.common.log.AppLogger;
import jp.co.ha.common.log.AppLoggerFactory;
import jp.co.ha.common.util.DateFormatPattern;
import jp.co.ha.common.util.DateUtil;

/**
 * メール情報のDaoクラス
 *
 */
public class MailInfoDaoImpl extends BaseDaoImpl implements MailInfoDao {

	private AppLogger logger = AppLoggerFactory.getLogger(this.getClass());

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MailInfo selectByUserId(String userId) throws DataBaseException {

		MailInfo mailInfo = null;
		try {
			connect();
			String sql = "SELECT * FROM " + TABLE_NAME + " WHERE USER_ID = '" + userId + "'";
			execute(sql, SqlType.SELECT);
			while (hasNext()) {
				mailInfo = new MailInfo();
				mailInfo.setUserId(rs.getString(USER_ID));
				mailInfo.setMailAddress(rs.getString(MAIL_ADDRESS));
				mailInfo.setMailPassword(rs.getString(MAIL_PASSWORD));
				mailInfo.setUpdateDate(rs.getTimestamp(UPDATE_DATE));
				mailInfo.setRegDate(rs.getTimestamp(REG_DATE));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataBaseException(ErrorCode.DB_ACCESS_ERROR, TABLE_NAME + "テーブルへのアクセスに失敗しました");
		} finally {
			close();
		}
		return mailInfo;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void update(MailInfo mailInfo) throws DataBaseException {

		logger.info(mailInfo);

		try {
			connect();
			String sql = "UPDATE " + TABLE_NAME + " SET "
						+ MAIL_ADDRESS + "= '" + mailInfo.getMailAddress() + "', "
						+ MAIL_PASSWORD + "= '" + mailInfo.getMailPassword() + "', "
						+ UPDATE_DATE + "= '" + DateUtil.toString(DateUtil.getSysDate(), DateFormatPattern.YYYYMMDD_HHMMSS) + "'"
						+ " WHERE " + USER_ID + "= '" + mailInfo.getUserId() + "'";
			int rs = execute(sql, SqlType.UPDATE);
			System.out.println("結果" + rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataBaseException(ErrorCode.DB_ACCESS_ERROR, TABLE_NAME + "テーブルへのアクセスに失敗しました");
		} finally {
			close();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create(MailInfo mailInfo) throws DuplicateKeyException, DataBaseException {

		logger.info(mailInfo);

		try {
			connect();
			String sql = "INSERT INTO " + TABLE_NAME +" VALUES ("
					+ "'" + mailInfo.getUserId() + "', "
					+ "'" + mailInfo.getMailAddress() + "', "
					+ "'" + mailInfo.getMailPassword() + "', "
					+ "'" + DateUtil.toString(DateUtil.getSysDate(), DateFormatPattern.YYYYMMDD_HHMMSS) + "', "
					+ "'" + DateUtil.toString(DateUtil.getSysDate(), DateFormatPattern.YYYYMMDD_HHMMSS) + "'"
					+ ");";
			int rs = execute(sql, SqlType.INSERT);
			System.out.println("結果" + rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataBaseException(ErrorCode.DB_ACCESS_ERROR, TABLE_NAME + "テーブルへのアクセスに失敗しました");
		} finally {
			close();
		}
	}

}
