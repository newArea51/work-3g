package jp.co.ha.common.type;

/**
 * 文字コードの列挙
 *
 * @version 1.0.0
 */
public enum Charset implements BaseEnum {

    /** MS932 */
    MS_932("MS932"),
    /** UTF-8 */
    UTF_8("UTF-8"),
    /** Shift-JIS */
    SHIFT_JIS("Shift-JIS");

    /** 値 */
    private String value;

    /**
     * コンストラクタ
     *
     * @param value
     *     値
     */
    private Charset(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    /**
     * @see jp.co.ha.common.type.BaseEnum#of(Class, String)
     * @param value
     *     値
     * @return Charset
     */
    public static Charset of(String value) {
        return BaseEnum.of(Charset.class, value);
    }
}
