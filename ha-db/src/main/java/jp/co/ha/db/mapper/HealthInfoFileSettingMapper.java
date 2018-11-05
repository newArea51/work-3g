package jp.co.ha.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.co.ha.db.entity.HealthInfoFileSetting;
import jp.co.ha.db.entity.HealthInfoFileSettingExample;

public interface HealthInfoFileSettingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table health_info_file_setting
	 * @mbg.generated  Mon Nov 05 12:25:08 JST 2018
	 */
	long countByExample(HealthInfoFileSettingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table health_info_file_setting
	 * @mbg.generated  Mon Nov 05 12:25:08 JST 2018
	 */
	int deleteByExample(HealthInfoFileSettingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table health_info_file_setting
	 * @mbg.generated  Mon Nov 05 12:25:08 JST 2018
	 */
	int deleteByPrimaryKey(String userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table health_info_file_setting
	 * @mbg.generated  Mon Nov 05 12:25:08 JST 2018
	 */
	int insert(HealthInfoFileSetting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table health_info_file_setting
	 * @mbg.generated  Mon Nov 05 12:25:08 JST 2018
	 */
	int insertSelective(HealthInfoFileSetting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table health_info_file_setting
	 * @mbg.generated  Mon Nov 05 12:25:08 JST 2018
	 */
	List<HealthInfoFileSetting> selectByExample(HealthInfoFileSettingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table health_info_file_setting
	 * @mbg.generated  Mon Nov 05 12:25:08 JST 2018
	 */
	HealthInfoFileSetting selectByPrimaryKey(String userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table health_info_file_setting
	 * @mbg.generated  Mon Nov 05 12:25:08 JST 2018
	 */
	int updateByExampleSelective(@Param("record") HealthInfoFileSetting record,
			@Param("example") HealthInfoFileSettingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table health_info_file_setting
	 * @mbg.generated  Mon Nov 05 12:25:08 JST 2018
	 */
	int updateByExample(@Param("record") HealthInfoFileSetting record,
			@Param("example") HealthInfoFileSettingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table health_info_file_setting
	 * @mbg.generated  Mon Nov 05 12:25:08 JST 2018
	 */
	int updateByPrimaryKeySelective(HealthInfoFileSetting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table health_info_file_setting
	 * @mbg.generated  Mon Nov 05 12:25:08 JST 2018
	 */
	int updateByPrimaryKey(HealthInfoFileSetting record);
}