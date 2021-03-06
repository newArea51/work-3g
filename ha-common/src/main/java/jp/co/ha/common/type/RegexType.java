package jp.co.ha.common.type;

/**
 * 正規表現の列挙
 *
 * @version 1.0.0
 */
public enum RegexType implements BaseEnum {

    /** 半角数字 */
    HALF_NUMBER("^[0-9]*$"),
    /** 半角数字とピリオド */
    HALF_NUMBER_PERIOD("^[0-9.]*$"),
    /** 半角英数字 */
    HALF_CHAR("^[0-9a-zA-Z]*$"),
    /** 半角英字 */
    HALF_ALPHABET("^[a-zA-Z]*$"),
    /** URL */
    URL("http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?"),
    /** メールアドレス */
    MAIL_ADDRESS("[A-Za-z0-9._+]+@[A-Za-z]+.[A-Za-z]"),
    /** フラグ */
    FLAG("[01]"),
    /** 浮動小数 */
    DECIMAL("^?(0|[1-9]\\d*)(\\.\\d+|)$");

    /** 正規表現 */
    private String value;

    /**
     * コンストラクタ
     *
     * @param value
     *     正規表現
     */
    private RegexType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    /**
     * 指定した文字列<code>value</code>が自身の正規表現と一致するかどうか判定する<br>
     * 正しい場合true, 異なる場合falseを返す<br>
     *
     * @return 判定結果
     */
    @Override
    public boolean is(String value) {
        return value.matches(this.getValue());
    }

    /**
     * @see jp.co.ha.common.type.BaseEnum#of(Class, String)
     * @param value
     *     値
     * @return RegixType
     */
    public static RegexType of(String value) {
        return BaseEnum.of(RegexType.class, value);
    }

}
