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
        
        this.setLocation(200, 200);//���̾�α� ��� ��ġ�� ���Ѵ�.
        setSize(400,400);
        setModal(true); //�׻� �θ�â ���� ���̰� �Ѵ�.
        setVisible(true);
    }
}

