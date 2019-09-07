package jp.co.ha.dashboard.view;

import jp.co.ha.web.view.BaseView;

/**
 * 健康管理View列挙
 *
 */
public enum DashboardView implements BaseView {

	/** ログイン画面 */
	LOGIN("login/index"),
	/** トップ画面 */
	TOP("login/top"),
	/** エラー画面 */
	ERROR("error/index"),

	/** 健康情報入力画面 */
	HEALTH_INFO_INPUT("healthInfo/input"),
	/** 健康情報入力確認画面 */
	HEALTH_INFO_CONFIRM("healthInfo/confirm"),
	/** 健康情報入力完了画面 */
	HEALTH_INFO_COMPLETE("healthInfo/complete"),

	/** 健康情報照会画面 */
	HEALTH_INFO_REFFERNCE("healthInfoReference/index"),

	/** アカウント設定入力画面 */
	ACCOUNT_SETTING_INPUT("accountSetting/input"),
	/** アカウント設定入力確認画面 */
	ACCOUNT_SETTING_CONFIRM("accountSetting/confirm"),
	/** アカウント設定入力完了画面 */
	ACCOUNT_SETTING_COMPLETE("accountSetting/complete"),

	/** アカウント作成入力画面 */
	ACCOUNT_REGIST_INPUT("accountRegist/input"),
	/** アカウント作成入力確認画面 */
	ACCOUNT_REGIST_CONFIRM("accountRegist/confirm"),
	/** アカウント作成入力完了画面 */
	ACCOUNT_REGIST_COMPLETE("accountRegist/complete"),

	/** 健康情報ファイル入力画面 */
	HEALTH_INFO_FILE_INPUT("healthInfoFile/input"),
	/** 健康情報ファイル確認画面 */
	HEALTH_INFO_FILE_CONFIRM("healthInfoFile/confirm"),
	/** 健康情報ファイル入力完了画面 */
	HEALTH_INFO_FILE_COMPLETE("healthInfoFile/complete"),

	/** 健康情報ファイル設定入力画面 */
	HEALTH_INFO_FILE_SETTING_INPUT("healthInfoFileSetting/input"),
	/** 健康情報ファイル設定確認画面 */
	HEALTH_INFO_FILE_SETTING_CONFIRM("healthInfoFileSetting/confirm"),
	/** 健康情報ファイル設定入力完了画面 */
	HEALTH_INFO_FILE_SETTING_COMPLETE("healthInfoFileSetting/complete"),

	/** カロリー計算画面 */
	CALORIE_CALC("calorieCalc/index");

	/** パス名 */
	private String name;

	/**
	 * コンストラクタ
	 * 
	 * @param name
	 *     パス名
	 */
	private DashboardView(String name) {
		this.name = name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return this.name;
	}

}
