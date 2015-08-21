package ch16.ex1.jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JTableTest2  extends JFrame{
	JTable table;
	
	Object[][] rows={
				{"150000","�ڱ浿","�ѹ���"},
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
			};
	Object [] columnNames={"���","�̸�","�ٹ��μ�" };
	
	int rowIdx=0,colIdx=0;
	
	public JTableTest2(){
		table=new JTable(rows,columnNames);
		
		ListSelectionModel rowSM = table.getSelectionModel();
     
		//rowSM.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
       //rowSM.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//���̺��� ���� �������� �� �̺�Ʈ�� ó���Ѵ�.
		rowSM.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        rowSM.addListSelectionListener(new ListSelectionListener(){
                        public void valueChanged(ListSelectionEvent e) {
                                if (!e.getValueIsAdjusting())        {
                                        ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                                        rowIdx=lsm.getMinSelectionIndex();
                                        System.out.println(lsm.getMinSelectionIndex()+ " ��° ���� ���õ�...");
                                        System.out.println(rows[rowIdx][colIdx]);
                                }
                        }
                }
        );
        
        //���̺��� ���� �������� �� �̺�Ʈ�� ó���Ѵ�.
        ListSelectionModel colSM = table.getColumnModel().getSelectionModel();
        colSM.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        colSM.addListSelectionListener(new ListSelectionListener(){
                        public void valueChanged(ListSelectionEvent e) {
                                ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                                colIdx=lsm.getMinSelectionIndex();
                                if (!e.getValueIsAdjusting()){
                                        System.out.println(lsm.getMinSelectionIndex()+ " ��° ���� ���õ�...");
                                        System.out.println(rows[rowIdx][colIdx]);
                                }
                        }
                }
        );		
	}
	public void startFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("���̺� �׽�Ʈ");
		add(new JScrollPane(table));
		pack();
		setVisible(true);
		
	}
	public static void main(String[] args){
		
		JTableTest2 t=new JTableTest2();
		t.startFrame();
	}

}
