package ch16.ex3;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

class Dialog1 extends JDialog{
	ImageIcon icon1;
    
    JLabel jlb = new JLabel("");
    public Dialog1(String str){
    	this.setTitle(str);
        getContentPane().add(jlb);
        icon1=new ImageIcon("gallery.png");
        jlb.setIcon(icon1);
        
        this.setLocation(200, 200);//다이얼로그 출력 위치를 정한다.
        setSize(400,400);
        setModal(true); //항상 부모창 위에 보이게 한다.
        setVisible(true);
    }
}

