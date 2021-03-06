package jp.co.ha.business.healthInfo.service.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 結果照会CSVダウンロードサービス実装クラスのマーカーアノテーション
 *
 * @version 1.0.0
 */
@Inherited
@Documented
@Qualifier("referenceDownloadCsv")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ReferenceDownloadCsv {

}
