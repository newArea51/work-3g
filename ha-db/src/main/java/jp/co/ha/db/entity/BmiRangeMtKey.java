package jp.co.ha.db.entity;

import java.io.Serializable;

import jp.co.ha.common.log.annotation.Ignore;

/**
 * BMI範囲マスタのPrimaryKey
 *
 * @version 1.0.0
 */
public class BmiRangeMtKey implements Serializable {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column bmi_range_mt.SEQ_BMI_RANGE_MT_ID
     *
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    private Integer seqBmiRangeMtId;
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
     * value of the database column bmi_range_mt.SEQ_BMI_RANGE_MT_ID
     *
     * @return the value of bmi_range_mt.SEQ_BMI_RANGE_MT_ID
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public Integer getSeqBmiRangeMtId() {
        return seqBmiRangeMtId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column bmi_range_mt.SEQ_BMI_RANGE_MT_ID
     *
     * @param seqBmiRangeMtId
     *     the value for bmi_range_mt.SEQ_BMI_RANGE_MT_ID
     * @mbg.generated Sun Nov 29 14:25:44 GMT+09:00 2020
     */
    public void setSeqBmiRangeMtId(Integer seqBmiRangeMtId) {
        this.seqBmiRangeMtId = seqBmiRangeMtId;
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
        sb.append(", seqBmiRangeMtId=").append(seqBmiRangeMtId);
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
        BmiRangeMtKey other = (BmiRangeMtKey) that;
        return (this.getSeqBmiRangeMtId() == null ? other.getSeqBmiRangeMtId() == null
                : this.getSeqBmiRangeMtId().equals(other.getSeqBmiRangeMtId()));
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
        return result;
    }
}