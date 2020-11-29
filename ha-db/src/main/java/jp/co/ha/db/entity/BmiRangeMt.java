package jp.co.ha.db.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jp.co.ha.common.db.annotation.Entity;
import jp.co.ha.common.log.annotation.Ignore;

/**
 * BMI範囲マスタEntity
 *
 * @version 1.0.0
 */
@Entity
public class BmiRangeMt extends BmiRangeMtKey implements Serializable {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column bmi_range_mt.RANGE_MIN
     *
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    private Integer rangeMin;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column bmi_range_mt.RANGE_MAX
     *
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    private Integer rangeMax;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column bmi_range_mt.OVER_WEIGHT_STATUS
     *
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    private String overWeightStatus;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column bmi_range_mt.UPDATE_DATE
     *
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    private LocalDateTime updateDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column bmi_range_mt.REG_DATE
     *
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    private LocalDateTime regDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table bmi_range_mt
     *
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    @Ignore
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column bmi_range_mt.RANGE_MIN
     *
     * @return the value of bmi_range_mt.RANGE_MIN
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public Integer getRangeMin() {
        return rangeMin;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column bmi_range_mt.RANGE_MIN
     *
     * @param rangeMin
     *     the value for bmi_range_mt.RANGE_MIN
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public void setRangeMin(Integer rangeMin) {
        this.rangeMin = rangeMin;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column bmi_range_mt.RANGE_MAX
     *
     * @return the value of bmi_range_mt.RANGE_MAX
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public Integer getRangeMax() {
        return rangeMax;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column bmi_range_mt.RANGE_MAX
     *
     * @param rangeMax
     *     the value for bmi_range_mt.RANGE_MAX
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public void setRangeMax(Integer rangeMax) {
        this.rangeMax = rangeMax;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column bmi_range_mt.OVER_WEIGHT_STATUS
     *
     * @return the value of bmi_range_mt.OVER_WEIGHT_STATUS
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public String getOverWeightStatus() {
        return overWeightStatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column bmi_range_mt.OVER_WEIGHT_STATUS
     *
     * @param overWeightStatus
     *     the value for bmi_range_mt.OVER_WEIGHT_STATUS
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public void setOverWeightStatus(String overWeightStatus) {
        this.overWeightStatus = overWeightStatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column bmi_range_mt.UPDATE_DATE
     *
     * @return the value of bmi_range_mt.UPDATE_DATE
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column bmi_range_mt.UPDATE_DATE
     *
     * @param updateDate
     *     the value for bmi_range_mt.UPDATE_DATE
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column bmi_range_mt.REG_DATE
     *
     * @return the value of bmi_range_mt.REG_DATE
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public LocalDateTime getRegDate() {
        return regDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column bmi_range_mt.REG_DATE
     *
     * @param regDate
     *     the value for bmi_range_mt.REG_DATE
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rangeMin=").append(rangeMin);
        sb.append(", rangeMax=").append(rangeMax);
        sb.append(", overWeightStatus=").append(overWeightStatus);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", regDate=").append(regDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
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
        BmiRangeMt other = (BmiRangeMt) that;
        return (this.getSeqBmiRangeMtId() == null ? other.getSeqBmiRangeMtId() == null
                : this.getSeqBmiRangeMtId().equals(other.getSeqBmiRangeMtId()))
                && (this.getRangeMin() == null ? other.getRangeMin() == null
                        : this.getRangeMin().equals(other.getRangeMin()))
                && (this.getRangeMax() == null ? other.getRangeMax() == null
                        : this.getRangeMax().equals(other.getRangeMax()))
                && (this.getOverWeightStatus() == null
                        ? other.getOverWeightStatus() == null
                        : this.getOverWeightStatus().equals(other.getOverWeightStatus()))
                && (this.getUpdateDate() == null ? other.getUpdateDate() == null
                        : this.getUpdateDate().equals(other.getUpdateDate()))
                && (this.getRegDate() == null ? other.getRegDate() == null
                        : this.getRegDate().equals(other.getRegDate()));
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((getSeqBmiRangeMtId() == null) ? 0 : getSeqBmiRangeMtId().hashCode());
        result = prime * result
                + ((getRangeMin() == null) ? 0 : getRangeMin().hashCode());
        result = prime * result
                + ((getRangeMax() == null) ? 0 : getRangeMax().hashCode());
        result = prime * result + ((getOverWeightStatus() == null) ? 0
                : getOverWeightStatus().hashCode());
        result = prime * result
                + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        return result;
    }
}