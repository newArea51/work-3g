package jp.co.ha.tool.source;

import java.util.StringJoiner;

import jp.co.ha.common.util.StringUtil;
import jp.co.ha.tool.source.type.AccessType;

/**
 * 自動生成JavaソースのSetterクラス
 *
 * @version 1.0.0
 */
public class Setter extends Method {

    /** 接頭語 */
    private static final String PREFIX = "set";

    /**
     * コンストラクタ
     *
     * @param field
     *     Field
     */
    public Setter(Field field) {
        this(field, AccessType.PUBLIC);
    }

    /**
     * コンストラクタ
     *
     * @param field
     *     Field
     * @param accessType
     *     アクセスタイプ
     */
    public Setter(Field field, AccessType accessType) {
        super(field, accessType);
    }

    @Override
    public String toString() {

        final String SPACE = "    ";

        StringJoiner body = new StringJoiner(StringUtil.NEW_LINE);
        body.add(SPACE + accessType.getValue() + " void " + getMethodName() + "("
                + field.getClassType().getSimpleName() + " " + field.getName() + ") {");
        body.add(SPACE + SPACE + "this." + field.getName() + " = " + field.getName()
                + ";");
        body.add(SPACE + "}");

        return body.toString();
    }

    @Override
    public String getMethodName() {
        return PREFIX + StringUtil.capitalize(field.getName());
    }
}
