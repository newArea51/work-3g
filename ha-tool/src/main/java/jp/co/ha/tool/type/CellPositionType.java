package jp.co.ha.tool.type;

public enum CellPositionType {

	/** 論理名 */
	LOGICAL_NAME(0, "logicalName"),
	/** 物理名 */
	PHYSICAL_NAME(1, "physicalName"),
	/** primary key */
	PRIMARY_KEY(2, "primaryKey"),
	/** シーケンス */
	SEQUENCE(3, "sequence"),
	/** カラム名(コメント) */
	COLUMN_NAME_COMMENT(4, "columnNameComment"),
	/** カラム名 */
	COLUMN_NAME(5, "columnName"),
	/** カラムタイプ */
	COLUMN_TYPE(6, "columnType"),
	/** カラムサイズ */
	COLUMN_SIZE(7, "columnSize"),
	/** 備考 */
	REMARKS(8, "remarks");

	/** 位置 */
	private int position;
	/** ヘッダ名 */
	private String headerName;

	private CellPositionType(int position, String headerName) {
		this.position = position;
		this.headerName = headerName;
	}

	public int getPosition() {
		return this.position;
	}

	public String getHeaderName() {
		return this.headerName;
	}
}
