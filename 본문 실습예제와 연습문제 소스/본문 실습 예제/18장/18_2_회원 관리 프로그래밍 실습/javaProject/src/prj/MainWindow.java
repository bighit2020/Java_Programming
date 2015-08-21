package prj;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import prj.member.MemberWindow;


public class MainWindow {
	private JFrame frame;
	private JButton btnMember,btnBoard,btnMovie;
	
	public MainWindow(){
		frame=new JFrame("���� ȭ��");
		btnMember=new JButton("ȸ�� ����");
		btnBoard=new JButton("�Խ��� ����");
		btnMovie=new  JButton("��ȭ ����");
	}
	
	public void startMain(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.add(btnMember);
		frame.add(btnBoard);
		frame.add(btnMovie);
		
		//Listener�����ϱ�
		btnMember.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberWindow  memberWindow = new MemberWindow();
				memberWindow.startGUI();
			}
		});
		
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	public static void main(String args[]){
		//
		MainWindow main=new MainWindow();
		main.startMain();
	}
}
