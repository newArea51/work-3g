package jp.co.ha.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import jp.co.ha.common.log.annotation.Ignore;

/**
 * 健康情報ファイル設定Entity<br>
 *
 */
@Entity
@Table(name = "HEALTH_INFO_FILE_SETTING")
public class HealthInfoFileSetting implements Serializable {

	/** シリアルバージョンUID */
	@Ignore
	private static final long serialVersionUID = 1L;

	/** ユーザID */
	@Id
	@Column(name = "USER_ID", nullable = false, length = 16)
	private String userId;
	/** ヘッダ利用有無フラグ */
	@Column(name = "HEADER_FLAG", nullable = true)
	private String headerFlag;
	/** フッタ利用有無フラグ */
	@Column(name = "FOOTER_FLAG", nullable = true)
	private String footerFlag;
	/** マスク利用有無フラグ */
	@Column(name = "MASK_FLAG", nullable = true)
	private String maskFlag;
	/** 囲み文字利用有無フラグ */
	@Column(name = "ENCLOSURE_CHAR_FLAG", nullable = true)
	private String enclosureCharFlag;
	/** 更新日時 */
	@Column(name = "UPDATE_DATE", nullable = true)
	private Date updateDate;
	/** 登録日時 */
	@Column(name = "REG_DATE", nullable = false)
	private Date regDate;

	/**
	 * userIdを返す<br>
	 *
	 * @return userId ユーザID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * userIdを設定する<br>
	 *
	 * @param userId
	 *     ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * headerFlagを返す<br>
	 *
	 * @return headerFlag ヘッダ利用フラグ
	 */
	public String getHeaderFlag() {
		return headerFlag;
	}

	/**
	 * headerFlagを設定する<br>
	 *
	 * @param headerFlag
	 *     ヘッダ利用フラグ
	 */
	public void setHeaderFlag(String headerFlag) {
		this.headerFlag = headerFlag;
	}

	/**
	 * footerFlagを返す<br>
	 *
	 * @return footerFlag フッタ利用フラグ
	 */
	public String getFooterFlag() {
		return footerFlag;
	}

	/**
	 * footerFlagを設定する<br>
	 *
	 * @param footerFlag
	 *     フッタ利用フラグ
	 */
	public void setFooterFlag(String footerFlag) {
		this.footerFlag = footerFlag;
	}

	/**
	 * maskFlagを返す<br>
	 *
	 * @return maskFlag マスクフラグ
	 */
	public String getMaskFlag() {
		return maskFlag;
	}

	/**
	 * maskFlagを設定する<br>
	 *
	 * @param maskFlag
	 *     マスクフラグ
	 */
	public void setMaskFlag(String maskFlag) {
		this.maskFlag = maskFlag;
	}

	/**
	 * enclosureCharFlagを返す<br>
	 *
	 * @return enclosureCharFlag 囲み文字利用有無フラグ
	 */
	public String getEnclosureCharFlag() {
		return enclosureCharFlag;
	}

	/**
	 * enclosureCharFlagを設定する<br>
	 *
	 * @param enclosureCharFlag
	 *     囲み文字利用有無フラグ
	 */
	public void setEnclosureCharFlag(String enclosureCharFlag) {
		this.enclosureCharFlag = enclosureCharFlag;
	}

	/**
	 * updateDateを返す<br>
	 *
	 * @return updateDate 更新日時
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * updateDateを設定する<br>
	 *
	 * @param updateDate
	 *     更新日時
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * regDateを返す<br>
	 *
	 * @return regDate 登録日時
	 */
	public Date getRegDate() {
		return regDate;
	}

	/**
	 * regDateを設定する<br>
	 *
	 * @param regDate
	 *     登録日時
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}