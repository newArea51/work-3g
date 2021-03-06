package jp.co.ha.business.api.node.response;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import jp.co.ha.business.healthInfo.type.GenderType;
import jp.co.ha.common.log.LogMessageFactory;
import jp.co.ha.web.form.BaseApiResponse;

/**
 * カロリー計算APIレスポンスクラス
 *
 * @version 1.0.0
 */
public class CalorieCalcResponse extends BaseNodeResponse implements BaseApiResponse {

    /** カロリー計算結果情報 */
    @JsonProperty("calorie_calc_result")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private CalorieCalcResult calorieCalcResult;
    /** ユーザ健康情報 */
    @JsonProperty("user_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UserData userData;

    /**
     * カロリー計算結果情報
     *
     * @version 1.0.0
     */
    public static class CalorieCalcResult {

        /** 基礎代謝量 */
        @JsonProperty("base_metabolism")
        private BigDecimal baseMetabolism;
        /** 1日の消費カロリー */
        @JsonProperty("lost_calorie_per_day")
        private BigDecimal lostCaloriePerDay;

        /**
         * baseMetabolismを返す
         *
         * @return baseMetabolism
         */
        public BigDecimal getBaseMetabolism() {
            return baseMetabolism;
        }

        /**
         * baseMetabolismを設定する
         *
         * @param baseMetabolism
         *     基礎代謝量
         */
        public void setBaseMetabolism(BigDecimal baseMetabolism) {
            this.baseMetabolism = baseMetabolism;
        }

        /**
         * lostCaloriePerDayを返す
         *
         * @return lostCaloriePerDay
         */
        public BigDecimal getLostCaloriePerDay() {
            return lostCaloriePerDay;
        }

        /**
         * lostCaloriePerDayを設定する
         *
         * @param lostCaloriePerDay
         *     1日の消費カロリー
         */
        public void setLostCaloriePerDay(BigDecimal lostCaloriePerDay) {
            this.lostCaloriePerDay = lostCaloriePerDay;
        }

        @Override
        public String toString() {
            return LogMessageFactory.toString(this);
        }

    }

    /**
     * ユーザ健康情報
     *
     * @version 1.0.0
     */
    public static class UserData {

        /** 性別 */
        @JsonProperty("gender")
        private GenderType genderType;
        /** 年齢 */
        @JsonProperty("age")
        private Integer age;
        /** 身長 */
        @JsonProperty("height")
        private BigDecimal height;
        /** 体重 */
        @JsonProperty("weight")
        private BigDecimal weight;
        /** 生活活動代謝 */
        @JsonProperty("life_work_metabolism")
        private BigDecimal lifeWorkMetabolism;

        /**
         * genderTypeを返す
         *
         * @return genderType
         */
        public GenderType getGenderType() {
            return genderType;
        }

        /**
         * genderTypeを設定する
         *
         * @param genderType
         *     性別
         */
        public void setGenderType(GenderType genderType) {
            this.genderType = genderType;
        }

        /**
         * ageを返す
         *
         * @return age
         */
        public Integer getAge() {
            return age;
        }

        /**
         * ageを設定する
         *
         * @param age
         *     年齢
         */
        public void setAge(Integer age) {
            this.age = age;
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
         * lifeWorkMetabolismを返す
         *
         * @return lifeWorkMetabolism
         */
        public BigDecimal getLifeWorkMetabolism() {
            return lifeWorkMetabolism;
        }

        /**
         * lifeWorkMetabolismを設定する
         *
         * @param lifeWorkMetabolism
         *     生活活動代謝
         */
        public void setLifeWorkMetabolism(BigDecimal lifeWorkMetabolism) {
            this.lifeWorkMetabolism = lifeWorkMetabolism;
        }

        @Override
        public String toString() {
            return LogMessageFactory.toString(this);
        }
    }

    /**
     * calorieCalcResultを返す
     *
     * @return calorieCalcResult
     */
    public CalorieCalcResult getCalorieCalcResult() {
        return calorieCalcResult;
    }

    /**
     * calorieCalcResultを設定する
     *
     * @param calorieCalcResult
     *     カロリー計算結果情報
     */
    public void setCalorieCalcResult(CalorieCalcResult calorieCalcResult) {
        this.calorieCalcResult = calorieCalcResult;
    }

    /**
     * userDataを返す
     *
     * @return userData
     */
    public UserData getUserData() {
        return userData;
    }

    /**
     * userDataを設定する
     *
     * @param userData
     *     ユーザ健康情報
     */
    public void setUserData(UserData userData) {
        this.userData = userData;
    }

}
