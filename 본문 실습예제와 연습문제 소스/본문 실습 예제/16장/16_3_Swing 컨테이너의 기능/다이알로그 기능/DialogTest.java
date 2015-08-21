package ch16.ex3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class DialogTest extends JFrame implements ActionListener{
	JLabel label=new JLabel("다이얼로그 테스트");
    JButton jbt = new JButton("첫번째다이얼로그 띄위기");
    JButton jbt2 = new JButton("두번째다이얼로그 띄위기");
    Dialog1 tf2;
    public DialogTest(){
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        this.setLayout(new GridLayout(3,0));
        getContentPane().add(label);
        getContentPane().add(jbt);
        getContentPane().add(jbt2);
        
        this.setLocation(200, 200);//다이얼로그 출력 위치를 정한다.  
        this.setSize(300,300);
        this.setVisible(true);
           
        jbt.addActionListener(this);
        jbt2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            if(arg0.getSource() == jbt ){
                    tf2 = new Dialog1(arg0.getActionCommand() + " 버튼을 누르셨군요!");
            }else if(arg0.getSource() == jbt2){
            	 new Dialog2(this,label,"두번째 다이얼로그창입니다.");
            }
    }
    public static void main(String[] args){
    	new DialogTest();
    }
}
