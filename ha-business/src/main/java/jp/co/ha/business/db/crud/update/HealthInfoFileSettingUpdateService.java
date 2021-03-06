package jp.co.ha.business.db.crud.update;

import jp.co.ha.db.entity.HealthInfoFileSetting;

/**
 * 健康情報ファイル設定更新サービスインターフェース
 *
 * @version 1.0.0
 */
public interface HealthInfoFileSettingUpdateService {

    /**
     * 指定した健康情報ファイル設定を更新する
     *
     * @param entity
     *     健康情報ファイル設定
     */
    void update(HealthInfoFileSetting entity);

}
