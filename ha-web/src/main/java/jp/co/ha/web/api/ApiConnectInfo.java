package jp.co.ha.web.api;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringJoiner;
import java.util.function.Supplier;

/**
 * API接続に必要な情報を渡す用のBeanクラス<br>
 * 設定情報は以下とする
 * <ul>
 * <li>文字コード(デフォルトでUTF-8)</li>
 * <li>リクエストヘッダーのMap</li>
 * <li>クエリパラメータのMap</li>
 * </ul>
 *
 * @version 1.0.0
 */
public class ApiConnectInfo {

    /** 健康管理API リクエストヘッダー:API-KEY */
    public static final String X_API_KEY = "Api-Key";
    /** 健康情報計算API リクエストヘッダー:X-NODE-TOKEN */
    public static final String X_NODE_TOKEN = "X-NODE-TOKEN";

    /** URLSupplier */
    private Supplier<String> urlSupplier;
    /** 文字コード */
    private Charset charset = Charset.forName("UTF-8");
    /** リクエストヘッダMap */
    private Map<String, String> headerMap = new HashMap<>();
    /** クエリパラメータMap */
    private Map<String, String> urlParameter = new HashMap<>();
    /** HTTPステータス */
    private Integer httpStatus;

    /**
     * urlSupplierを返す
     *
     * @return urlSupplier
     */
    public Supplier<String> getUrlSupplier() {
        return urlSupplier;
    }

    /**
     * urlSupplierを設定する
     *
     * @param urlSupplier
     *     URLSupplier
     */
    public void setUrlSupplier(Supplier<String> urlSupplier) {
        this.urlSupplier = urlSupplier;
    }

    /**
     * urlSupplierを設定する
     *
     * @param urlSupplier
     *     URLSupplier
     * @return ApiConnectInfo
     */
    public ApiConnectInfo withUrlSupplier(Supplier<String> urlSupplier) {
        this.urlSupplier = urlSupplier;
        return this;
    }

    /**
     * charsetを返す
     *
     * @return charset
     */
    public Charset getCharset() {
        return charset;
    }

    /**
     * charsetを設定する
     *
     * @param charset
     *     文字コード
     */
    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    /**
     * charsetを設定する
     *
     * @param charset
     *     文字コード
     */
    public void setCharset(String charset) {
        this.charset = Charset.forName(charset);
    }

    /**
     * charsetを設定する
     *
     * @param charset
     *     文字コード
     * @return ApiConnectInfo
     */
    public ApiConnectInfo withCharset(Charset charset) {
        this.charset = charset;
        return this;
    }

    /**
     * クエリパラメータを返す
     *
     * @return qureyString
     */
    public String getQureyString() {

        if (urlParameter.isEmpty()) {
            // クエリパラメータを設定していない場合
            return "";
        }

        StringJoiner sj = new StringJoiner("&");
        for (Entry<String, String> entry : urlParameter.entrySet()) {
            sj.add(entry.getKey() + "=" + entry.getValue());
        }
        return "?" + sj.toString();
    }

    /**
     * headerMapを返す
     *
     * @return headerMap
     */
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    /**
     * ヘッダーを追加する
     *
     * @param key
     *     パラメータキー
     * @param value
     *     パラメータ値
     */
    public void addHeader(String key, String value) {
        this.headerMap.put(key, value);
    }

    /**
     * ヘッダーを追加する
     *
     * @param key
     *     パラメータキー
     * @param value
     *     パラメータ値
     * @return ApiConnectInfo
     */
    public ApiConnectInfo withHeader(String key, String value) {
        this.headerMap.put(key, value);
        return this;
    }

    /**
     * パラメータを追加する
     *
     * @param key
     *     パラメータキー
     * @param value
     *     パラメータ値
     */
    public void addQueryParameter(String key, String value) {
        this.urlParameter.put(key, value);
    }

    /**
     * パラメータを追加する
     *
     * @param key
     *     パラメータキー
     * @param value
     *     パラメータ値
     * @return ApiConnectInfo
     */
    public ApiConnectInfo withQueryParameter(String key, String value) {
        this.urlParameter.put(key, value);
        return this;
    }

    /**
     * httpStatusを返す
     *
     * @return httpStatus
     */
    public Integer getHttpStatus() {
        return httpStatus;
    }

    /**
     * httpStatusを設定する
     *
     * @param httpStatus
     *     HTTPステータス
     */
    public void setHttpStatus(Integer httpStatus) {
        this.httpStatus = httpStatus;
    }

}
