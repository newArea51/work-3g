package jp.co.ha.common.io.file.excel.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Excelダウンロードモデルアノテーション
 *
 * @version 1.0.0
 */
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ExcelDownloadModel {

    /** シート名 */
    String sheetName() default "Sheet1";

    /** ヘッダ名 */
    String[] headerNames() default "";

    /** フッタ名 */
    String[] footerNames() default "";
}
