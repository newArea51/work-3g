package jp.co.ha.db.entity;

import java.io.Serializable;

import jp.co.ha.common.log.annotation.Ignore;

/**
 * 健康情報ファイル設定情報のPrimaryKey
 *
 * @version 1.0.0
 */
public class HealthInfoFileSettingKey implements Serializable {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column health_info_file_setting.SEQ_USER_ID
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    private Integer seqUserId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table health_info_file_setting
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    @Ignore
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column health_info_file_setting.SEQ_USER_ID
     *
     * @return the value of health_info_file_setting.SEQ_USER_ID
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    public Integer getSeqUserId() {
        return seqUserId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column health_info_file_setting.SEQ_USER_ID
     *
     * @param seqUserId
     *     the value for health_info_file_setting.SEQ_USER_ID
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    public void setSeqUserId(Integer seqUserId) {
        this.seqUserId = seqUserId;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqUserId=").append(seqUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
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
        HealthInfoFileSettingKey other = (HealthInfoFileSettingKey) that;
        return (this.getSeqUserId() == null ? other.getSeqUserId() == null
                : this.getSeqUserId().equals(other.getSeqUserId()));
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((getSeqUserId() == null) ? 0 : getSeqUserId().hashCode());
        return result;
    }
}