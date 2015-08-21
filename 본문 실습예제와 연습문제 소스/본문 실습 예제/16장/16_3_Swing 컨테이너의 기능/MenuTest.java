package ch16.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MenuTest extends JFrame implements ActionListener {
 
	 JFrame f;
	 JMenuBar menuBar;
	 JMenu fileMenu, editMenu, helpMenu; //���� �޴� �׸�
	 JLabel lb, hlb;
	 String msg = " ";
	 
	 //���� �޴� �׸�
	 JMenuItem fileMenu11, fileMenu12, fileMenu13, fileMenu14, fileMenu15, fileMenu16;
	 JMenuItem editMenu21, editMenu22, editMenu23, editMenu24;
	 JMenuItem helpMenu31;
	 
	public MenuTest() { // ���θ޴� ����
	  f = new JFrame("�޴� ���");
	  menuBar = new JMenuBar();
	   //���� �޴�  �׸� ��ü ����
	  fileMenu = new JMenu("����");
	  editMenu = new JMenu("����");
	  helpMenu = new JMenu("����");
	 }
	 
	// ����޴� ���� �޼ҵ�
	public void startFrame() { 
	  f.setJMenuBar(menuBar); //Frame�� �޴��ٸ� �ܴ�.
	  menuBar.add(fileMenu); //�޴��ٿ� "����"�׸��� �ܴ�.
	  //���� �޴� ���� ���� �޴� �׸�
	  fileMenu.add(fileMenu11 = new JMenuItem("���� �ۼ�"));
	  fileMenu.add(fileMenu12 = new JMenuItem("���� ����"));
	  fileMenu.add(fileMenu13 = new JMenuItem("���� ����"));
	  fileMenu.add(fileMenu14 = new JMenuItem("���� �ٸ� �̸� ����"));
	  fileMenu.addSeparator(); //�и��� �����ϱ�
	  fileMenu.add(fileMenu15 = new JMenuItem("���� ���"));
	  fileMenu.addSeparator();
	  fileMenu.add(fileMenu16 = new JMenuItem("������"));
	 
	  
	  menuBar.add(editMenu); //�޴��ٿ� "����"�׸��� �ܴ�.
	  //���� �޴� ���� ���� �޴� �׸�
	  editMenu.add(editMenu21 = new JCheckBoxMenuItem("����"));
	  editMenu.add(editMenu22 = new JCheckBoxMenuItem("�ٿ��ֱ�"));
	  editMenu.addSeparator();
	  ButtonGroup bg = new ButtonGroup();
	  //��ư�� �ִ� �޴� �׸��� �����Ѵ�.
	  JRadioButtonMenuItem m23 = new JRadioButtonMenuItem("�κ� �˻�");
	  bg.add(m23);
	  editMenu.add(m23);
	  JRadioButtonMenuItem m24 = new JRadioButtonMenuItem("��ü �˻�");
	  bg.add(m24);
	  editMenu.add(m24);
	  
	  //�޴��ٿ� '����' �޴� �׸��� �ܴ�. 
	  menuBar.add(helpMenu);
	  helpMenu.add(helpMenu31 = new JMenuItem("����"));
	  lb = new JLabel(" ");
	  
	  f.add(lb);
	  
	  f.setLocation(200, 200);
	  f.setSize(600, 400);
	  f.setVisible(true);
	  
	  //�޴� �׸� ���� �̺�Ʈ�� �̺�Ʈ �����ʸ� �����Ѵ�.
	  fileMenu11.addActionListener(this);
	  fileMenu12.addActionListener(this);
	  fileMenu13.addActionListener(this);
	  fileMenu14.addActionListener(this);
	  fileMenu15.addActionListener(this);
	  fileMenu16.addActionListener(this);
	  helpMenu31.addActionListener(this);
	 }
	
	//���� �޴� Ŭ�� �� �����ϴ� �޼ҵ�
	public void version() { // ��������â ����
	  final JDialog d = new JDialog(this, "��������");
	  JLabel jbver = new JLabel("       ����1.0");
	  JLabel jbdate = new JLabel("       2014.12.27");
	  JLabel jbauthor = new JLabel("       ���� : idea java");
	  
	  d.setLayout(new FlowLayout());
	  d.add(jbver);
	  d.add(jbdate);
	  d.add(jbauthor);
	  
	  d.setLocation(250, 230);
	  d.setSize(200, 100);
	  d.setVisible(true);
	  
	  d.addWindowListener(new WindowAdapter(){ // ��������â ����
		   public void windowClosing(WindowEvent e){
			   d.dispose();
			   d.setVisible(false);
		   }
	  });
	 }
	
	// �޴����� ������ �׸� �������� ǥ��
	 public void actionPerformed(ActionEvent ae) {                 
	  msg = "���� �׸� ==> ";
	  if (ae.getSource() == fileMenu11)
		  msg += "���� �ۼ�";
	  else if (ae.getSource() == fileMenu12)
		  msg += "���� ����";
	  else if (ae.getSource() == fileMenu13)
		   msg += " test.txt ������ �����߽��ϴ�.";
	  else if (ae.getSource() == fileMenu14)
		  msg += "���� �ٸ� �̸� ����";
	  else if (ae.getSource() == fileMenu15)
		  msg += "���� ���";
	  else if (ae.getSource() == helpMenu31)
		  version();
	  else if (ae.getSource() == fileMenu16)
		  System.exit(0);
	  
	  	lb.setText(msg);
	 }
	 
	 public static void main(String[] args) {
		 MenuTest menu = new MenuTest();
		 menu.startFrame();
	 }
}