package ch16.ex1a;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JMenuTest1 extends JFrame  {
	JFrame f;
	JMenuBar menuBar;
	JMenu carMenu, memberMenu, rentMenu,helpMenu; //���� �޴� �׸�
	//���� �޴� �׸�
		 JMenuItem carMenu11, carMenu12, carMenu13, carMenu14;
		 JMenuItem memMenu21, memMenu22, memMenu23, memMenu24;
		 JMenuItem helpMenu41;
	JPanel jPanel;
	JLabel lCarName;
	JTextField tf ;
    JButton searchBtn ;
    
   
	public JMenuTest1(){
		  f = new JFrame("��Ʈī ���� �ý���");
		menuBar = new JMenuBar();
		   //���� �޴�  �׸� ��ü ����
		carMenu = new JMenu("���� ����");
		memberMenu = new JMenu("ȸ������");
		rentMenu = new JMenu("�������");
		helpMenu = new JMenu("����");
	}
	 

	// ����޴� ���� �޼ҵ�
		protected void startFrame() { 
		  f.setJMenuBar(menuBar); //Frame�� �޴��ٸ� �ܴ�.
		  menuBar.add(carMenu); //�޴��ٿ� "����"�׸��� �ܴ�.
		  //���� �޴� ���� ���� �޴� �׸�
		  carMenu.add(carMenu11 = new JMenuItem("í�����"));
		  carMenu.add(carMenu12 = new JMenuItem("������ȸ"));
		  carMenu.addSeparator(); //�и��� �����ϱ�
		  carMenu.add(carMenu13 = new JMenuItem("��������"));
		  carMenu.add(carMenu14 = new JMenuItem("��������"));
		 
		  menuBar.add(memberMenu); 
		  //ȸ�� ���� �޴� ���� ���� �޴� �׸�
		  memberMenu.add(memMenu21=new JMenuItem("ȸ�����"));
		  memberMenu.add(memMenu22=new JMenuItem("ȸ����ȸ"));
		  memberMenu.addSeparator(); 
		  memberMenu.add(memMenu23=new JMenuItem("ȸ������"));
		  memberMenu.add(memMenu24=new JMenuItem("ȸ������"));
		 
		  
		  menuBar.add(helpMenu);
		  helpMenu.add(helpMenu41 = new JMenuItem("����"));
		  
		  
		 jPanel=new JPanel();
		 lCarName=new JLabel("������");
		  tf = new JTextField(10);
		  searchBtn = new JButton("���� ��ȸ�ϱ�");
		    
		 jPanel.add(lCarName);
		 jPanel.add(tf);
		 jPanel.add(searchBtn);
		 
		 
		 Container con=f.getContentPane(); //contentPane �� ������ �� �� ����ϴ� �޼ҵ�
		 con.add(jPanel,"North");
		 
		  f.setLocation(200, 100);
		  f.setSize(800, 600);
		  f.setVisible(true);
		  f.setDefaultCloseOperation(EXIT_ON_CLOSE );
	}
		
	public static void main(String[] args){
		JMenuTest1 test=new JMenuTest1();
		test.startFrame();
	}
}
