package ch16.ex6;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class MovieWindow  extends JFrame implements ActionListener{
	String resultMsg=null; 
	JTextField tMovieTitle=new JTextField(30);
	JButton btnTitleInsert=new JButton("��ȭ���� �߰�");
	JButton btnSave=new JButton("��ȭ���� ���� ����");
	List movieList=new List();
	MovieController controller=new MovieController();
	
	JButton btnExit=new JButton("����");
	
	public MovieWindow(){
		super("��ȭ���� ���� ȭ��");
		movieList.setBackground(Color.green);
		
		Panel p=new Panel();
		p.add(new Label("��ȭ���� �Է�"));
		p.add(tMovieTitle);
		p.add(btnTitleInsert);
		p.add(btnSave);
		
		add(BorderLayout.NORTH,p);
		add(BorderLayout.CENTER,movieList);
		add(BorderLayout.SOUTH,btnExit);
		
		setBounds(0,0,800,600);
		setVisible(true);
		
		//Listener�� �����Ѵ�.
		movieList.addActionListener(this);
		btnTitleInsert.addActionListener(this);
		btnSave.addActionListener(this);
		btnExit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String mTitle=e.getActionCommand();
		//��ȭ������ �߰��Ѵ�.
		if(e.getSource()==btnTitleInsert){
			System.out.println("��ȭ���� �߰��ϱ�");
			//�ؽ�Ʈ�ʵ忡 �Է��� ��ȭ������ ������ �´�.
			mTitle=tMovieTitle.getText().trim();
			controller.addTitle(mTitle,movieList);
			tMovieTitle.setText("");
			resultMsg="��ȭ ������ �߰��߽��ϴ�.";
		//��ȭ������ ���Ͽ� �����Ѵ�.
		}else if(e.getSource()==btnSave){
			System.out.println("���� ����");
			controller.saveTitles(movieList);
			resultMsg="��ȭ������ ���Ͽ� �����߽��ϴ�.";
		//����Ʈ�� ������ ���� Ŭ���� ������ �����.
		}else{
			controller.delTitle(mTitle, movieList);
			resultMsg="��ȭ������ �����߽��ϴ�.";
			
		}
		//���̾�α׷� ó�� ����� ���� �ش�.
		JOptionPane.showMessageDialog(this,
				 resultMsg,
				 "������ �ڽ�",
                JOptionPane.INFORMATION_MESSAGE);
		
		if(e.getSource()==btnExit)
			System.exit(1);
		
	}

	public static void main(String[] args){
		new MovieWindow();
	}
}
