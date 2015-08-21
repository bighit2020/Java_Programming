package ch16.ex1a;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JMenuTest3 extends JFrame  {
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
    
   
	public JMenuTest3(){
		  f = new JFrame("렌트카 예약 시스템");
		menuBar = new JMenuBar();
		   //메인 메뉴  항목 객체 생성
		carMenu = new JMenu("차량 관리");
		memberMenu = new JMenu("회원관리");
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
		 
		  menuBar.add(memberMenu); //메뉴바에 "회원관리"항목을 단다.
		  //회원 관리 메뉴 관련 서브 메뉴 항목
		  memberMenu.add(memMenu21=new JMenuItem("회원등록"));
		  memberMenu.add(memMenu22=new JMenuItem("회원조회"));
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
		  //메뉴 항목 선택 이벤트와 이벤트 리스너를 연결한다.
		  carMenu11.addActionListener(new CarHandler());
		  carMenu12.addActionListener(new CarHandler());
		  carMenu13.addActionListener(new CarHandler());
		  carMenu14.addActionListener(new CarHandler());
		  
		  memMenu21.addActionListener(new MemberHandler());
		  memMenu22.addActionListener(new MemberHandler());
		  memMenu23.addActionListener(new MemberHandler());
		  memMenu24.addActionListener(new MemberHandler());
		  
		  helpMenu41.addActionListener(new HelpHandler());
	}

	private class CarHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			if(e.getSource()==carMenu11){
				new RegCarDialog("차량등록창");
			}else if(e.getSource()==carMenu12){
				openFile();
			}else if(e.getSource()==carMenu13){
				  try{
				      saveFile();
				   } catch (IOException ex){
				    ex.printStackTrace();
				   }
				  System.out.println(" test.txt 파일을 저장했습니다.");
			}
		}
	}
	
	private class MemberHandler implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class HelpHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			version();
		}
	}
	
	//버전 메뉴 클릭 시 수행하는 메소드
		public void version() { // 버전관리창 생성
		  final JDialog d = new JDialog(this, "버전관리");
		  JLabel jbver = new JLabel("       버전1.0");
		  JLabel jbdate = new JLabel("       2015.03.11");
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
		
	// 탐색기로 로컬 PC 파일을 연다.
	private  void openFile(){
		String msg=null;
	  FileDialog d = new FileDialog(f, "파일을 선택하세요.", FileDialog.LOAD);
	  d.setSize(200, 200);
	  d.setVisible(true);
	  msg = (String)d.getDirectory()+" "+(String)d.getFile()+" 을 선택했군요.";
	 }
	  
	//새로 작성한 파일을 test.txt로 저장한다.
	 public void saveFile() throws IOException {                        
	  File file = new File("c:\\test\\test.txt");
	  if(!file.exists()){
	    if(!file.createNewFile()){
	     System.out.println(file.getName()+" 을 생성하는데 실패했습니다.");
	     file.deleteOnExit();
	     System.exit(0);
	    }
	  }
	  
	  
	  FileWriter writer = new FileWriter(file,true);
	  writer.write("파일에 메시지를 저장합니다.\n");
	  writer.close();
	 }		
	 
	public static void main(String[] args){
		JMenuTest3 test=new JMenuTest3();
		test.startFrame();
	}
}
