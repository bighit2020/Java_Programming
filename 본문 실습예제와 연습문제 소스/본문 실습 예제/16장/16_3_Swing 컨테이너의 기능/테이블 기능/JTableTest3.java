package ch16.ex1.jtable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JTableTest3  extends JFrame{
	JPanel searchPanel;
	JPanel btnPanel;
	
	JList memberJList;
	JLabel lCondition;
	JTextField tCondition;
	JButton searchBtn;
	JComboBox combo;
	JTable memTable;
	
	JButton updateBtn, deleteBtn;
	
	Object[][] arrMember = new Object[0][4];
	
     
	public JTableTest3(){
		initInstance();  //������Ʈ �ν��Ͻ��� ���� �� �ʱ�ȭ �Ѵ�.
    	setTitle("���̺� �ǽ�");
         setLayout(new BorderLayout());
        Container c=getContentPane();
        c.add(searchPanel,"North");
        c.add(new JScrollPane(memTable),"Center");
        c.add(btnPanel,"South");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200, 200);//���̾�α� ��� ��ġ�� ���Ѵ�.
        pack();
        setVisible(true);
	}
	
	private void  initInstance(){
		searchPanel=new JPanel();
		
		tCondition=new JTextField(10);
		lCondition=new JLabel("�Է�â");
		
		memberJList=new JList();
		memberJList.setBackground(Color.GREEN);
		memTable=new JTable();
		memTable.setModel(new TableModel(arrMember));
		
		
		searchBtn=new JButton("��ȸ�ϱ�");
		searchBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	arrMember = new Object[6][3];
            	arrMember[0][0]="150000";
            	arrMember[0][1]="ȫ�浿";
            	arrMember[0][2]="������";
            	
            	arrMember[1][0]="150001";
            	arrMember[1][1]="�̼���";
            	arrMember[1][2]="ȸ���";
            			
            	arrMember[2][0]="150002";
            	arrMember[2][1]="������";
            	arrMember[2][2]="���ߺ�";
            						
            	arrMember[3][0]="150003";
            	arrMember[3][1]="������";
            	arrMember[3][2]="���ߺ�";		
            	
            	arrMember[4][0]="150004";
            	arrMember[4][1]="���θ�";
            	arrMember[4][2]="�ѹ���";
            	
            	arrMember[5][0]="150005";
            	arrMember[5][1]="����ũ";
            	arrMember[5][2]="������";	
            	
            	memTable.setModel(new TableModel(arrMember));
            }
         });
		
		searchPanel.add(lCondition);
		searchPanel.add(tCondition);
		searchPanel.add(searchBtn);
		
		btnPanel=new JPanel();
		updateBtn=new JButton("�����ϱ�");
		deleteBtn=new JButton("�����ϱ�");
		btnPanel.add(updateBtn);
		btnPanel.add(deleteBtn);
	}
	public static void main(String[] args){
		new JTableTest3();
	}
}


