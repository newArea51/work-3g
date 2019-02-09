package jp.co.ha.common.validator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import jp.co.ha.common.validator.MaxValidator;

/**
 * 最大桁数チェックアノテーション
 *
 * @see jp.co.ha.common.validator.MaxValidator
 *
 */
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = MaxValidator.class)
public @interface Max {

	/** size */
	int size();

	/** 同じ値を含むか */
	boolean isEqual() default true;

	/** message */
	String message() default "";

	/** groups */
	Class<?>[] groups() default {};

	/** payload */
	Class<? extends Payload>[] payload() default {};
}
