package ch16.ex3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Dialog2 extends JDialog {
    JTextField tf = new JTextField(10);
    JButton okButton = new JButton("OK");
    
    public Dialog2(JFrame frame, JLabel label,String title) {
        super(frame,title);
        setLayout(new FlowLayout());
        add(tf);
        add(okButton);
        
        this.setLocation(200, 200);
        setSize(200, 200);
        setVisible(true);
        setModal(true);
        // 다이얼로그의 OK 버튼에 Action 리스너 달기
        // OK 버튼이 선택되면 다이얼로그가 화면에서 사라지게 한다.
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // setVisible(false); // 다이얼로그를 보이지 않게 한다.
            	String text=tf.getText();
            	label.setText(text);
            	dispose();
            }
        });
    }
}
