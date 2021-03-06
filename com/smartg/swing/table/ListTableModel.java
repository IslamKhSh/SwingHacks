package com.smartg.swing.table;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class ListTableModel extends ObjectTableModel<List> {

	private static final long serialVersionUID = 5339647716413344918L;

	public ListTableModel() {
		super(ArrayList.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected List initRow(List row) {
		int columnCount = getColumnCount();
		for(int i = 0; i < columnCount; i++) {
			row.add(null);
		}
		return row;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		List<?> row = getRow(rowIndex);
		if (row != null) {
			return row.get(columnIndex);
		}
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		List<Object> row = getRow(rowIndex);
		if (row != null) {
			row.set(columnIndex, aValue);
		}
	}
}
