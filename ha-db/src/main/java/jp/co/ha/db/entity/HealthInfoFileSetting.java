package jp.co.ha.db.entity;

import java.io.Serializable;
import java.util.Date;

import jp.co.ha.common.db.annotation.Entity;
import jp.co.ha.common.log.annotation.Ignore;

/**
 * 健康情報ファイル設定情報
 *
 * @version 1.0.0
 */
@Entity
public class HealthInfoFileSetting implements Serializable {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column health_info_file_setting.USER_ID
     *
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    private String userId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column health_info_file_setting.HEADER_FLAG
     *
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    private String headerFlag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column health_info_file_setting.FOOTER_FLAG
     *
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    private String footerFlag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column health_info_file_setting.MASK_FLAG
     *
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    private String maskFlag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column health_info_file_setting.ENCLOSURE_CHAR_FLAG
     *
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    private String enclosureCharFlag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column health_info_file_setting.UPDATE_DATE
     *
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    private Date updateDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column health_info_file_setting.REG_DATE
     *
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    private Date regDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table health_info_file_setting
     *
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    @Ignore
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column health_info_file_setting.USER_ID
     *
     * @return the value of health_info_file_setting.USER_ID
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
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
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column health_info_file_setting.HEADER_FLAG
     *
     * @return the value of health_info_file_setting.HEADER_FLAG
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
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
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    public void setHeaderFlag(String headerFlag) {
        this.headerFlag = headerFlag;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column health_info_file_setting.FOOTER_FLAG
     *
     * @return the value of health_info_file_setting.FOOTER_FLAG
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
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
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    public void setFooterFlag(String footerFlag) {
        this.footerFlag = footerFlag;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column health_info_file_setting.MASK_FLAG
     *
     * @return the value of health_info_file_setting.MASK_FLAG
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
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
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    public void setMaskFlag(String maskFlag) {
        this.maskFlag = maskFlag;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column health_info_file_setting.ENCLOSURE_CHAR_FLAG
     *
     * @return the value of health_info_file_setting.ENCLOSURE_CHAR_FLAG
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
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
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    public void setEnclosureCharFlag(String enclosureCharFlag) {
        this.enclosureCharFlag = enclosureCharFlag;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column health_info_file_setting.UPDATE_DATE
     *
     * @return the value of health_info_file_setting.UPDATE_DATE
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
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
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column health_info_file_setting.REG_DATE
     *
     * @return the value of health_info_file_setting.REG_DATE
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
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
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", headerFlag=").append(headerFlag);
        sb.append(", footerFlag=").append(footerFlag);
        sb.append(", maskFlag=").append(maskFlag);
        sb.append(", enclosureCharFlag=").append(enclosureCharFlag);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", regDate=").append(regDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HealthInfoFileSetting other = (HealthInfoFileSetting) that;
        return (this.getUserId() == null ? other.getUserId() == null
                : this.getUserId().equals(other.getUserId()))
                && (this.getHeaderFlag() == null ? other.getHeaderFlag() == null
                        : this.getHeaderFlag().equals(other.getHeaderFlag()))
                && (this.getFooterFlag() == null ? other.getFooterFlag() == null
                        : this.getFooterFlag().equals(other.getFooterFlag()))
                && (this.getMaskFlag() == null ? other.getMaskFlag() == null
                        : this.getMaskFlag().equals(other.getMaskFlag()))
                && (this.getEnclosureCharFlag() == null
                        ? other.getEnclosureCharFlag() == null
                        : this.getEnclosureCharFlag()
                                .equals(other.getEnclosureCharFlag()))
                && (this.getUpdateDate() == null ? other.getUpdateDate() == null
                        : this.getUpdateDate().equals(other.getUpdateDate()))
                && (this.getRegDate() == null ? other.getRegDate() == null
                        : this.getRegDate().equals(other.getRegDate()));
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sat Dec 28 09:43:41 GMT+09:00 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result
                + ((getHeaderFlag() == null) ? 0 : getHeaderFlag().hashCode());
        result = prime * result
                + ((getFooterFlag() == null) ? 0 : getFooterFlag().hashCode());
        result = prime * result
                + ((getMaskFlag() == null) ? 0 : getMaskFlag().hashCode());
        result = prime * result + ((getEnclosureCharFlag() == null) ? 0
                : getEnclosureCharFlag().hashCode());
        result = prime * result
                + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        return result;
    }
}