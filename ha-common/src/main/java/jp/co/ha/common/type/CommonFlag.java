package jp.co.ha.common.type;

/**
 * フラグ値列挙
 *
 * @version 1.0.0
 */
public enum CommonFlag implements BaseEnum {

    /** 真 */
    TRUE("1"),
    /** 偽 */
    FALSE("0");

    /**
     * コンストラクタ
     *
     * @param value
     *     値
     */
    private CommonFlag(String value) {
        this.value = value;
    }

    /** 値 */
    private String value;

    @Override
    public String getValue() {
        return this.value;
    }

    /**
     * @see jp.co.ha.common.type.BaseEnum#of(Class, String)
     * @param value
     *     値
     * @return CommonFlag
     */
    public static CommonFlag of(String value) {
        return BaseEnum.of(CommonFlag.class, value);
    }
}
