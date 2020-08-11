package jp.co.ha.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * BMI範囲マスタExample
 *
 * @version 1.0.0
 */
public class BmiRangeMtExample extends BaseExample {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    public BmiRangeMtExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
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
     * to the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to
     * the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
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

        public Criteria andSeqBmiRangeIdIsNull() {
            addCriterion("SEQ_BMI_RANGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeqBmiRangeIdIsNotNull() {
            addCriterion("SEQ_BMI_RANGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeqBmiRangeIdEqualTo(Integer value) {
            addCriterion("SEQ_BMI_RANGE_ID =", value, "seqBmiRangeId");
            return (Criteria) this;
        }

        public Criteria andSeqBmiRangeIdNotEqualTo(Integer value) {
            addCriterion("SEQ_BMI_RANGE_ID <>", value, "seqBmiRangeId");
            return (Criteria) this;
        }

        public Criteria andSeqBmiRangeIdGreaterThan(Integer value) {
            addCriterion("SEQ_BMI_RANGE_ID >", value, "seqBmiRangeId");
            return (Criteria) this;
        }

        public Criteria andSeqBmiRangeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQ_BMI_RANGE_ID >=", value, "seqBmiRangeId");
            return (Criteria) this;
        }

        public Criteria andSeqBmiRangeIdLessThan(Integer value) {
            addCriterion("SEQ_BMI_RANGE_ID <", value, "seqBmiRangeId");
            return (Criteria) this;
        }

        public Criteria andSeqBmiRangeIdLessThanOrEqualTo(Integer value) {
            addCriterion("SEQ_BMI_RANGE_ID <=", value, "seqBmiRangeId");
            return (Criteria) this;
        }

        public Criteria andSeqBmiRangeIdIn(List<Integer> values) {
            addCriterion("SEQ_BMI_RANGE_ID in", values, "seqBmiRangeId");
            return (Criteria) this;
        }

        public Criteria andSeqBmiRangeIdNotIn(List<Integer> values) {
            addCriterion("SEQ_BMI_RANGE_ID not in", values, "seqBmiRangeId");
            return (Criteria) this;
        }

        public Criteria andSeqBmiRangeIdBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_BMI_RANGE_ID between", value1, value2, "seqBmiRangeId");
            return (Criteria) this;
        }

        public Criteria andSeqBmiRangeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_BMI_RANGE_ID not between", value1, value2, "seqBmiRangeId");
            return (Criteria) this;
        }

        public Criteria andRangeMinIsNull() {
            addCriterion("RANGE_MIN is null");
            return (Criteria) this;
        }

        public Criteria andRangeMinIsNotNull() {
            addCriterion("RANGE_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andRangeMinEqualTo(Integer value) {
            addCriterion("RANGE_MIN =", value, "rangeMin");
            return (Criteria) this;
        }

        public Criteria andRangeMinNotEqualTo(Integer value) {
            addCriterion("RANGE_MIN <>", value, "rangeMin");
            return (Criteria) this;
        }

        public Criteria andRangeMinGreaterThan(Integer value) {
            addCriterion("RANGE_MIN >", value, "rangeMin");
            return (Criteria) this;
        }

        public Criteria andRangeMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("RANGE_MIN >=", value, "rangeMin");
            return (Criteria) this;
        }

        public Criteria andRangeMinLessThan(Integer value) {
            addCriterion("RANGE_MIN <", value, "rangeMin");
            return (Criteria) this;
        }

        public Criteria andRangeMinLessThanOrEqualTo(Integer value) {
            addCriterion("RANGE_MIN <=", value, "rangeMin");
            return (Criteria) this;
        }

        public Criteria andRangeMinIn(List<Integer> values) {
            addCriterion("RANGE_MIN in", values, "rangeMin");
            return (Criteria) this;
        }

        public Criteria andRangeMinNotIn(List<Integer> values) {
            addCriterion("RANGE_MIN not in", values, "rangeMin");
            return (Criteria) this;
        }

        public Criteria andRangeMinBetween(Integer value1, Integer value2) {
            addCriterion("RANGE_MIN between", value1, value2, "rangeMin");
            return (Criteria) this;
        }

        public Criteria andRangeMinNotBetween(Integer value1, Integer value2) {
            addCriterion("RANGE_MIN not between", value1, value2, "rangeMin");
            return (Criteria) this;
        }

        public Criteria andRangeMaxIsNull() {
            addCriterion("RANGE_MAX is null");
            return (Criteria) this;
        }

        public Criteria andRangeMaxIsNotNull() {
            addCriterion("RANGE_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andRangeMaxEqualTo(Integer value) {
            addCriterion("RANGE_MAX =", value, "rangeMax");
            return (Criteria) this;
        }

        public Criteria andRangeMaxNotEqualTo(Integer value) {
            addCriterion("RANGE_MAX <>", value, "rangeMax");
            return (Criteria) this;
        }

        public Criteria andRangeMaxGreaterThan(Integer value) {
            addCriterion("RANGE_MAX >", value, "rangeMax");
            return (Criteria) this;
        }

        public Criteria andRangeMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("RANGE_MAX >=", value, "rangeMax");
            return (Criteria) this;
        }

        public Criteria andRangeMaxLessThan(Integer value) {
            addCriterion("RANGE_MAX <", value, "rangeMax");
            return (Criteria) this;
        }

        public Criteria andRangeMaxLessThanOrEqualTo(Integer value) {
            addCriterion("RANGE_MAX <=", value, "rangeMax");
            return (Criteria) this;
        }

        public Criteria andRangeMaxIn(List<Integer> values) {
            addCriterion("RANGE_MAX in", values, "rangeMax");
            return (Criteria) this;
        }

        public Criteria andRangeMaxNotIn(List<Integer> values) {
            addCriterion("RANGE_MAX not in", values, "rangeMax");
            return (Criteria) this;
        }

        public Criteria andRangeMaxBetween(Integer value1, Integer value2) {
            addCriterion("RANGE_MAX between", value1, value2, "rangeMax");
            return (Criteria) this;
        }

        public Criteria andRangeMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("RANGE_MAX not between", value1, value2, "rangeMax");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusIsNull() {
            addCriterion("OVER_WEIGHT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusIsNotNull() {
            addCriterion("OVER_WEIGHT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusEqualTo(String value) {
            addCriterion("OVER_WEIGHT_STATUS =", value, "overWeightStatus");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusNotEqualTo(String value) {
            addCriterion("OVER_WEIGHT_STATUS <>", value, "overWeightStatus");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusGreaterThan(String value) {
            addCriterion("OVER_WEIGHT_STATUS >", value, "overWeightStatus");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusGreaterThanOrEqualTo(String value) {
            addCriterion("OVER_WEIGHT_STATUS >=", value, "overWeightStatus");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusLessThan(String value) {
            addCriterion("OVER_WEIGHT_STATUS <", value, "overWeightStatus");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusLessThanOrEqualTo(String value) {
            addCriterion("OVER_WEIGHT_STATUS <=", value, "overWeightStatus");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusLike(String value) {
            addCriterion("OVER_WEIGHT_STATUS like", value, "overWeightStatus");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusNotLike(String value) {
            addCriterion("OVER_WEIGHT_STATUS not like", value, "overWeightStatus");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusIn(List<String> values) {
            addCriterion("OVER_WEIGHT_STATUS in", values, "overWeightStatus");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusNotIn(List<String> values) {
            addCriterion("OVER_WEIGHT_STATUS not in", values, "overWeightStatus");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusBetween(String value1, String value2) {
            addCriterion("OVER_WEIGHT_STATUS between", value1, value2,
                    "overWeightStatus");
            return (Criteria) this;
        }

        public Criteria andOverWeightStatusNotBetween(String value1, String value2) {
            addCriterion("OVER_WEIGHT_STATUS not between", value1, value2,
                    "overWeightStatus");
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
     * the database table bmi_range_mt
     *
     * @mbg.generated Tue Aug 11 12:57:32 GMT+09:00 2020
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
     * the database table bmi_range_mt
     *
     * @mbg.generated do_not_delete_during_merge Mon Mar 25 21:39:34 JST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}