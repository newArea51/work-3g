package jp.co.ha.db.entity;

import java.io.Serializable;
import java.util.Date;

import jp.co.ha.common.log.annotation.Ignore;

public class HealthInfoFileSetting implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info_file_setting.USER_ID
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info_file_setting.HEADER_FLAG
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private String headerFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info_file_setting.FOOTER_FLAG
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private String footerFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info_file_setting.MASK_FLAG
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private String maskFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info_file_setting.ENCLOSURE_CHAR_FLAG
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private String enclosureCharFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info_file_setting.UPDATE_DATE
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private Date updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column health_info_file_setting.REG_DATE
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	private Date regDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table health_info_file_setting
	 *
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	@Ignore
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info_file_setting.USER_ID
	 *
	 * @return the value of health_info_file_setting.USER_ID
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info_file_setting.USER_ID
	 *
	 * @param userId
	 *     the value for health_info_file_setting.USER_ID
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info_file_setting.HEADER_FLAG
	 *
	 * @return the value of health_info_file_setting.HEADER_FLAG
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public String getHeaderFlag() {
		return headerFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info_file_setting.HEADER_FLAG
	 *
	 * @param headerFlag
	 *     the value for health_info_file_setting.HEADER_FLAG
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setHeaderFlag(String headerFlag) {
		this.headerFlag = headerFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info_file_setting.FOOTER_FLAG
	 *
	 * @return the value of health_info_file_setting.FOOTER_FLAG
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public String getFooterFlag() {
		return footerFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info_file_setting.FOOTER_FLAG
	 *
	 * @param footerFlag
	 *     the value for health_info_file_setting.FOOTER_FLAG
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setFooterFlag(String footerFlag) {
		this.footerFlag = footerFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info_file_setting.MASK_FLAG
	 *
	 * @return the value of health_info_file_setting.MASK_FLAG
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public String getMaskFlag() {
		return maskFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info_file_setting.MASK_FLAG
	 *
	 * @param maskFlag
	 *     the value for health_info_file_setting.MASK_FLAG
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setMaskFlag(String maskFlag) {
		this.maskFlag = maskFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info_file_setting.ENCLOSURE_CHAR_FLAG
	 *
	 * @return the value of health_info_file_setting.ENCLOSURE_CHAR_FLAG
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public String getEnclosureCharFlag() {
		return enclosureCharFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info_file_setting.ENCLOSURE_CHAR_FLAG
	 *
	 * @param enclosureCharFlag
	 *     the value for health_info_file_setting.ENCLOSURE_CHAR_FLAG
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setEnclosureCharFlag(String enclosureCharFlag) {
		this.enclosureCharFlag = enclosureCharFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info_file_setting.UPDATE_DATE
	 *
	 * @return the value of health_info_file_setting.UPDATE_DATE
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info_file_setting.UPDATE_DATE
	 *
	 * @param updateDate
	 *     the value for health_info_file_setting.UPDATE_DATE
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column health_info_file_setting.REG_DATE
	 *
	 * @return the value of health_info_file_setting.REG_DATE
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public Date getRegDate() {
		return regDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column health_info_file_setting.REG_DATE
	 *
	 * @param regDate
	 *     the value for health_info_file_setting.REG_DATE
	 * @mbg.generated Sun Nov 04 17:02:28 JST 2018
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}