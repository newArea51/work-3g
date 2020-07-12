package jp.co.ha.business.api.node.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import jp.co.ha.common.type.BaseEnum;

/**
 * 基底健康情報計算APIのレスポンスクラス
 *
 * @version 1.0.0
 */
public abstract class BaseHealthinfoCalcResponse {

    /** 処理結果 */
    @JsonProperty("result")
    private Result result;
    /** 処理詳細 */
    @JsonProperty("detail")
    private String detail;

    /**
     * 処理結果の列挙
     *
     * @version 1.0.0
     */
    public static enum Result implements BaseEnum {
        /**  */
        SUCCESS("0"),
        /**  */
        FAILURE("1");

        /** 値 */
        private String value;

        /**
         * コンストラクタ
         *
         * @param value
         *     値
         */
        private Result(String value) {
            this.value = value;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public String getValue() {
            return this.value;
        }

        /**
         * Statusを返す
         *
         * @param value
         *     値
         * @return Status
         */
        public static Result of(String value) {
            return BaseEnum.of(Result.class, value);
        }

    }

    /**
     * resultを返す
     *
     * @return result
     */
    public Result getResult() {
        return result;
    }

    /**
     * resultを設定する
     *
     * @param result
     *     処理結果
     */
    public void setResult(Result result) {
        this.result = result;
    }

    /**
     * detailを返す
     *
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * detailを設定する
     *
     * @param detail
     *     処理詳細
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

}
