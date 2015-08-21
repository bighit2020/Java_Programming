package ch15.ex3;

import java.awt.*;
import java.awt.event.*;

public class WordScramble {
	String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};
	String answer=null;
	String question=null;
	private Frame frame;
	private Button btnReStart,btnCalc;
	
	private Panel wordPanel , inputPanel,statusPanel, btnPanel;
	private Panel gamePanel;
	private Label lWord ,lInput,lResult;
	private TextField tWord ,tInput,tResult;
	 
	 
	public WordScramble(){
	  answer = getAnswer(strArr,answer);   //���ڿ� �迭���� �ϳ��� ���ڿ��� �����Ѵ�.
      question = shuffle(answer);    //���õ� ���ڿ��� �ܾ ���´�.
	     
		 frame = new Frame("��� ����");  //ȭ�� ��ü�� �����Ѵ�.
		 
		 wordPanel=new Panel();
		 lWord=new Label("�ܾ�");
		 tWord=new TextField("",20);
		 tWord.setText(question);
		 tWord.setEnabled(false);
		 
		 wordPanel.add(lWord);
		 wordPanel.add(tWord);
		 
		 inputPanel=new Panel();
		 lInput=new Label("�ܾ �Է��ϼ���");
		 tInput=new TextField("",20);
		 
		 inputPanel.add(lInput);
		 inputPanel.add(tInput);
		 
		 gamePanel=new Panel();
		 gamePanel.setLayout(new GridLayout(0,1));
		 gamePanel.add(wordPanel);
		 gamePanel.add(inputPanel);
		 
		 statusPanel=new Panel();
		 lResult=new Label("���� ���");
		 tResult=new TextField("",30);
		 tResult.setEnabled(false);
		 statusPanel.add(lResult);
		 statusPanel.add(tResult);
		 
		 btnPanel=new Panel();
		 btnReStart=new Button("�ٽ� ����");
		 btnCalc=new Button("���");
		 btnPanel.add(btnReStart);
		 btnPanel.add(btnCalc);
		 
		 frame.add(gamePanel,"North");
		 frame.add(statusPanel,"Center");
		 frame.add(btnPanel,"South");
		 
		 
	         
		 btnCalc.addActionListener(new ActionListener() {
			 public void actionPerformed( ActionEvent e){
				String input=tInput.getText();
				if(input.toUpperCase().equals(answer)){
		        	 System.out.println("�����Դϴ�.");
		        	 tResult.setText("�����Դϴ�.");
		         }else{
		        	 tResult.setText("Ʋ�� �ܾ��Դϴ�."+"\n���� "+answer + " �Դϴ�.");
		        	 System.out.println("���� "+answer + " �Դϴ�.");
		         }
			 }
	    });
		 
		 btnReStart.addActionListener(new ActionListener() {
			 public void actionPerformed( ActionEvent e){
				 answer = getAnswer(strArr,answer);   //���ڿ� �迭���� �ϳ��� ���ڿ��� �����Ѵ�.
			     question = shuffle(answer);    //���õ� ���ڿ��� �ܾ ���´�.
			     tWord.setText(question);
			     tInput.setText("");
			     tResult.setText("");
			 }
	    }); 
		 
	 }
	 
	 public void launchFrame() {
			
			frame.setSize(500,500);  //�������� ũ�⸦ �����Ѵ�.
			frame.setVisible(true);  //�������� ����Ӽ��� �����Ѵ�.
	}
	 
	 public static String getAnswer(String[] strArr,String answer) {
	    String  ans=null;
	    	int ranNum = (int)(Math.random()*10);
	    	ans=strArr[ranNum% strArr.length];
	   	System.out.println("ans = " +ans);
	    return ans;
	  }
	 
	   
    public static String shuffle(String str) {
		   
	   String qus=""; 
	   int ranNum =-1;  //������ 
	   int idx=0;
	   int strLen=str.length(); //���ڿ��� ������ �����ϴ� �޼ҵ�
	   int count=0;
	   char []arr = str.toCharArray();  //���ڿ��� ������ ���ڸ� �迭 ����� ������ �����Ѵ�.
	   
	   while(true){
		   ranNum = (int)(Math.random()*10); //������(0���� 10����)�� ���´�.
		   idx= ranNum%strLen; //�迭�ε����� ���Ѵ�.
		   
    		if(arr[idx]!=' '){ //������ ������ �迭��������� Ȯ���Ѵ�.	    			
    			qus+=arr[idx];  //�迭����� ���� ���ڿ��� ���� �� �������� ǥ���Ѵ�.
    			arr[idx]=' ';
    			count++;  //�迭�� ������ ���ڼ��� ī��Ʈ�Ѵ�.
    		}
	    
    		//������ ������ ������ ���ڿ��� ���ڰ����� �����Ͱ� ������ ���ڿ��� �乮�ڿ��� ������ �� �˻��Ѵ�.
    	if(count==strLen && !(qus.equals(str)))
    		break;
	   }
	   return  qus ;
	   
   } 
		
   public static void main(String[] args) { 
      WordScramble hangman=new WordScramble();
      hangman.launchFrame();
   } 
}
