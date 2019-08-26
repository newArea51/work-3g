package jp.co.ha.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.co.ha.db.entity.SystemEnvironmentMt;
import jp.co.ha.db.entity.SystemEnvironmentMtExample;

public interface SystemEnvironmentMtMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table system_environment_mt
	 *
	 * @mbg.generated Sat May 25 11:18:24 GMT+09:00 2019
	 */
	long countByExample(SystemEnvironmentMtExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table system_environment_mt
	 *
	 * @mbg.generated Sat May 25 11:18:24 GMT+09:00 2019
	 */
	int deleteByExample(SystemEnvironmentMtExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table system_environment_mt
	 *
	 * @mbg.generated Sat May 25 11:18:24 GMT+09:00 2019
	 */
	int deleteByPrimaryKey(String environmentId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table system_environment_mt
	 *
	 * @mbg.generated Sat May 25 11:18:24 GMT+09:00 2019
	 */
	int insert(SystemEnvironmentMt record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table system_environment_mt
	 *
	 * @mbg.generated Sat May 25 11:18:24 GMT+09:00 2019
	 */
	int insertSelective(SystemEnvironmentMt record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table system_environment_mt
	 *
	 * @mbg.generated Sat May 25 11:18:24 GMT+09:00 2019
	 */
	List<SystemEnvironmentMt> selectByExample(SystemEnvironmentMtExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table system_environment_mt
	 *
	 * @mbg.generated Sat May 25 11:18:24 GMT+09:00 2019
	 */
	SystemEnvironmentMt selectByPrimaryKey(String environmentId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table system_environment_mt
	 *
	 * @mbg.generated Sat May 25 11:18:24 GMT+09:00 2019
	 */
	int updateByExampleSelective(@Param("record") SystemEnvironmentMt record,
			@Param("example") SystemEnvironmentMtExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table system_environment_mt
	 *
	 * @mbg.generated Sat May 25 11:18:24 GMT+09:00 2019
	 */
	int updateByExample(@Param("record") SystemEnvironmentMt record,
			@Param("example") SystemEnvironmentMtExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table system_environment_mt
	 *
	 * @mbg.generated Sat May 25 11:18:24 GMT+09:00 2019
	 */
	int updateByPrimaryKeySelective(SystemEnvironmentMt record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table system_environment_mt
	 *
	 * @mbg.generated Sat May 25 11:18:24 GMT+09:00 2019
	 */
	int updateByPrimaryKey(SystemEnvironmentMt record);
}