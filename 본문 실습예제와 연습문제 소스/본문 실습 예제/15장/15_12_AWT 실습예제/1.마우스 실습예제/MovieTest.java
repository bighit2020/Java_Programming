package ch15.ex7;

import java.awt.*;
import java.awt.event.*;

public class MovieTest  extends Frame implements ActionListener{
	TextField tMovieTitle=new TextField(30);
	Button btnTitleInsert=new Button("��ȭ���� �߰�");
	Button btnTitleDelete=new Button("��� ����");
	List movieList=new List();
	
	Button exit=new Button("����");
	
	public MovieTest(){
		super("��ȭ���� ���� ȭ��");
		
		movieList.setBackground(Color.green);
		
		Panel p=new Panel();
		p.add(new Label("��ȭ���� �Է�"));
		p.add(tMovieTitle);
		p.add(btnTitleInsert);
		p.add(btnTitleDelete);
		
		add(BorderLayout.NORTH,p);
		add(BorderLayout.CENTER,movieList);
		add(BorderLayout.SOUTH,exit);
		
		setBounds(0,0,800,600);
		setVisible(true);
		//Listener�� �����Ѵ�.
		movieList.addActionListener(this);
		btnTitleInsert.addActionListener(this);
		btnTitleDelete.addActionListener(this);
		exit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();
		String mTitle=null; //�Է��� ��ȭ ����
		if(str.equals("��ȭ���� �߰�")){
			System.out.println("��ȭ���� �߰��ϱ�");
			mTitle=tMovieTitle.getText().trim(); //��ȸ ������ ������ �´�.
			movieList.add(mTitle);
			System.out.println(mTitle);
			//��ȭ������ �߰��Ѵ�.
		}else if(str.equals("��� ����")){
			System.out.println("��� ����");
			movieList.removeAll();  //����Ʈ���� ��� ��ȭ ������ �����Ѵ�.
		}else{
			movieList.remove(str); //����Ʈ���� ������ ��ȭ ������ �����Ѵ�.
		}
		
		if(str.equals("����"))
			System.exit(0);
		
	}

	public static void main(String[] args){
		new MovieTest();
	}
}
