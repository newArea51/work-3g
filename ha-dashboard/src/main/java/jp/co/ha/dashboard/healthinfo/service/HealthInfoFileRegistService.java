package jp.co.ha.dashboard.healthinfo.service;

import java.util.List;

import jp.co.ha.business.io.file.csv.model.HealthInfoCsvUploadModel;
import jp.co.ha.common.exception.BaseException;

/**
 * 健康情報ファイル入力画面サービスインターフェース
 * 
 * @since 1.0
 */
public interface HealthInfoFileRegistService {

	/**
	 * 健康情報CSVアップロードモデルリストに不正なデータが含まれていないかチェックを行う
	 *
	 * @param modelList
	 *     健康情報CSVアップロードモデルリスト
	 * @param userId
	 *     ユーザID
	 * @throws BaseException
	 *     基底例外
	 */
	void formatCheck(List<HealthInfoCsvUploadModel> modelList, String userId) throws BaseException;

	/**
	 * 指定されたモデルリストの登録処理を行う
	 *
	 * @param modelList
	 *     健康情報CSVアップロードモデルリスト
	 * @param userId
	 *     ユーザID
	 * @throws BaseException
	 *     基底例外
	 */
	void regist(List<HealthInfoCsvUploadModel> modelList, String userId) throws BaseException;

}