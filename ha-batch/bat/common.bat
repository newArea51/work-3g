@echo off

rem ----------------------------------------------------------------------------------------
rem 共通処理バッチ
rem クラスパスの設定と文字コードをUTF-8に変更
rem ----------------------------------------------------------------------------------------

cls

rem 基底ディレクトリ
set BASE_DIR=C:\app\git\work-3g
rem クラスパス
set CLASSPATH=C:\Users\hoge\.m2\repository\org\mybatis\generator\mybatis-generator-maven-plugin\1.3.7\mybatis-generator-maven-plugin-1.3.7.jar;C:\Users\hoge\.m2\repository\org\apache\maven\maven-plugin-api\3.5.4\maven-plugin-api-3.5.4.jar;C:\Users\hoge\.m2\repository\org\apache\maven\maven-model\3.5.4\maven-model-3.5.4.jar;C:\Users\hoge\.m2\repository\org\apache\maven\maven-artifact\3.5.4\maven-artifact-3.5.4.jar;C:\Users\hoge\.m2\repository\org\eclipse\sisu\org.eclipse.sisu.plexus\0.3.3\org.eclipse.sisu.plexus-0.3.3.jar;C:\Users\hoge\.m2\repository\javax\enterprise\cdi-api\1.0\cdi-api-1.0.jar;C:\Users\hoge\.m2\repository\javax\annotation\jsr250-api\1.0\jsr250-api-1.0.jar;C:\Users\hoge\.m2\repository\org\eclipse\sisu\org.eclipse.sisu.inject\0.3.3\org.eclipse.sisu.inject-0.3.3.jar;C:\Users\hoge\.m2\repository\org\codehaus\plexus\plexus-component-annotations\1.5.5\plexus-component-annotations-1.5.5.jar;C:\Users\hoge\.m2\repository\org\codehaus\plexus\plexus-utils\3.1.0\plexus-utils-3.1.0.jar;C:\Users\hoge\.m2\repository\org\codehaus\plexus\plexus-classworlds\2.5.2\plexus-classworlds-2.5.2.jar;C:\Users\hoge\.m2\repository\org\mybatis\generator\mybatis-generator-core\1.3.7\mybatis-generator-core-1.3.7.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-context\5.2.2.RELEASE\spring-context-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-expression\5.2.2.RELEASE\spring-expression-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-context-support\5.2.2.RELEASE\spring-context-support-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-core\5.2.2.RELEASE\spring-core-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-jcl\5.2.2.RELEASE\spring-jcl-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-web\5.2.2.RELEASE\spring-web-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-webmvc\5.2.2.RELEASE\spring-webmvc-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-beans\5.2.2.RELEASE\spring-beans-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-aop\5.2.2.RELEASE\spring-aop-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-jdbc\5.2.2.RELEASE\spring-jdbc-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-tx\5.2.2.RELEASE\spring-tx-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-orm\5.2.2.RELEASE\spring-orm-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\springframework\spring-test\5.2.2.RELEASE\spring-test-5.2.2.RELEASE.jar;C:\Users\hoge\.m2\repository\org\apache\poi\poi\4.1.1\poi-4.1.1.jar;C:\Users\hoge\.m2\repository\commons-codec\commons-codec\1.13\commons-codec-1.13.jar;C:\Users\hoge\.m2\repository\org\apache\commons\commons-collections4\4.4\commons-collections4-4.4.jar;C:\Users\hoge\.m2\repository\org\apache\commons\commons-math3\3.6.1\commons-math3-3.6.1.jar;C:\Users\hoge\.m2\repository\org\apache\poi\poi-ooxml\4.1.1\poi-ooxml-4.1.1.jar;C:\Users\hoge\.m2\repository\org\apache\poi\poi-ooxml-schemas\4.1.1\poi-ooxml-schemas-4.1.1.jar;C:\Users\hoge\.m2\repository\org\apache\xmlbeans\xmlbeans\3.1.0\xmlbeans-3.1.0.jar;C:\Users\hoge\.m2\repository\org\apache\commons\commons-compress\1.19\commons-compress-1.19.jar;C:\Users\hoge\.m2\repository\com\github\virtuald\curvesapi\1.06\curvesapi-1.06.jar;C:\Users\hoge\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.10.0\jackson-databind-2.10.0.jar;C:\Users\hoge\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.10.0\jackson-core-2.10.0.jar;C:\Users\hoge\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.10.0\jackson-annotations-2.10.0.jar;C:\Users\hoge\.m2\repository\com\fasterxml\jackson\dataformat\jackson-dataformat-csv\2.10.0\jackson-dataformat-csv-2.10.0.jar;C:\Users\hoge\.m2\repository\com\fasterxml\jackson\dataformat\jackson-dataformat-xml\2.10.0\jackson-dataformat-xml-2.10.0.jar;C:\Users\hoge\.m2\repository\com\fasterxml\jackson\module\jackson-module-jaxb-annotations\2.10.0\jackson-module-jaxb-annotations-2.10.0.jar;C:\Users\hoge\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\2.3.2\jakarta.xml.bind-api-2.3.2.jar;C:\Users\hoge\.m2\repository\jakarta\activation\jakarta.activation-api\1.2.1\jakarta.activation-api-1.2.1.jar;C:\Users\hoge\.m2\repository\org\codehaus\woodstox\stax2-api\4.2\stax2-api-4.2.jar;C:\Users\hoge\.m2\repository\com\fasterxml\woodstox\woodstox-core\6.0.1\woodstox-core-6.0.1.jar;C:\Users\hoge\.m2\repository\mysql\mysql-connector-java\8.0.18\mysql-connector-java-8.0.18.jar;C:\Users\hoge\.m2\repository\com\google\protobuf\protobuf-java\3.6.1\protobuf-java-3.6.1.jar;C:\Users\hoge\.m2\repository\org\mybatis\mybatis\3.5.3\mybatis-3.5.3.jar;C:\Users\hoge\.m2\repository\org\mybatis\mybatis-spring\2.0.3\mybatis-spring-2.0.3.jar;C:\Users\hoge\.m2\repository\org\apache\commons\commons-dbcp2\2.7.0\commons-dbcp2-2.7.0.jar;C:\Users\hoge\.m2\repository\org\apache\commons\commons-pool2\2.7.0\commons-pool2-2.7.0.jar;C:\Users\hoge\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\hoge\.m2\repository\commons-cli\commons-cli\1.4\commons-cli-1.4.jar;C:\Users\hoge\.m2\repository\org\aspectj\aspectjrt\1.9.4\aspectjrt-1.9.4.jar;C:\Users\hoge\.m2\repository\org\aspectj\aspectjweaver\1.9.4\aspectjweaver-1.9.4.jar;C:\Users\hoge\.m2\repository\org\slf4j\slf4j-api\1.7.29\slf4j-api-1.7.29.jar;C:\Users\hoge\.m2\repository\org\slf4j\jcl-over-slf4j\1.7.29\jcl-over-slf4j-1.7.29.jar;C:\Users\hoge\.m2\repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;C:\Users\hoge\.m2\repository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;C:\Users\hoge\.m2\repository\org\codehaus\groovy\groovy\2.5.8\groovy-2.5.8.jar;C:\Users\hoge\.m2\repository\org\thymeleaf\thymeleaf-spring5\3.0.11.RELEASE\thymeleaf-spring5-3.0.11.RELEASE.jar;C:\Users\hoge\.m2\repository\org\thymeleaf\thymeleaf\3.0.11.RELEASE\thymeleaf-3.0.11.RELEASE.jar;C:\Users\hoge\.m2\repository\ognl\ognl\3.1.12\ognl-3.1.12.jar;C:\Users\hoge\.m2\repository\org\javassist\javassist\3.20.0-GA\javassist-3.20.0-GA.jar;C:\Users\hoge\.m2\repository\org\attoparser\attoparser\2.0.5.RELEASE\attoparser-2.0.5.RELEASE.jar;C:\Users\hoge\.m2\repository\org\unbescape\unbescape\1.1.6.RELEASE\unbescape-1.1.6.RELEASE.jar;C:\Users\hoge\.m2\repository\nz\net\ultraq\thymeleaf\thymeleaf-layout-dialect\2.4.1\thymeleaf-layout-dialect-2.4.1.jar;C:\Users\hoge\.m2\repository\nz\net\ultraq\thymeleaf\thymeleaf-expression-processor\1.1.3\thymeleaf-expression-processor-1.1.3.jar;C:\Users\hoge\.m2\repository\javax\inject\javax.inject\1\javax.inject-1.jar;C:\Users\hoge\.m2\repository\javax\validation\validation-api\2.0.1.Final\validation-api-2.0.1.Final.jar;C:\Users\hoge\.m2\repository\org\hibernate\validator\hibernate-validator\6.0.17.Final\hibernate-validator-6.0.17.Final.jar;C:\Users\hoge\.m2\repository\org\jboss\logging\jboss-logging\3.3.2.Final\jboss-logging-3.3.2.Final.jar;C:\Users\hoge\.m2\repository\com\fasterxml\classmate\1.3.4\classmate-1.3.4.jar;C:\Users\hoge\.m2\repository\javax\servlet\javax.servlet-api\4.0.1\javax.servlet-api-4.0.1.jar;C:\Users\hoge\.m2\repository\org\apache\commons\commons-lang3\3.9\commons-lang3-3.9.jar;C:\Users\hoge\.m2\repository\javax\mail\javax.mail-api\1.6.2\javax.mail-api-1.6.2.jar;C:\Users\hoge\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.5.2\junit-jupiter-api-5.5.2.jar;C:\Users\hoge\.m2\repository\org\apiguardian\apiguardian-api\1.1.0\apiguardian-api-1.1.0.jar;C:\Users\hoge\.m2\repository\org\opentest4j\opentest4j\1.2.0\opentest4j-1.2.0.jar;C:\Users\hoge\.m2\repository\org\junit\platform\junit-platform-commons\1.5.2\junit-platform-commons-1.5.2.jar;C:\Users\hoge\.m2\repository\net\bytebuddy\byte-buddy\1.8.15\byte-buddy-1.8.15.jar;C:\Users\hoge\.m2\repository\org\apache\commons\commons-exec\1.3\commons-exec-1.3.jar;C:\Users\hoge\.m2\repository\com\google\guava\guava\25.0-jre\guava-25.0-jre.jar;C:\Users\hoge\.m2\repository\com\google\code\findbugs\jsr305\1.3.9\jsr305-1.3.9.jar;C:\Users\hoge\.m2\repository\org\checkerframework\checker-compat-qual\2.0.0\checker-compat-qual-2.0.0.jar;C:\Users\hoge\.m2\repository\com\google\errorprone\error_prone_annotations\2.1.3\error_prone_annotations-2.1.3.jar;C:\Users\hoge\.m2\repository\com\google\j2objc\j2objc-annotations\1.1\j2objc-annotations-1.1.jar;C:\Users\hoge\.m2\repository\org\codehaus\mojo\animal-sniffer-annotations\1.14\animal-sniffer-annotations-1.14.jar;C:\Users\hoge\.m2\repository\com\squareup\okhttp3\okhttp\3.11.0\okhttp-3.11.0.jar;C:\Users\hoge\.m2\repository\com\squareup\okio\okio\1.14.0\okio-1.14.0.jar;C:\Users\hoge\.m2\repository\jp\co\ha\common\1.0\common-1.0.jar;C:\Users\hoge\.m2\repository\jp\co\ha\db\1.0\db-1.0.jar;C:\Users\hoge\.m2\repository\jp\co\ha\web\1.0\web-1.0.jar;C:\Users\hoge\.m2\repository\jp\co\ha\business\1.0\business-1.0.jar;
rem バッチ起動クラス
set MAIN=jp.co.ha.batch.invoke.BatchEntry
rem Java
set JAVA=C:\app\pleiades\java\8\bin\java

rem 文字コードをUTF-8に変更する
rem chcp 65001

