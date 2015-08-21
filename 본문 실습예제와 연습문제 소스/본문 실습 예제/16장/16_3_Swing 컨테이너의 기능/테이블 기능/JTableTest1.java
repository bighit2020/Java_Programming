package ch16.ex1.jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest1  extends JFrame{
	JTable table;
	
	String[][] data={{"150000","�ڱ浿","�ѹ���"},
					 {"150001","ȫ�浿","������"},
					 {"150002","�̼���","ȸ���"},
					 {"150003","�Ӳ���","���ߺ�"},
					 {"150004","������","������"},
					 {"150005","���ӽ�","�ѹ���"},
					 {"150006","�̱浿","�ѹ���"},
					 {"150007","������","���ߺ�"},
					 {"150008","�ڼ���","ȸ���"},
					 {"150009","���θ�","������"},
					 {"150010","ȫ��","������"},
					 {"150011","����","���ߺ�"},
					 {"150012","������","������"},
					 {"150013","ȫ���","ȸ���"},
					};
	Object [] columnNames={"���","�̸�","�ٹ��μ�" };
	public JTableTest1(){
		table=new JTable(data,columnNames);
		table.setAutoResizeMode(table.AUTO_RESIZE_ALL_COLUMNS);
	//	table.setAutoResizeMode(table.AUTO_RESIZE_LAST_COLUMN);
	//	table.setAutoResizeMode(table.AUTO_RESIZE_NEXT_COLUMN);
	//	table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
	//	table.setAutoResizeMode(table.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		
	}
	public void startFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("��� ���� ���̺�");
		
		add(new JScrollPane(table));
		pack();
		setVisible(true);
		
	}
	public static void main(String[] args){
		
		JTableTest1 t=new JTableTest1();
		t.startFrame();
	}

}
