package jp.co.ha.web.service.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 健康情報CSVダウンロードサービス実装クラスのマーカーアノテーション
 *
 */
@Inherited
@Documented
@Qualifier("healthInfoDownloadCsv")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface HealthInfoDownloadCsv {

}
