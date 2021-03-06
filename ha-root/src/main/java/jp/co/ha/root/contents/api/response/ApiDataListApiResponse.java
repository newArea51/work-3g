package jp.co.ha.root.contents.api.response;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import jp.co.ha.root.base.BaseRootApiResponse;
import jp.co.ha.web.form.BaseApiResponse;

/**
 * API通信情報一覧取得APIレスポンスクラス
 *
 * @version 1.0.0
 */
public class ApiDataListApiResponse extends BaseRootApiResponse
        implements BaseApiResponse {

    /** API通信情報リスト */
    @JsonProperty("api_data_list")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ApiData> apiDataList;

    /**
     * apiDataListを返す
     *
     * @return apiDataList
     */
    public List<ApiData> getApiDataList() {
        return apiDataList;
    }

    /**
     * apiDataListを設定する
     *
     * @param apiDataList
     *     API通信情報リスト
     */
    public void setApiDataList(List<ApiData> apiDataList) {
        this.apiDataList = apiDataList;
    }

    /**
     * API通信情報
     *
     * @version 1.0.0
     */
    public static class ApiData {

        /** API通信情報ID */
        @JsonProperty("seq_api_communication_data_id")
        private Integer seqApiCommunicationDataId;
        /** API名 */
        @JsonProperty("api_name")
        private String apiName;
        /** ユーザID */
        @JsonProperty("seq_user_id")
        private Integer seqUserId;
        /** HTTPステータス */
        @JsonProperty("http_status")
        private String httpStatus;
        /** 処理結果 */
        @JsonProperty("result")
        private String result;
        /** 詳細 */
        @JsonProperty("detail")
        private String detail;
        /** APIリクエスト日時 */
        @JsonProperty("request_date")
        @JsonSerialize(using = LocalDateTimeSerializer.class)
        @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "Asia/Tokyo")
        private LocalDateTime requestDate;
        /** APIレスポンス日時 */
        @JsonProperty("response_date")
        @JsonSerialize(using = LocalDateTimeSerializer.class)
        @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "Asia/Tokyo")
        private LocalDateTime responseDate;

        /**
         * seqApiCommunicationDataIdを返す
         *
         * @return seqApiCommunicationDataId
         */
        public Integer getSeqApiCommunicationDataId() {
            return seqApiCommunicationDataId;
        }

        /**
         * seqApiCommunicationDataIdを設定する
         *
         * @param seqApiCommunicationDataId
         *     API通信情報ID
         */
        public void setSeqApiCommunicationDataId(Integer seqApiCommunicationDataId) {
            this.seqApiCommunicationDataId = seqApiCommunicationDataId;
        }

        /**
         * apiNameを返す
         *
         * @return apiName
         */
        public String getApiName() {
            return apiName;
        }

        /**
         * apiNameを設定する
         *
         * @param apiName
         *     API名
         */
        public void setApiName(String apiName) {
            this.apiName = apiName;
        }

        /**
         * seqUserIdを返す
         *
         * @return seqUserId
         */
        public Integer getSeqUserId() {
            return seqUserId;
        }

        /**
         * seqUserIdを設定する
         *
         * @param seqUserId
         *     ユーザID
         */
        public void setSeqUserId(Integer seqUserId) {
            this.seqUserId = seqUserId;
        }

        /**
         * httpStatusを返す
         *
         * @return httpStatus
         */
        public String getHttpStatus() {
            return httpStatus;
        }

        /**
         * httpStatusを設定する
         *
         * @param httpStatus
         *     HTTPステータス
         */
        public void setHttpStatus(String httpStatus) {
            this.httpStatus = httpStatus;
        }

        /**
         * resultを返す
         *
         * @return result
         */
        public String getResult() {
            return result;
        }

        /**
         * resultを設定する
         *
         * @param result
         *     処理結果
         */
        public void setResult(String result) {
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
         *     詳細
         */
        public void setDetail(String detail) {
            this.detail = detail;
        }

        /**
         * requestDateを返す
         *
         * @return requestDate
         */
        public LocalDateTime getRequestDate() {
            return requestDate;
        }

        /**
         * requestDateを設定する
         *
         * @param requestDate
         *     APIリクエスト日時
         */
        public void setRequestDate(LocalDateTime requestDate) {
            this.requestDate = requestDate;
        }

        /**
         * responseDateを返す
         *
         * @return responseDate
         */
        public LocalDateTime getResponseDate() {
            return responseDate;
        }

        /**
         * responseDateを設定する
         *
         * @param responseDate
         *     APIリクエスト日時
         */
        public void setResponseDate(LocalDateTime responseDate) {
            this.responseDate = responseDate;
        }

    }

}
