package ch16.ex5;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class Client implements ActionListener,  Runnable {
  private static final String SERVER_IP="127.0.0.1";
  //  ��� ���� ����
  private Socket socket;          //  ����
  private JFrame jframe;          //  ������â
  private JTextField jtf;          //  ä�� �Է¶�
  private JTextArea jta;          //  ä�� ���� �����ִ� ��ü
  private JLabel jlb1, jlb2;        //  ��
  private JPanel jp1, jp2;        //  �ǳ�
  private String ip;              //  IP �ּҸ� ������ ����
  private String chatName;        //  �г���(��ȭ��) ������ ����
  private JButton jbtn;          //  ���� ��ư �غ�
  
  InputStream is;
  OutputStream os;
  BufferedReader br_in;
  BufferedWriter bw=null;
  PrintWriter pw=null;
	 
  public Client() {
	//��ȭ���� ���̾�α׷� �Է� �޴´�.
  	chatName=JOptionPane.showInputDialog(jframe, 
            "��ȭ���� �Է��ϼ���!!",
            "��ȭ�� �Է� ���̾�α�",
            JOptionPane.YES_NO_OPTION);
	if(chatName.length()==0 || chatName==null){
    	System.exit(0);
    }
	
    ip = SERVER_IP;  //  IP �ּ�
     //  ��ȭ��
    jframe = new JFrame("��Ƽ ä�� Ŭ���̾�Ʈ ���α׷�");
    
    //  �Ʒ��� �ٴ� �ǳ� �ڵ�
    jp1 = new JPanel();//�Ʒ� �ٴ� �ǳ�
    jp1.setLayout(new BorderLayout());//���������߾� ���̾ƿ�
    jtf = new JTextField(30);  //  30 ����
    jbtn = new JButton("����");//���� ��ư ����
    jp1.add(jbtn, BorderLayout.EAST);
    jp1.add(jtf, BorderLayout.CENTER);
    //  ���ʿ� �ٴ� �ǳ� �ڵ�
    jp2 = new JPanel();//���ʿ� �ٴ� �ǳ�
    jp2.setLayout(new BorderLayout());
    jlb1 = new JLabel("��ȭ�� : [[" + chatName + "]]");//��ȭ�� [[ȫ�浿]]
    jlb1.setBackground(Color.YELLOW);
    jlb2 = new JLabel("���� IP �ּ� : " + ip);//IP �ּ� : 127.0.0.1
    jlb2.setBackground(Color.GREEN);
    jp2.add(jlb1, BorderLayout.CENTER);
    jp2.add(jlb2, BorderLayout.EAST);
    //  �����ӿ� ���̴� �ڵ�
    jta = new JTextArea("", 10, 50);  //  �ʱⰪ, ��(����), ����(��)
    jta.setBackground(Color.GREEN);//��ȭâ ���� ����
    JScrollPane jsp = new JScrollPane(jta, 
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    jframe.add(jp1, BorderLayout.SOUTH);
    jframe.add(jp2, BorderLayout.NORTH);
    jframe.add(jsp, BorderLayout.CENTER);
    //  ������ ���̴� �ڵ�
    jtf.addActionListener(this);
    jbtn.addActionListener(this);
    jframe.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        try {
          pw.println(chatName + "#exit");//ä�� ����
        } catch (Exception ee) {
          ee.printStackTrace();
        }//catch
        System.exit(0);  //  ���α׷� ����
      }//windowClosing
      @Override
      public void windowOpened(WindowEvent e) {
        jtf.requestFocus();  //  jtf �� ��Ŀ���� ���´�.
      }//windowOpened
    });//  ������ �̺�Ʈ ó�� ��
    jta.setEditable(false);//���� X, ä�� ���� �����ֱ⸸ ����
    //  ũ�� ���� �ڵ�
    jframe.pack();//  �ڵ� ũ�� ����
    jframe.setResizable(false);//â ũ�� ���� X
    jframe.setVisible(true);//���̱�
    
   
	
  }//������
  @Override
  public void actionPerformed(ActionEvent e) {  //  �̺�Ʈ ó��
    Object obj = e.getSource();  //  ����Ʈ �߻� ��ġ ���
    String msg = jtf.getText();  //  ä�� ���� �Է� �ޱ�
    if(obj == jtf) {  //  �Է¶����� ���͸� ģ ���
      if(msg == null || msg.length() == 0) {//������ ���� ���
        //  ���â �����ֱ�
        JOptionPane.showMessageDialog(jframe, "���� ������",
            "���", JOptionPane.WARNING_MESSAGE);
      } else {  //  ������ �Է��ϰ� ������ ���
        try {
        	 pw.println(chatName + "#" + msg);
        } catch (Exception ee) {
          ee.printStackTrace();
        }//catch
        jtf.setText("");  //  jtf �� �����.
      }//else : ���� O
    } else if(obj == jbtn) {  //  ���� ��ư�� Ŭ���� ��� 
      try {
    	  pw.println(chatName + "#exit");
      } catch (Exception ee) {
        ee.printStackTrace();
      }//catch
      System.exit(0);
    }//else if : ���� ��ư
  }//actionPerformed
  public void init() {
    try {
    	socket=new  Socket(ip, 5000);
		is=socket.getInputStream();
		os=socket.getOutputStream();
		
		br_in = new BufferedReader(new InputStreamReader(is));
		bw = new BufferedWriter(new OutputStreamWriter(os));
    	pw=new PrintWriter(bw,true); //�ڵ����� flush �Ѵ�.
    		
      Thread t = new Thread(this);
      t.start();  //  ������ ����
    } catch (Exception e) {
      e.printStackTrace();
    }//catch
  }//init
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    Client cc = new Client(); 
    cc.init();  //  ������ ���� �ڵ� ����
  }//main

  @Override
  public void run() {
    String message = null;
    String[] receiveMsg = null;
    boolean isStop = false;
    while(! isStop) {
      try {
        message = (String)br_in.readLine();//ä�ó���
        receiveMsg = message.split("#");
      } catch (Exception e) {
        e.printStackTrace();
        isStop = true;  //  �ݺ��� ����� ����
      }//catch
      System.out.println(receiveMsg[0]+":"+receiveMsg[1]);
      if(receiveMsg[1].equals("exit")) {  //  ä�� ����
        if(receiveMsg[0].equals(chatName)) {  //  �ش� �����
          System.exit(0);
        } else {  //  �� ���� �����
          jta.append(
              receiveMsg[0] + " ���� �����߽��ϴ�\n");
          jta.setCaretPosition(
              jta.getDocument().getLength());
        }//else : �� �� �����
      } else {  //  exit �� �ƴ� ���
        //ä�� ������ ȭ�鿡 ���� �ش�.
        jta.append(receiveMsg[0] + " : " +
            receiveMsg[1] + "\n");
      
        jta.setCaretPosition(
            jta.getDocument().getLength());
      }//else
    }//while
  }//run
}//end  




