package jp.co.ha.tool.source;

import java.util.StringJoiner;

import jp.co.ha.common.util.StringUtil;
import jp.co.ha.tool.source.type.AccessType;

/**
 * Getter
 *
 * @version 1.0.0
 */
public class Getter extends Method {

    /** 接頭語 */
    private static final String PREFIX = "get";

    /**
     * コンストラクタ
     *
     * @param field
     *     Field
     */
    public Getter(Field field) {
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
    public Getter(Field field, AccessType accessType) {
        super(field, accessType);
    }

    @Override
    public String toString() {

        final String SPACE = "    ";

        StringJoiner body = new StringJoiner(StringUtil.NEW_LINE);
        body.add(SPACE + accessType.getValue() + " "
                + field.getClassType().getSimpleName() + " "
                + getMethodName() + "() {");
        body.add(SPACE + SPACE + "return " + field.getName() + ";");
        body.add(SPACE + "}");

        return body.toString();
    }

    @Override
    public String getMethodName() {
        return PREFIX + StringUtil.capitalize(field.getName());
    }
}
