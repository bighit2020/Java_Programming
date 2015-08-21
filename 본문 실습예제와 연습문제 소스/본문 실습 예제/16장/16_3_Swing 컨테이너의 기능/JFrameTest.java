package ch16.ex1;

import java.awt.Container;
import javax.swing.*;

public class JFrameTest extends JFrame {
	public JFrameTest(){
		super("JFrame 테스트");
		
		JButton btn1=new JButton("추가");
		JTextField tf1=new JTextField("Jframe 테스트");
		JButton btn2=new JButton("삭제");
		
		Container con=getContentPane(); //contentPane 을 가지고 올 때 사용하는 메소드
		con.add(tf1,"North");
		con.add(btn1,"Center");
		con.add(btn2,"South");
		
		setSize(200,300);
		setVisible(true);
		
		//종료 버튼 클릭 시 프로그램을 종료 시킨다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args){
		new JFrameTest();
	}

}
