package jp.co.ha.tool.excel;

import jp.co.ha.tool.excel.type.ColumnType;

/**
 * 自動生成ツールのCellクラス
 *
 * @version 1.0.0
 */
public class ExcelCell {

    /** 値 */
    private String value;

    /**
     * コンストラクタ
     *
     * @param value
     *     値
     */
    public ExcelCell(String value) {
        this.value = value;
    }

    /**
     * 値を返す
     *
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * ColumnTypeを返す
     *
     * @return value
     */
    public ColumnType getColumnType() {
        return ColumnType.of(this.value);
    }
}
