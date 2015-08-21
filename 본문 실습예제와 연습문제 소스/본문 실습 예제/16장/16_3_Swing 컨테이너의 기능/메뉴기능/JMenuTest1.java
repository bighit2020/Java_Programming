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
	JMenu carMenu, memberMenu, rentMenu,helpMenu; //메인 메뉴 항목
	//서브 메뉴 항목
		 JMenuItem carMenu11, carMenu12, carMenu13, carMenu14;
		 JMenuItem memMenu21, memMenu22, memMenu23, memMenu24;
		 JMenuItem helpMenu41;
	JPanel jPanel;
	JLabel lCarName;
	JTextField tf ;
    JButton searchBtn ;
    
   
	public JMenuTest1(){
		  f = new JFrame("렌트카 예약 시스템");
		menuBar = new JMenuBar();
		   //메인 메뉴  항목 객체 생성
		carMenu = new JMenu("차량 관리");
		memberMenu = new JMenu("회원관리");
		rentMenu = new JMenu("예약관리");
		helpMenu = new JMenu("도움말");
	}
	 

	// 서브메뉴 생성 메소드
		protected void startFrame() { 
		  f.setJMenuBar(menuBar); //Frame에 메뉴바를 단다.
		  menuBar.add(carMenu); //메뉴바에 "파일"항목을 단다.
		  //파일 메뉴 관련 서브 메뉴 항목
		  carMenu.add(carMenu11 = new JMenuItem("챠량등록"));
		  carMenu.add(carMenu12 = new JMenuItem("차량조회"));
		  carMenu.addSeparator(); //분리선 설정하기
		  carMenu.add(carMenu13 = new JMenuItem("차량수정"));
		  carMenu.add(carMenu14 = new JMenuItem("차량삭제"));
		 
		  menuBar.add(memberMenu); 
		  //회원 관리 메뉴 관련 서브 메뉴 항목
		  memberMenu.add(memMenu21=new JMenuItem("회원등록"));
		  memberMenu.add(memMenu22=new JMenuItem("회원조회"));
		  memberMenu.addSeparator(); 
		  memberMenu.add(memMenu23=new JMenuItem("회원수정"));
		  memberMenu.add(memMenu24=new JMenuItem("회원삭제"));
		 
		  
		  menuBar.add(helpMenu);
		  helpMenu.add(helpMenu41 = new JMenuItem("버전"));
		  
		  
		 jPanel=new JPanel();
		 lCarName=new JLabel("차량명");
		  tf = new JTextField(10);
		  searchBtn = new JButton("차량 조회하기");
		    
		 jPanel.add(lCarName);
		 jPanel.add(tf);
		 jPanel.add(searchBtn);
		 
		 
		 Container con=f.getContentPane(); //contentPane 을 가지고 올 때 사용하는 메소드
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
