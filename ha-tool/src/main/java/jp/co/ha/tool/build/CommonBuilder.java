package jp.co.ha.tool.build;

import jp.co.ha.tool.excel.Cell;
import jp.co.ha.tool.excel.Row;
import jp.co.ha.tool.reader.ExcelReader;
import jp.co.ha.tool.type.CellPositionType;

public abstract class CommonBuilder extends BaseBuilder {

	protected ExcelReader reader;

	public CommonBuilder() {
		this.reader = new ExcelReader(getExcelConfig());
	}

	protected boolean isTargetTable(Row row, String table) {
		Cell cell = row.getCell(CellPositionType.PHYSICAL_NAME);
		return table.equals(cell.getValue());
	}

}
