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
	  answer = getAnswer(strArr,answer);   //문자열 배열에서 하나의 문자열을 선택한다.
      question = shuffle(answer);    //선택된 문자열의 단어를 섞는다.
	     
		 frame = new Frame("행맨 게임");  //화면 객체를 생성한다.
		 
		 wordPanel=new Panel();
		 lWord=new Label("단어");
		 tWord=new TextField("",20);
		 tWord.setText(question);
		 tWord.setEnabled(false);
		 
		 wordPanel.add(lWord);
		 wordPanel.add(tWord);
		 
		 inputPanel=new Panel();
		 lInput=new Label("단어를 입력하세요");
		 tInput=new TextField("",20);
		 
		 inputPanel.add(lInput);
		 inputPanel.add(tInput);
		 
		 gamePanel=new Panel();
		 gamePanel.setLayout(new GridLayout(0,1));
		 gamePanel.add(wordPanel);
		 gamePanel.add(inputPanel);
		 
		 statusPanel=new Panel();
		 lResult=new Label("게임 결과");
		 tResult=new TextField("",30);
		 tResult.setEnabled(false);
		 statusPanel.add(lResult);
		 statusPanel.add(tResult);
		 
		 btnPanel=new Panel();
		 btnReStart=new Button("다시 시작");
		 btnCalc=new Button("결과");
		 btnPanel.add(btnReStart);
		 btnPanel.add(btnCalc);
		 
		 frame.add(gamePanel,"North");
		 frame.add(statusPanel,"Center");
		 frame.add(btnPanel,"South");
		 
		 
	         
		 btnCalc.addActionListener(new ActionListener() {
			 public void actionPerformed( ActionEvent e){
				String input=tInput.getText();
				if(input.toUpperCase().equals(answer)){
		        	 System.out.println("정답입니다.");
		        	 tResult.setText("정답입니다.");
		         }else{
		        	 tResult.setText("틀린 단어입니다."+"\n답은 "+answer + " 입니다.");
		        	 System.out.println("답은 "+answer + " 입니다.");
		         }
			 }
	    });
		 
		 btnReStart.addActionListener(new ActionListener() {
			 public void actionPerformed( ActionEvent e){
				 answer = getAnswer(strArr,answer);   //문자열 배열에서 하나의 문자열을 선택한다.
			     question = shuffle(answer);    //선택된 문자열의 단어를 섞는다.
			     tWord.setText(question);
			     tInput.setText("");
			     tResult.setText("");
			 }
	    }); 
		 
	 }
	 
	 public void launchFrame() {
			
			frame.setSize(500,500);  //프레임의 크기를 세팅한다.
			frame.setVisible(true);  //프레임의 보기속성을 지정한다.
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
	   int ranNum =-1;  //랜덤수 
	   int idx=0;
	   int strLen=str.length(); //문자열의 개수를 리턴하는 메소드
	   int count=0;
	   char []arr = str.toCharArray();  //문자열의 각각의 문자를 배열 요소의 값으로 리턴한다.
	   
	   while(true){
		   ranNum = (int)(Math.random()*10); //랜덤수(0에서 10까지)를 얻어온다.
		   idx= ranNum%strLen; //배열인덱스를 구한다.
		   
    		if(arr[idx]!=' '){ //기존에 접근한 배열요소인지를 확인한다.	    			
    			qus+=arr[idx];  //배열요소의 값을 문자열에 붙인 후 공백으로 표시한다.
    			arr[idx]=' ';
    			count++;  //배열에 접근한 문자수를 카운트한다.
    		}
	    
    		//접근한 문자의 개수가 문자열의 문자개수와 같은것과 추출한 문자열이 답문자열과 같은지 를 검사한다.
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
