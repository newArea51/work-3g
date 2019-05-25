package jp.co.ha.db.entity;

import java.io.Serializable;
import java.util.Date;

import jp.co.ha.common.db.annotation.Entity;
import jp.co.ha.common.log.annotation.Ignore;
import jp.co.ha.common.log.annotation.Mask;

@Entity
public class Account implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column account.USER_ID
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column account.PASSWORD
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	@Mask
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column account.DELETE_FLAG
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	private String deleteFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column account.PASSWORD_EXPIRE
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	private Date passwordExpire;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column account.REMARKS
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	private String remarks;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column account.UPDATE_DATE
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	private Date updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column account.REG_DATE
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	private Date regDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column account.API_KEY
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	@Mask
	private String apiKey;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table account
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	@Ignore
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column account.USER_ID
	 *
	 * @return the value of account.USER_ID
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column account.USER_ID
	 *
	 * @param userId
	 *     the value for account.USER_ID
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column account.PASSWORD
	 *
	 * @return the value of account.PASSWORD
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column account.PASSWORD
	 *
	 * @param password
	 *     the value for account.PASSWORD
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column account.DELETE_FLAG
	 *
	 * @return the value of account.DELETE_FLAG
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public String getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column account.DELETE_FLAG
	 *
	 * @param deleteFlag
	 *     the value for account.DELETE_FLAG
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column account.PASSWORD_EXPIRE
	 *
	 * @return the value of account.PASSWORD_EXPIRE
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public Date getPasswordExpire() {
		return passwordExpire;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column account.PASSWORD_EXPIRE
	 *
	 * @param passwordExpire
	 *     the value for account.PASSWORD_EXPIRE
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public void setPasswordExpire(Date passwordExpire) {
		this.passwordExpire = passwordExpire;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column account.REMARKS
	 *
	 * @return the value of account.REMARKS
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column account.REMARKS
	 *
	 * @param remarks
	 *     the value for account.REMARKS
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column account.UPDATE_DATE
	 *
	 * @return the value of account.UPDATE_DATE
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column account.UPDATE_DATE
	 *
	 * @param updateDate
	 *     the value for account.UPDATE_DATE
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column account.REG_DATE
	 *
	 * @return the value of account.REG_DATE
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public Date getRegDate() {
		return regDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column account.REG_DATE
	 *
	 * @param regDate
	 *     the value for account.REG_DATE
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column account.API_KEY
	 *
	 * @return the value of account.API_KEY
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column account.API_KEY
	 *
	 * @param apiKey
	 *     the value for account.API_KEY
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table account
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", userId=").append(userId);
		sb.append(", password=").append(password);
		sb.append(", deleteFlag=").append(deleteFlag);
		sb.append(", passwordExpire=").append(passwordExpire);
		sb.append(", remarks=").append(remarks);
		sb.append(", updateDate=").append(updateDate);
		sb.append(", regDate=").append(regDate);
		sb.append(", apiKey=").append(apiKey);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table account
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
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
		Account other = (Account) that;
		return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
				&& (this.getPassword() == null ? other.getPassword() == null
						: this.getPassword().equals(other.getPassword()))
				&& (this.getDeleteFlag() == null ? other.getDeleteFlag() == null
						: this.getDeleteFlag().equals(other.getDeleteFlag()))
				&& (this.getPasswordExpire() == null ? other.getPasswordExpire() == null
						: this.getPasswordExpire().equals(other.getPasswordExpire()))
				&& (this.getRemarks() == null ? other.getRemarks() == null
						: this.getRemarks().equals(other.getRemarks()))
				&& (this.getUpdateDate() == null ? other.getUpdateDate() == null
						: this.getUpdateDate().equals(other.getUpdateDate()))
				&& (this.getRegDate() == null ? other.getRegDate() == null
						: this.getRegDate().equals(other.getRegDate()))
				&& (this.getApiKey() == null ? other.getApiKey() == null : this.getApiKey().equals(other.getApiKey()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table account
	 *
	 * @mbg.generated Mon Nov 05 12:25:08 JST 2018
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
		result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
		result = prime * result + ((getPasswordExpire() == null) ? 0 : getPasswordExpire().hashCode());
		result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
		result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
		result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
		result = prime * result + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
		return result;
	}
}