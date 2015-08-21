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
        // ���̾�α��� OK ��ư�� Action ������ �ޱ�
        // OK ��ư�� ���õǸ� ���̾�αװ� ȭ�鿡�� ������� �Ѵ�.
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // setVisible(false); // ���̾�α׸� ������ �ʰ� �Ѵ�.
            	String text=tf.getText();
            	label.setText(text);
            	dispose();
            }
        });
    }
}
