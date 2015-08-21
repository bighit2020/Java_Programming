package ch16.ex1.jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest1  extends JFrame{
	JTable table;
	
	String[][] data={{"150000","박길동","총무부"},
					 {"150001","홍길동","관리부"},
					 {"150002","이순신","회계부"},
					 {"150003","임꺽정","개발부"},
					 {"150004","박지성","관리부"},
					 {"150005","제임스","총무부"},
					 {"150006","이길동","총무부"},
					 {"150007","차범근","개발부"},
					 {"150008","박세리","회계부"},
					 {"150009","차두리","영업부"},
					 {"150010","홍명보","영업부"},
					 {"150011","존슨","개발부"},
					 {"150012","김유신","영업부"},
					 {"150013","홍길순","회계부"},
					};
	Object [] columnNames={"사번","이름","근무부서" };
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
		
		this.setTitle("사원 정보 테이블");
		
		add(new JScrollPane(table));
		pack();
		setVisible(true);
		
	}
	public static void main(String[] args){
		
		JTableTest1 t=new JTableTest1();
		t.startFrame();
	}

}
