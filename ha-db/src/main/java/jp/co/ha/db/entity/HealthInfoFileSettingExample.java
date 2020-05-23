package jp.co.ha.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 健康情報ファイル設定情報Example
 *
 * @version 1.0.0
 */
public class HealthInfoFileSettingExample extends BaseExample {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    public HealthInfoFileSettingExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to
     * the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2,
                String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException(
                        "Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagIsNull() {
            addCriterion("HEADER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagIsNotNull() {
            addCriterion("HEADER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagEqualTo(String value) {
            addCriterion("HEADER_FLAG =", value, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagNotEqualTo(String value) {
            addCriterion("HEADER_FLAG <>", value, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagGreaterThan(String value) {
            addCriterion("HEADER_FLAG >", value, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagGreaterThanOrEqualTo(String value) {
            addCriterion("HEADER_FLAG >=", value, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagLessThan(String value) {
            addCriterion("HEADER_FLAG <", value, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagLessThanOrEqualTo(String value) {
            addCriterion("HEADER_FLAG <=", value, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagLike(String value) {
            addCriterion("HEADER_FLAG like", value, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagNotLike(String value) {
            addCriterion("HEADER_FLAG not like", value, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagIn(List<String> values) {
            addCriterion("HEADER_FLAG in", values, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagNotIn(List<String> values) {
            addCriterion("HEADER_FLAG not in", values, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagBetween(String value1, String value2) {
            addCriterion("HEADER_FLAG between", value1, value2, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andHeaderFlagNotBetween(String value1, String value2) {
            addCriterion("HEADER_FLAG not between", value1, value2, "headerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagIsNull() {
            addCriterion("FOOTER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFooterFlagIsNotNull() {
            addCriterion("FOOTER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFooterFlagEqualTo(String value) {
            addCriterion("FOOTER_FLAG =", value, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagNotEqualTo(String value) {
            addCriterion("FOOTER_FLAG <>", value, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagGreaterThan(String value) {
            addCriterion("FOOTER_FLAG >", value, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FOOTER_FLAG >=", value, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagLessThan(String value) {
            addCriterion("FOOTER_FLAG <", value, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagLessThanOrEqualTo(String value) {
            addCriterion("FOOTER_FLAG <=", value, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagLike(String value) {
            addCriterion("FOOTER_FLAG like", value, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagNotLike(String value) {
            addCriterion("FOOTER_FLAG not like", value, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagIn(List<String> values) {
            addCriterion("FOOTER_FLAG in", values, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagNotIn(List<String> values) {
            addCriterion("FOOTER_FLAG not in", values, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagBetween(String value1, String value2) {
            addCriterion("FOOTER_FLAG between", value1, value2, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andFooterFlagNotBetween(String value1, String value2) {
            addCriterion("FOOTER_FLAG not between", value1, value2, "footerFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagIsNull() {
            addCriterion("MASK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMaskFlagIsNotNull() {
            addCriterion("MASK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMaskFlagEqualTo(String value) {
            addCriterion("MASK_FLAG =", value, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagNotEqualTo(String value) {
            addCriterion("MASK_FLAG <>", value, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagGreaterThan(String value) {
            addCriterion("MASK_FLAG >", value, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagGreaterThanOrEqualTo(String value) {
            addCriterion("MASK_FLAG >=", value, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagLessThan(String value) {
            addCriterion("MASK_FLAG <", value, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagLessThanOrEqualTo(String value) {
            addCriterion("MASK_FLAG <=", value, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagLike(String value) {
            addCriterion("MASK_FLAG like", value, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagNotLike(String value) {
            addCriterion("MASK_FLAG not like", value, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagIn(List<String> values) {
            addCriterion("MASK_FLAG in", values, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagNotIn(List<String> values) {
            addCriterion("MASK_FLAG not in", values, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagBetween(String value1, String value2) {
            addCriterion("MASK_FLAG between", value1, value2, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andMaskFlagNotBetween(String value1, String value2) {
            addCriterion("MASK_FLAG not between", value1, value2, "maskFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagIsNull() {
            addCriterion("ENCLOSURE_CHAR_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagIsNotNull() {
            addCriterion("ENCLOSURE_CHAR_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagEqualTo(String value) {
            addCriterion("ENCLOSURE_CHAR_FLAG =", value, "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagNotEqualTo(String value) {
            addCriterion("ENCLOSURE_CHAR_FLAG <>", value, "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagGreaterThan(String value) {
            addCriterion("ENCLOSURE_CHAR_FLAG >", value, "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ENCLOSURE_CHAR_FLAG >=", value, "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagLessThan(String value) {
            addCriterion("ENCLOSURE_CHAR_FLAG <", value, "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagLessThanOrEqualTo(String value) {
            addCriterion("ENCLOSURE_CHAR_FLAG <=", value, "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagLike(String value) {
            addCriterion("ENCLOSURE_CHAR_FLAG like", value, "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagNotLike(String value) {
            addCriterion("ENCLOSURE_CHAR_FLAG not like", value, "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagIn(List<String> values) {
            addCriterion("ENCLOSURE_CHAR_FLAG in", values, "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagNotIn(List<String> values) {
            addCriterion("ENCLOSURE_CHAR_FLAG not in", values, "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagBetween(String value1, String value2) {
            addCriterion("ENCLOSURE_CHAR_FLAG between", value1, value2,
                    "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andEnclosureCharFlagNotBetween(String value1, String value2) {
            addCriterion("ENCLOSURE_CHAR_FLAG not between", value1, value2,
                    "enclosureCharFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("REG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("REG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("REG_DATE =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("REG_DATE <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("REG_DATE >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REG_DATE >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("REG_DATE <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("REG_DATE <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("REG_DATE in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("REG_DATE not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("REG_DATE between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("REG_DATE not between", value1, value2, "regDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to
     * the database table health_info_file_setting
     *
     * @mbg.generated Sun Apr 05 13:39:31 GMT+09:00 2020
     */
    public static class Criterion {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue,
                String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to
     * the database table health_info_file_setting
     *
     * @mbg.generated do_not_delete_during_merge Mon Oct 22 19:05:30 JST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}