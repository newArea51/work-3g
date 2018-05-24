package jp.co.ha.common.file.excel.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Excelシートのアノテーション<br>
 *
 */
@Inherited
@Documented
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelSheet {

	/**
	 * シート名<br>
	 * セットした順にファイルにつめられる<br>
	 *
	 * @return シート名
	 */
	String value() default "";

}
