package jp.co.ha.db.entity;

import java.io.Serializable;

import jp.co.ha.common.log.annotation.Ignore;

/**
 * 管理者サイト権限マスタのPrimaryKey
 *
 * @version 1.0.0
 */
public class RootRoleMtKey implements Serializable {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column root_role_mt.SEQ_ROOT_ROLE_MT_ID
     *
     * @mbg.generated Sun Jan 10 15:29:38 GMT+09:00 2021
     */
    private Integer seqRootRoleMtId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table root_role_mt
     *
     * @mbg.generated Sun Jan 10 15:29:38 GMT+09:00 2021
     */
    @Ignore
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column root_role_mt.SEQ_ROOT_ROLE_MT_ID
     *
     * @return the value of root_role_mt.SEQ_ROOT_ROLE_MT_ID
     * @mbg.generated Sun Jan 10 15:29:38 GMT+09:00 2021
     */
    public Integer getSeqRootRoleMtId() {
        return seqRootRoleMtId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column root_role_mt.SEQ_ROOT_ROLE_MT_ID
     *
     * @param seqRootRoleMtId
     *     the value for root_role_mt.SEQ_ROOT_ROLE_MT_ID
     * @mbg.generated Sun Jan 10 15:29:38 GMT+09:00 2021
     */
    public void setSeqRootRoleMtId(Integer seqRootRoleMtId) {
        this.seqRootRoleMtId = seqRootRoleMtId;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table root_role_mt
     *
     * @mbg.generated Sun Jan 10 15:29:38 GMT+09:00 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqRootRoleMtId=").append(seqRootRoleMtId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table root_role_mt
     *
     * @mbg.generated Sun Jan 10 15:29:38 GMT+09:00 2021
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
        RootRoleMtKey other = (RootRoleMtKey) that;
        return (this.getSeqRootRoleMtId() == null ? other.getSeqRootRoleMtId() == null
                : this.getSeqRootRoleMtId().equals(other.getSeqRootRoleMtId()));
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table root_role_mt
     *
     * @mbg.generated Sun Jan 10 15:29:38 GMT+09:00 2021
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((getSeqRootRoleMtId() == null) ? 0 : getSeqRootRoleMtId().hashCode());
        return result;
    }
}