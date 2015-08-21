package ch15.ex7;

import java.awt.*;
import java.awt.event.*;

public class MovieTest  extends Frame implements ActionListener{
	TextField tMovieTitle=new TextField(30);
	Button btnTitleInsert=new Button("영화제목 추가");
	Button btnTitleDelete=new Button("모두 삭제");
	List movieList=new List();
	
	Button exit=new Button("종료");
	
	public MovieTest(){
		super("영화정보 관리 화면");
		
		movieList.setBackground(Color.green);
		
		Panel p=new Panel();
		p.add(new Label("영화제목 입력"));
		p.add(tMovieTitle);
		p.add(btnTitleInsert);
		p.add(btnTitleDelete);
		
		add(BorderLayout.NORTH,p);
		add(BorderLayout.CENTER,movieList);
		add(BorderLayout.SOUTH,exit);
		
		setBounds(0,0,800,600);
		setVisible(true);
		//Listener와 연결한다.
		movieList.addActionListener(this);
		btnTitleInsert.addActionListener(this);
		btnTitleDelete.addActionListener(this);
		exit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();
		String mTitle=null; //입력한 영화 제목
		if(str.equals("영화제목 추가")){
			System.out.println("영화제목 추가하기");
			mTitle=tMovieTitle.getText().trim(); //조회 조건을 가지고 온다.
			movieList.add(mTitle);
			System.out.println(mTitle);
			//영화정보를 추가한다.
		}else if(str.equals("모두 삭제")){
			System.out.println("모두 삭제");
			movieList.removeAll();  //리스트에서 모든 영화 정보를 삭제한다.
		}else{
			movieList.remove(str); //리스트에서 선택한 영화 정보만 삭제한다.
		}
		
		if(str.equals("종료"))
			System.exit(0);
		
	}

	public static void main(String[] args){
		new MovieTest();
	}
}
