package ch16.ex1a;

import java.awt.*;
import javax.swing.*;

public class RegCarDialog  extends JDialog{
	JPanel jPanel;
	JLabel lCarName;
	JTextField tf ;
    JButton regBtn ;
    
    
    
    public RegCarDialog(String str){
    	this.setTitle(str);
    	 setLayout(new FlowLayout());
        
    	 lCarName = new JLabel("차량명");
    	 tf=new JTextField("차량명을 입력하세요");
    	 regBtn=new JButton("등록하기");
    	 
        this.add(lCarName);
        this.add(tf);
        this.add(regBtn);
        
        this.setLocation(200, 200);//다이얼로그 출력 위치를 정한다.
        setSize(400,400);
        setModal(true); //항상 부모창 위에 보이게 한다.
        setVisible(true);
    }
}
