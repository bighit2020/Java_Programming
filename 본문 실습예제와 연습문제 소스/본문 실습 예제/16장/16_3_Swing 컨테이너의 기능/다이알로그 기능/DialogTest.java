package ch16.ex3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class DialogTest extends JFrame implements ActionListener{
	JLabel label=new JLabel("���̾�α� �׽�Ʈ");
    JButton jbt = new JButton("ù��°���̾�α� ������");
    JButton jbt2 = new JButton("�ι�°���̾�α� ������");
    Dialog1 tf2;
    public DialogTest(){
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        this.setLayout(new GridLayout(3,0));
        getContentPane().add(label);
        getContentPane().add(jbt);
        getContentPane().add(jbt2);
        
        this.setLocation(200, 200);//���̾�α� ��� ��ġ�� ���Ѵ�.  
        this.setSize(300,300);
        this.setVisible(true);
           
        jbt.addActionListener(this);
        jbt2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            if(arg0.getSource() == jbt ){
                    tf2 = new Dialog1(arg0.getActionCommand() + " ��ư�� �����̱���!");
            }else if(arg0.getSource() == jbt2){
            	 new Dialog2(this,label,"�ι�° ���̾�α�â�Դϴ�.");
            }
    }
    public static void main(String[] args){
    	new DialogTest();
    }
}
