package jp.co.ha.db.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jp.co.ha.common.db.annotation.Crypt;
import jp.co.ha.common.db.annotation.Entity;
import jp.co.ha.common.log.annotation.Ignore;
import jp.co.ha.common.log.annotation.Mask;

/**
 * メール情報Entity
 *
 * @version 1.0.0
 */
@Entity
public class MailInfo extends MailInfoKey implements Serializable {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column mail_info.MAIL_ADDRESS
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    @Mask
    @Crypt
    private String mailAddress;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column mail_info.UPDATE_DATE
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    private LocalDateTime updateDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column mail_info.REG_DATE
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    private LocalDateTime regDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    @Ignore
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column mail_info.MAIL_ADDRESS
     *
     * @return the value of mail_info.MAIL_ADDRESS
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column mail_info.MAIL_ADDRESS
     *
     * @param mailAddress
     *     the value for mail_info.MAIL_ADDRESS
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column mail_info.UPDATE_DATE
     *
     * @return the value of mail_info.UPDATE_DATE
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column mail_info.UPDATE_DATE
     *
     * @param updateDate
     *     the value for mail_info.UPDATE_DATE
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column mail_info.REG_DATE
     *
     * @return the value of mail_info.REG_DATE
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    public LocalDateTime getRegDate() {
        return regDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column mail_info.REG_DATE
     *
     * @param regDate
     *     the value for mail_info.REG_DATE
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mailAddress=").append(mailAddress);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", regDate=").append(regDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
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
        MailInfo other = (MailInfo) that;
        return (this.getUserId() == null ? other.getUserId() == null
                : this.getUserId().equals(other.getUserId()))
                && (this.getMailAddress() == null ? other.getMailAddress() == null
                        : this.getMailAddress().equals(other.getMailAddress()))
                && (this.getUpdateDate() == null ? other.getUpdateDate() == null
                        : this.getUpdateDate().equals(other.getUpdateDate()))
                && (this.getRegDate() == null ? other.getRegDate() == null
                        : this.getRegDate().equals(other.getRegDate()));
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result
                + ((getMailAddress() == null) ? 0 : getMailAddress().hashCode());
        result = prime * result
                + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        return result;
    }
}