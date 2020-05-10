package jp.co.ha.business.aws;

import org.springframework.stereotype.Component;

import com.amazonaws.regions.Regions;

/**
 * AWSの設定情報保持クラス<br>
 * <ul>
 * <li>リージョン：設定ファイルで東京を設定</li>
 * <li>バケット名：環境毎にバケットを設定</li>
 * <li>S3タイムアウト：設定ファイルで10秒を設定</li>
 * </ul>
 *
 * @version 1.0.0
 */
@Component
public class AwsConfig {
    /** アクセスキー */
    private String accesskey;
    /** シークレットアクセスキー */
    private String secretAccesskey;
    /** リージョン */
    private Regions region;
    /** バケット名 */
    private String backet;
    /** S3タイムアウト */
    private int timeout;

    /**
     * accesskeyを返す
     *
     * @return accesskey
     */
    public String getAccesskey() {
        return accesskey;
    }

    /**
     * accesskeyを設定する
     *
     * @param accesskey
     *     アクセスキー
     */
    public void setAccesskey(String accesskey) {
        this.accesskey = accesskey;
    }

    /**
     * secretAccesskeyを返す
     *
     * @return secretAccesskey
     */
    public String getSecretAccesskey() {
        return secretAccesskey;
    }

    /**
     * secretAccesskeyを設定する
     *
     * @param secretAccesskey
     *     シークレットアクセスキー
     */
    public void setSecretAccesskey(String secretAccesskey) {
        this.secretAccesskey = secretAccesskey;
    }

    /**
     * {@linkplain Regions}を返す
     *
     * @return region
     */
    public Regions getRegion() {
        return region;
    }

    /**
     * regionを設定する
     *
     * @param region
     *     リージョン
     */
    public void setRegion(String region) {
        this.region = Regions.fromName(region);
    }

    /**
     * backetを返す
     *
     * @return backet
     */
    public String getBacket() {
        return backet;
    }

    /**
     * backetを設定する
     *
     * @param backet
     *     バケット
     */
    public void setBacket(String backet) {
        this.backet = backet;
    }

    /**
     * timeoutを返す
     *
     * @return timeout
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * timeoutを設定する
     *
     * @param timeout
     *     S3タイムアウト
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

}
