package jp.co.ha.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.co.ha.db.entity.HealthInfo;
import jp.co.ha.db.entity.HealthInfoExample;
import jp.co.ha.db.entity.HealthInfoKey;

/**
 * 健康情報Mapper
 *
 * @version 1.0.0
 */
public interface HealthInfoMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    long countByExample(HealthInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    int deleteByExample(HealthInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    int deleteByPrimaryKey(HealthInfoKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    int insert(HealthInfo record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    int insertSelective(HealthInfo record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    List<HealthInfo> selectByExample(HealthInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    HealthInfo selectByPrimaryKey(HealthInfoKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    int updateByExampleSelective(@Param("record") HealthInfo record,
            @Param("example") HealthInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    int updateByExample(@Param("record") HealthInfo record,
            @Param("example") HealthInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    int updateByPrimaryKeySelective(HealthInfo record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    int updateByPrimaryKey(HealthInfo record);

}