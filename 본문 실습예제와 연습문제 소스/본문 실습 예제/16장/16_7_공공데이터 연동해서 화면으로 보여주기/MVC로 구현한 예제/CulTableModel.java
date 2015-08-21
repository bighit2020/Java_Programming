package ch16.ex9;


import javax.swing.table.AbstractTableModel;

public  class CulTableModel extends AbstractTableModel {
	
	String[] columnNames = {"문화재 번호","문화재 이름" };

	Object[][] data = {{" ", " "}};

	public CulTableModel( Object[][] data) {
		this.data = data;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return data[arg0][arg1];
	}
	
	public String getColumnName(int arg0){
		return columnNames[arg0];
	}

	 boolean[] columnEditables = new boolean[] {
            false, true, true, true
       };

     public boolean isCellEditable(int row, int column) {
            return columnEditables[column];
     }
     
  
     public void setValueAt(Object value,int row,int col){
    	 data[row][col]=value;
 		fireTableCellUpdated(row,col);
 	}
}
