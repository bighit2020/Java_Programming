package prj.member;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class MemberWindow extends BaseWindow {
	public MemberWindow(){
		System.out.println("������ ȣ��");		
		
		frame =new JFrame("ȸ������â");
		lId=new JLabel("���̵�",Label.RIGHT);
		lName=new JLabel("�̸�",Label.RIGHT);
		lHeight=new JLabel("Ű",Label.RIGHT);
		lWeight = new JLabel("������",Label.RIGHT);
		lAge  = new JLabel("����",Label.RIGHT);
		
		lId.setHorizontalAlignment(JLabel.CENTER);
		lName.setHorizontalAlignment(JLabel.CENTER);
		lHeight.setHorizontalAlignment(JLabel.CENTER);
		lWeight.setHorizontalAlignment(JLabel.CENTER);
		lAge.setHorizontalAlignment(JLabel.CENTER);
		
		tId =new JTextField();
		tName =new JTextField();
		tHeight=new JTextField();
		tWeight = new JTextField();
		tAge = new JTextField();
		
		btnSearch = new JButton("��ȸ");
		btnInsert = new JButton("�߰�");
		btnUpdate = new JButton("����");
		btnDelete = new JButton("����");
		
				
	}
	
	//ȸ�� ���� ȭ���� �����Ѵ�.
	public void startGUI(){
		part1 = new JPanel();
		part1.setLayout(new GridLayout(1,0));
		part1.add(lId);		
		part1.add(tId);
		
		part2 = new JPanel();
		part2.setLayout(new GridLayout(1,0));
		part2.add(lName);
		part2.add(tName);
		
		part3= new JPanel();
		part3.setLayout(new GridLayout(1,0));
		part3.add(lHeight);
		part3.add(tHeight);
		
		part4= new JPanel();
		part4.setLayout(new GridLayout(1,0));
		part4.add(lWeight);
		part4.add(tWeight);
		
		part5 = new JPanel();
		part5.setLayout(new GridLayout(1,0));
		part5.add(lAge);
		part5.add(tAge);
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(0,1));
		p1.add(part1);
		p1.add(part2);
		p1.add(part3);
		p1.add(part4);
		p1.add(part5);
		
		
		p2 = new JPanel();
		 
		p2.add(btnSearch);
		p2.add(btnInsert);
		p2.add(btnUpdate);
		p2.add(btnDelete);
		
		guiList = new List(2, false); 
		guiList.setBackground(Color.green);
		//Listener�� ����Ѵ�.
		btnSearch.addActionListener(new MemberHandler());
		btnInsert.addActionListener(new MemberHandler());
		btnUpdate.addActionListener(new MemberHandler());
		btnDelete.addActionListener(new MemberHandler());

		init();//���α׷� ���� �� DB�� �����ؼ� �����͸� ��ȸ�Ѵ�.
		
		frame.add(p1,"North");
		frame.add(guiList,"Center");
		frame.add(p2,"South");
		
		frame.setSize(500,500);
		frame.setVisible(true);
		
		
	}
	
	public class MemberHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnSearch){
				init();
			}else if(e.getSource()==btnInsert){
				
				//����ڰ� �Է��� ȸ�� ������ ������ �´�.
				MemberVo mem=new MemberVo();
				String id=tId.getText();
				String name=tName.getText();
				int height=Integer.parseInt(tHeight.getText());
				int weight=Integer.parseInt(tWeight.getText());
				int age=Integer.parseInt(tAge.getText());
				
				mem.setId(id);
				mem.setName(name);
				mem.setHeight(height);
				mem.setWeight(weight);
				mem.setAge(age);
				//ȸ���������� �߰��Ѵ�.
				memberController.insertMember(mem);
				//ȸ�� ������ �߰��� �� �����͸� ��ȸ�Ѵ�.
				init();
			}else if(e.getSource()==btnUpdate){
				System.out.println("���� ��ư Ŭ��");
				//memberController.updateMember(mem);
				
			}else if(e.getSource()==btnDelete){
				System.out.println("���� ��ư Ŭ��");
				//memberController.deleteMember(mem);
			}
			
		}
		
	}

}
