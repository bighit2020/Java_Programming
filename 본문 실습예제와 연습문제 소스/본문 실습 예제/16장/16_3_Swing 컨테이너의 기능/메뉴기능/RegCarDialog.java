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
        
    	 lCarName = new JLabel("������");
    	 tf=new JTextField("�������� �Է��ϼ���");
    	 regBtn=new JButton("����ϱ�");
    	 
        this.add(lCarName);
        this.add(tf);
        this.add(regBtn);
        
        this.setLocation(200, 200);//���̾�α� ��� ��ġ�� ���Ѵ�.
        setSize(400,400);
        setModal(true); //�׻� �θ�â ���� ���̰� �Ѵ�.
        setVisible(true);
    }
}
