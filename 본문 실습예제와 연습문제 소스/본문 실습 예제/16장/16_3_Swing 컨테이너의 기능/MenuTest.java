package ch16.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MenuTest extends JFrame implements ActionListener {
 
	 JFrame f;
	 JMenuBar menuBar;
	 JMenu fileMenu, editMenu, helpMenu; //메인 메뉴 항목
	 JLabel lb, hlb;
	 String msg = " ";
	 
	 //서브 메뉴 항목
	 JMenuItem fileMenu11, fileMenu12, fileMenu13, fileMenu14, fileMenu15, fileMenu16;
	 JMenuItem editMenu21, editMenu22, editMenu23, editMenu24;
	 JMenuItem helpMenu31;
	 
	public MenuTest() { // 메인메뉴 생성
	  f = new JFrame("메뉴 기능");
	  menuBar = new JMenuBar();
	   //메인 메뉴  항목 객체 생성
	  fileMenu = new JMenu("파일");
	  editMenu = new JMenu("편집");
	  helpMenu = new JMenu("도움말");
	 }
	 
	// 서브메뉴 생성 메소드
	public void startFrame() { 
	  f.setJMenuBar(menuBar); //Frame에 메뉴바를 단다.
	  menuBar.add(fileMenu); //메뉴바에 "파일"항목을 단다.
	  //파일 메뉴 관련 서브 메뉴 항목
	  fileMenu.add(fileMenu11 = new JMenuItem("새글 작성"));
	  fileMenu.add(fileMenu12 = new JMenuItem("파일 열기"));
	  fileMenu.add(fileMenu13 = new JMenuItem("파일 저장"));
	  fileMenu.add(fileMenu14 = new JMenuItem("파일 다른 이름 저장"));
	  fileMenu.addSeparator(); //분리선 설정하기
	  fileMenu.add(fileMenu15 = new JMenuItem("내용 출력"));
	  fileMenu.addSeparator();
	  fileMenu.add(fileMenu16 = new JMenuItem("끝내기"));
	 
	  
	  menuBar.add(editMenu); //메뉴바에 "편집"항목을 단다.
	  //편집 메뉴 관련 서브 메뉴 항목
	  editMenu.add(editMenu21 = new JCheckBoxMenuItem("복사"));
	  editMenu.add(editMenu22 = new JCheckBoxMenuItem("붙여넣기"));
	  editMenu.addSeparator();
	  ButtonGroup bg = new ButtonGroup();
	  //버튼이 있는 메뉴 항목을 생성한다.
	  JRadioButtonMenuItem m23 = new JRadioButtonMenuItem("부분 검색");
	  bg.add(m23);
	  editMenu.add(m23);
	  JRadioButtonMenuItem m24 = new JRadioButtonMenuItem("전체 검색");
	  bg.add(m24);
	  editMenu.add(m24);
	  
	  //메뉴바에 '도움말' 메뉴 항목을 단다. 
	  menuBar.add(helpMenu);
	  helpMenu.add(helpMenu31 = new JMenuItem("버전"));
	  lb = new JLabel(" ");
	  
	  f.add(lb);
	  
	  f.setLocation(200, 200);
	  f.setSize(600, 400);
	  f.setVisible(true);
	  
	  //메뉴 항목 선택 이벤트와 이벤트 리스너를 연결한다.
	  fileMenu11.addActionListener(this);
	  fileMenu12.addActionListener(this);
	  fileMenu13.addActionListener(this);
	  fileMenu14.addActionListener(this);
	  fileMenu15.addActionListener(this);
	  fileMenu16.addActionListener(this);
	  helpMenu31.addActionListener(this);
	 }
	
	//버전 메뉴 클릭 시 수행하는 메소드
	public void version() { // 버전관리창 생성
	  final JDialog d = new JDialog(this, "버전관리");
	  JLabel jbver = new JLabel("       버전1.0");
	  JLabel jbdate = new JLabel("       2014.12.27");
	  JLabel jbauthor = new JLabel("       제작 : idea java");
	  
	  d.setLayout(new FlowLayout());
	  d.add(jbver);
	  d.add(jbdate);
	  d.add(jbauthor);
	  
	  d.setLocation(250, 230);
	  d.setSize(200, 100);
	  d.setVisible(true);
	  
	  d.addWindowListener(new WindowAdapter(){ // 버전관리창 종료
		   public void windowClosing(WindowEvent e){
			   d.dispose();
			   d.setVisible(false);
		   }
	  });
	 }
	
	// 메뉴에서 선택한 항목 페이지에 표시
	 public void actionPerformed(ActionEvent ae) {                 
	  msg = "선택 항목 ==> ";
	  if (ae.getSource() == fileMenu11)
		  msg += "새글 작성";
	  else if (ae.getSource() == fileMenu12)
		  msg += "파일 열기";
	  else if (ae.getSource() == fileMenu13)
		   msg += " test.txt 파일을 저장했습니다.";
	  else if (ae.getSource() == fileMenu14)
		  msg += "파일 다른 이름 저장";
	  else if (ae.getSource() == fileMenu15)
		  msg += "내용 출력";
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