package jp.co.ha.business.dto;

import java.math.BigDecimal;

/**
 * 健康情報照会詳細DTO
 *
 * @version 1.0.0
 */
public class HealthInfoRefDetailDto {

    /** 健康情報ID */
    private Integer seqHealthInfoId;
    /** ユーザID */
    private Integer seqUserId;
    /** 身長 */
    private BigDecimal height;
    /** 体重 */
    private BigDecimal weight;
    /** BMI */
    private BigDecimal bmi;
    /** 標準体重 */
    private BigDecimal standardWeight;
    /** 健康情報ステータス */
    private String healthInfoStatus;
    /** 健康情報登録日時 */
    private String healthInfoRegDate;
    /** BMI範囲マスタID */
    private Integer seqBmiRangeMtId;
    /** 肥満度ステータス */
    private String overWeightStatus;

    /**
     * seqHealthInfoIdを返す
     *
     * @return seqHealthInfoId
     */
    public Integer getSeqHealthInfoId() {
        return seqHealthInfoId;
    }

    /**
     * seqHealthInfoIdを設定する
     *
     * @param seqHealthInfoId
     *     健康情報ID
     */
    public void setSeqHealthInfoId(Integer seqHealthInfoId) {
        this.seqHealthInfoId = seqHealthInfoId;
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
     * heightを返す
     *
     * @return height
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * heightを設定する
     *
     * @param height
     *     身長
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * weightを返す
     *
     * @return weight
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * weightを設定する
     *
     * @param weight
     *     体重
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * bmiを返す
     *
     * @return bmi
     */
    public BigDecimal getBmi() {
        return bmi;
    }

    /**
     * bmiを設定する
     *
     * @param bmi
     *     BMI
     */
    public void setBmi(BigDecimal bmi) {
        this.bmi = bmi;
    }

    /**
     * standardWeightを返す
     *
     * @return standardWeight
     */
    public BigDecimal getStandardWeight() {
        return standardWeight;
    }

    /**
     * standardWeightを設定する
     *
     * @param standardWeight
     *     標準体重
     */
    public void setStandardWeight(BigDecimal standardWeight) {
        this.standardWeight = standardWeight;
    }

    /**
     * healthInfoStatusを返す
     *
     * @return healthInfoStatus
     */
    public String getHealthInfoStatus() {
        return healthInfoStatus;
    }

    /**
     * healthInfoStatusを設定する
     *
     * @param healthInfoStatus
     *     健康情報ステータス
     */
    public void setHealthInfoStatus(String healthInfoStatus) {
        this.healthInfoStatus = healthInfoStatus;
    }

    /**
     * healthInfoRegDateを返す
     *
     * @return healthInfoRegDate
     */
    public String getHealthInfoRegDate() {
        return healthInfoRegDate;
    }

    /**
     * healthInfoRegDateを設定する
     *
     * @param healthInfoRegDate
     *     健康情報登録日時
     */
    public void setHealthInfoRegDate(String healthInfoRegDate) {
        this.healthInfoRegDate = healthInfoRegDate;
    }

    /**
     * seqBmiRangeMtIdを返す
     *
     * @return seqBmiRangeMtId
     */
    public Integer getSeqBmiRangeMtId() {
        return seqBmiRangeMtId;
    }

    /**
     * seqBmiRangeMtIdを設定する
     *
     * @param seqBmiRangeMtId
     *     BMI範囲マスタID
     */
    public void setSeqBmiRangeMtId(Integer seqBmiRangeMtId) {
        this.seqBmiRangeMtId = seqBmiRangeMtId;
    }

    /**
     * overWeightStatusを返す
     *
     * @return overWeightStatus
     */
    public String getOverWeightStatus() {
        return overWeightStatus;
    }

    /**
     * overWeightStatusを設定する
     *
     * @param overWeightStatus
     *     肥満度メッセージ
     */
    public void setOverWeightStatus(String overWeightStatus) {
        this.overWeightStatus = overWeightStatus;
    }

}
