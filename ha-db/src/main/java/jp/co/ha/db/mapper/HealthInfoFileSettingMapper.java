package jp.co.ha.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.co.ha.db.entity.HealthInfoFileSetting;
import jp.co.ha.db.entity.HealthInfoFileSettingExample;

/**
 * 健康情報ファイル設定情報Mapper
 *
 * @since 1.0
 */
public interface HealthInfoFileSettingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table health_info_file_setting
	 *
	 * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
	 */
	long countByExample(HealthInfoFileSettingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table health_info_file_setting
	 *
	 * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
	 */
	int deleteByExample(HealthInfoFileSettingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table health_info_file_setting
	 *
	 * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
	 */
	int deleteByPrimaryKey(String userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table health_info_file_setting
	 *
	 * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
	 */
	int insert(HealthInfoFileSetting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table health_info_file_setting
	 *
	 * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
	 */
	int insertSelective(HealthInfoFileSetting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table health_info_file_setting
	 *
	 * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
	 */
	List<HealthInfoFileSetting> selectByExample(HealthInfoFileSettingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table health_info_file_setting
	 *
	 * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
	 */
	HealthInfoFileSetting selectByPrimaryKey(String userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table health_info_file_setting
	 *
	 * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
	 */
	int updateByExampleSelective(@Param("record") HealthInfoFileSetting record,
			@Param("example") HealthInfoFileSettingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table health_info_file_setting
	 *
	 * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
	 */
	int updateByExample(@Param("record") HealthInfoFileSetting record,
			@Param("example") HealthInfoFileSettingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table health_info_file_setting
	 *
	 * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
	 */
	int updateByPrimaryKeySelective(HealthInfoFileSetting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table health_info_file_setting
	 *
	 * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
	 */
	int updateByPrimaryKey(HealthInfoFileSetting record);
}