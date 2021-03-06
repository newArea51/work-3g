package jp.co.ha.db.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jp.co.ha.common.db.annotation.Entity;
import jp.co.ha.common.log.annotation.Ignore;

/**
 * API通信情報Entity
 *
 * @version 1.0.0
 */
@Entity
public class ApiCommunicationData extends ApiCommunicationDataKey
        implements Serializable {

    /**
     *
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column api_communication_data.API_NAME
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    private String apiName;

    /**
     *
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column api_communication_data.SEQ_USER_ID
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    private Integer seqUserId;

    /**
     *
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column api_communication_data.HTTP_STATUS
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    private String httpStatus;

    /**
     *
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column api_communication_data.RESULT
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    private String result;

    /**
     *
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column api_communication_data.DETAIL
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column api_communication_data.REQUEST_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    private LocalDateTime requestDate;

    /**
     *
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column api_communication_data.RESPONSE_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    private LocalDateTime responseDate;

    /**
     *
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column api_communication_data.UPDATE_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    private LocalDateTime updateDate;

    /**
     *
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column api_communication_data.REG_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    private LocalDateTime regDate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table api_communication_data
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    @Ignore
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column api_communication_data.API_NAME
     *
     * @return the value of api_communication_data.API_NAME
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column api_communication_data.API_NAME
     *
     * @param apiName
     *     the value for api_communication_data.API_NAME
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column api_communication_data.SEQ_USER_ID
     *
     * @return the value of api_communication_data.SEQ_USER_ID
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public Integer getSeqUserId() {
        return seqUserId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column api_communication_data.SEQ_USER_ID
     *
     * @param seqUserId
     *     the value for api_communication_data.SEQ_USER_ID
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public void setSeqUserId(Integer seqUserId) {
        this.seqUserId = seqUserId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column api_communication_data.HTTP_STATUS
     *
     * @return the value of api_communication_data.HTTP_STATUS
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public String getHttpStatus() {
        return httpStatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column api_communication_data.HTTP_STATUS
     *
     * @param httpStatus
     *     the value for api_communication_data.HTTP_STATUS
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column api_communication_data.RESULT
     *
     * @return the value of api_communication_data.RESULT
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column api_communication_data.RESULT
     *
     * @param result
     *     the value for api_communication_data.RESULT
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column api_communication_data.DETAIL
     *
     * @return the value of api_communication_data.DETAIL
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column api_communication_data.DETAIL
     *
     * @param detail
     *     the value for api_communication_data.DETAIL
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column api_communication_data.REQUEST_DATE
     *
     * @return the value of api_communication_data.REQUEST_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column api_communication_data.REQUEST_DATE
     *
     * @param requestDate
     *     the value for api_communication_data.REQUEST_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column api_communication_data.RESPONSE_DATE
     *
     * @return the value of api_communication_data.RESPONSE_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public LocalDateTime getResponseDate() {
        return responseDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column api_communication_data.RESPONSE_DATE
     *
     * @param responseDate
     *     the value for api_communication_data.RESPONSE_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public void setResponseDate(LocalDateTime responseDate) {
        this.responseDate = responseDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column api_communication_data.UPDATE_DATE
     *
     * @return the value of api_communication_data.UPDATE_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column api_communication_data.UPDATE_DATE
     *
     * @param updateDate
     *     the value for api_communication_data.UPDATE_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column api_communication_data.REG_DATE
     *
     * @return the value of api_communication_data.REG_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public LocalDateTime getRegDate() {
        return regDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column api_communication_data.REG_DATE
     *
     * @param regDate
     *     the value for api_communication_data.REG_DATE
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table api_communication_data
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", apiName=").append(apiName);
        sb.append(", seqUserId=").append(seqUserId);
        sb.append(", httpStatus=").append(httpStatus);
        sb.append(", result=").append(result);
        sb.append(", detail=").append(detail);
        sb.append(", requestDate=").append(requestDate);
        sb.append(", responseDate=").append(responseDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", regDate=").append(regDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table api_communication_data
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
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
        ApiCommunicationData other = (ApiCommunicationData) that;
        return (this.getSeqApiCommunicationDataId() == null
                ? other.getSeqApiCommunicationDataId() == null
                : this.getSeqApiCommunicationDataId()
                        .equals(other.getSeqApiCommunicationDataId()))
                && (this.getApiName() == null ? other.getApiName() == null
                        : this.getApiName().equals(other.getApiName()))
                && (this.getSeqUserId() == null ? other.getSeqUserId() == null
                        : this.getSeqUserId().equals(other.getSeqUserId()))
                && (this.getHttpStatus() == null ? other.getHttpStatus() == null
                        : this.getHttpStatus().equals(other.getHttpStatus()))
                && (this.getResult() == null ? other.getResult() == null
                        : this.getResult().equals(other.getResult()))
                && (this.getDetail() == null ? other.getDetail() == null
                        : this.getDetail().equals(other.getDetail()))
                && (this.getRequestDate() == null ? other.getRequestDate() == null
                        : this.getRequestDate().equals(other.getRequestDate()))
                && (this.getResponseDate() == null ? other.getResponseDate() == null
                        : this.getResponseDate().equals(other.getResponseDate()))
                && (this.getUpdateDate() == null ? other.getUpdateDate() == null
                        : this.getUpdateDate().equals(other.getUpdateDate()))
                && (this.getRegDate() == null ? other.getRegDate() == null
                        : this.getRegDate().equals(other.getRegDate()));
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table api_communication_data
     *
     * @mbg.generated Fri Dec 25 00:28:09 GMT+09:00 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeqApiCommunicationDataId() == null) ? 0
                : getSeqApiCommunicationDataId().hashCode());
        result = prime * result + ((getApiName() == null) ? 0 : getApiName().hashCode());
        result = prime * result
                + ((getSeqUserId() == null) ? 0 : getSeqUserId().hashCode());
        result = prime * result
                + ((getHttpStatus() == null) ? 0 : getHttpStatus().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        result = prime * result
                + ((getRequestDate() == null) ? 0 : getRequestDate().hashCode());
        result = prime * result
                + ((getResponseDate() == null) ? 0 : getResponseDate().hashCode());
        result = prime * result
                + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        return result;
    }
}