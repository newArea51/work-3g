package jp.co.ha.db.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jp.co.ha.common.log.annotation.Ignore;
import jp.co.ha.common.log.annotation.Mask;

public class HealthInfo implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info.HEALTH_INFO_ID
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private Integer healthInfoId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info.USER_ID
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info.HEIGHT
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	@Mask
	private BigDecimal height;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info.WEIGHT
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	@Mask
	private BigDecimal weight;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info.BMI
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	@Mask
	private BigDecimal bmi;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info.STANDARD_WEIGHT
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	@Mask
	private BigDecimal standardWeight;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info.USER_STATUS
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private String userStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info.UPDATE_DATE
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private Date updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info.REG_DATE
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private Date regDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table health_info
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	@Ignore
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info.HEALTH_INFO_ID
	 *
	 * @return the value of health_info.HEALTH_INFO_ID
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public Integer getHealthInfoId() {
		return healthInfoId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info.HEALTH_INFO_ID
	 *
	 * @param healthInfoId
	 *     the value for health_info.HEALTH_INFO_ID
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setHealthInfoId(Integer healthInfoId) {
		this.healthInfoId = healthInfoId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info.USER_ID
	 *
	 * @return the value of health_info.USER_ID
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info.USER_ID
	 *
	 * @param userId
	 *     the value for health_info.USER_ID
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info.HEIGHT
	 *
	 * @return the value of health_info.HEIGHT
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public BigDecimal getHeight() {
		return height;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info.HEIGHT
	 *
	 * @param height
	 *     the value for health_info.HEIGHT
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info.WEIGHT
	 *
	 * @return the value of health_info.WEIGHT
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public BigDecimal getWeight() {
		return weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info.WEIGHT
	 *
	 * @param weight
	 *     the value for health_info.WEIGHT
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info.BMI
	 *
	 * @return the value of health_info.BMI
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public BigDecimal getBmi() {
		return bmi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info.BMI
	 *
	 * @param bmi
	 *     the value for health_info.BMI
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setBmi(BigDecimal bmi) {
		this.bmi = bmi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info.STANDARD_WEIGHT
	 *
	 * @return the value of health_info.STANDARD_WEIGHT
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public BigDecimal getStandardWeight() {
		return standardWeight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info.STANDARD_WEIGHT
	 *
	 * @param standardWeight
	 *     the value for health_info.STANDARD_WEIGHT
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setStandardWeight(BigDecimal standardWeight) {
		this.standardWeight = standardWeight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info.USER_STATUS
	 *
	 * @return the value of health_info.USER_STATUS
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public String getUserStatus() {
		return userStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info.USER_STATUS
	 *
	 * @param userStatus
	 *     the value for health_info.USER_STATUS
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info.UPDATE_DATE
	 *
	 * @return the value of health_info.UPDATE_DATE
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info.UPDATE_DATE
	 *
	 * @param updateDate
	 *     the value for health_info.UPDATE_DATE
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info.REG_DATE
	 *
	 * @return the value of health_info.REG_DATE
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public Date getRegDate() {
		return regDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info.REG_DATE
	 *
	 * @param regDate
	 *     the value for health_info.REG_DATE
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}