package jp.co.ha.web.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import jp.co.ha.common.web.BaseForm;

/**
 * 結果検索フォームクラス<br>
 *
 */
public class ResultSearchForm implements BaseForm {

	/** シリアルバージョンUID */
	private static final long serialVersionUID = 1L;

	/** データID */
	private String dataId;
	/** 登録日直接指定フラグ */
	@NotEmpty(message = "登録日直接指定フラグが未入力です")
	@Pattern(regexp = "^[0-9]*$", message = "登録日直接指定フラグが半角数字でありません")
	@Size(min = 1, max = 1, message = "登録日直接指定フラグが範囲外の値です")
	private String regDateSelectFlag;
//	@NotEmpty(message = "登録日(開始)が未入力です")
	/** 登録日(開始) */
	private String fromRegDate;
	/** 登録日(終了) */
	private String toRegDate;

	/**
	 * dataIdを返す<br>
	 *
	 * @return dataId dataId
	 */
	public String getDataId() {
		return dataId;
	}

	/**
	 * dataIdを設定する<br>
	 *
	 * @param dataId
	 *            dataId
	 */
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	/**
	 * fromRegDateを返す<br>
	 *
	 * @return fromRegDate fromRegDate
	 */
	public String getFromRegDate() {
		return fromRegDate;
	}

	/**
	 * fromRegDateを設定する<br>
	 *
	 * @param fromRegDate
	 *            fromRegDate
	 */
	public void setFromRegDate(String fromRegDate) {
		this.fromRegDate = fromRegDate;
	}

	/**
	 * toRegDateを返す<br>
	 *
	 * @return toRegDate toRegDate
	 */
	public String getToRegDate() {
		return toRegDate;
	}

	/**
	 * toRegDateを設定する<br>
	 *
	 * @param toRegDate
	 *            toRegDate
	 */
	public void setToRegDate(String toRegDate) {
		this.toRegDate = toRegDate;
	}

	/**
	 * regDateSelectFlagを返す<br>
	 *
	 * @return regDateSelectFlag 登録日直接指定フラグ
	 */
	public String getRegDateSelectFlag() {
		return regDateSelectFlag;
	}

	/**
	 * regDateSelectFlagを設定する<br>
	 *
	 * @param regDateSelectFlag
	 *            登録日直接指定フラグ
	 */
	public void setRegDateSelectFlag(String regDateSelectFlag) {
		this.regDateSelectFlag = regDateSelectFlag;
	}

}
