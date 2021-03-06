package jp.co.ha.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import jp.co.ha.common.exception.ValidateErrorCode;
import jp.co.ha.common.type.RegexType;
import jp.co.ha.common.util.BeanUtil;
import jp.co.ha.common.util.StringUtil;
import jp.co.ha.web.form.BaseForm;

/**
 * 基底Validator<br>
 * webのvalidatorはこの抽象クラスを継承すること
 *
 * @param <F>
 *     validate対象form
 * @version 1.0.0
 */
public abstract class BaseWebValidator<F extends BaseForm> implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        Class<?> clz = BeanUtil.getParameterType(this.getClass());
        return clz.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        if (errors.hasErrors()) {
            // アノテーションでエラーになっている場合
            return;
        }

        @SuppressWarnings("unchecked")
        F form = (F) target;

        this.validate(form, errors);
    }

    /**
     * 各継承クラスでvalidate処理を行う
     *
     * @param form
     *     validate対象form
     * @param errors
     *     {@linkplain Errors}
     */
    protected abstract void validate(F form, Errors errors);

    /**
     * fieldのformの値が空文字の場合、errorsオブジェクトにエラーを追加する
     *
     * @param errors
     *     エラー情報
     * @param fieldsName
     *     画面表示項目名
     * @param msgArgs
     *     メッセージ引数
     */
    protected void rejectIfEmpty(Errors errors, String fieldsName, String msgArgs) {
        String field = getFieldValue(errors, fieldsName);
        if (StringUtil.isEmpty(field.toString())) {
            errors.rejectValue(fieldsName, ValidateErrorCode.REQUIRE.getOuterErrorCode(),
                    new String[] { msgArgs },
                    ValidateErrorCode.REQUIRE.getOuterErrorCode());
        }
    }

    /**
     * fieldのformの値がmaxを超過してる場合、errorsオブジェクトにエラーを追加する
     *
     * @param errors
     *     Errors
     * @param field
     *     Formフィールド名
     * @param max
     *     最大値
     */
    protected void rejectIfLengthMax(Errors errors, String field, int max) {
        String fieldValue = getFieldValue(errors, field);
        if (max < fieldValue.length()) {
            errors.rejectValue(fieldValue,
                    ValidateErrorCode.LENGTH_OVER.getOuterErrorCode());
        }
    }

    /**
     * fieldのformの値がmin未満の場合、errorsオブジェクトにエラーを追加する
     *
     * @param errors
     *     Errors
     * @param field
     *     Formフィールド名
     * @param min
     *     最小値
     */
    protected void rejectIfLengthMin(Errors errors, String field, int min) {
        String fieldValue = getFieldValue(errors, field);
        if (fieldValue.length() < min) {
            errors.rejectValue(fieldValue,
                    ValidateErrorCode.LENGTH_LACK.getOuterErrorCode());
        }
    }

    /**
     * fieldValueが半角数字-ピリオドでない場合、errorsオブジェクトにエラーを追加する
     *
     * @param errors
     *     Errors
     * @param field
     *     Formフィールド名
     * @param nameArgs
     *     名前
     */
    protected void rejectIfNotHalfNumberPeriod(Errors errors, String field,
            String nameArgs) {
        if (!RegexType.HALF_NUMBER_PERIOD.is(getFieldValue(errors, field))) {
            errors.rejectValue(field, ValidateErrorCode.TYPE_ERROR.getOuterErrorCode(),
                    new String[] { nameArgs },
                    ValidateErrorCode.TYPE_ERROR.getOuterErrorCode());
        }
    }

    /**
     * 入力値を返す
     *
     * @param errors
     *     Errors
     * @param field
     *     Formフィールド名
     * @return 入力値
     */
    protected String getFieldValue(Errors errors, String field) {
        Object value = errors.getFieldValue(field);
        return BeanUtil.isNull(value) ? StringUtil.EMPTY : value.toString();
    }
}
