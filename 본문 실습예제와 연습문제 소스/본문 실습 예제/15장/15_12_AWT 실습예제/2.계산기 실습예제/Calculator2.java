package ch15.ex8a;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2 {
	Frame frame;
	Panel buttonPanel;
	Label display;
	Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
	       btnClear,btnEqual,btnPlus,btnMinus,btnMulti,btnDivide;
	String susik="";
	String result="";    //두 수를 연산한 결과값을 저장하는 변수
	String operator="";  //선택한 연산자를 저장하는 변수
	
	public Calculator2(){
		frame=new Frame("계산기");
		buttonPanel=new Panel();
		buttonPanel.setLayout(new GridLayout(4,1));
		display=new Label();
		display.setAlignment(Label.RIGHT);
		btn0=new Button("0");
		btn1=new Button("1");
		btn2=new Button("2");
		btn3=new Button("3");
		
		btn4=new Button("4");
		btn5=new Button("5");
		btn6=new Button("6");
		btn7=new Button("7");
		btn8=new Button("8");
		btn9=new Button("9");
		btn9=new Button("9");
		btnClear=new Button("C");
		btnEqual=new Button("=");
		btnPlus=new Button("+");
		btnMinus=new Button("-");
		btnMulti=new Button("*");
		btnDivide=new Button("/");

		//Listener와 연결한다.
		btn0.addActionListener(new ActionHandler());
		btn1.addActionListener(new ActionHandler());
		btn2.addActionListener(new ActionHandler());
		btn3.addActionListener(new ActionHandler());
		btn4.addActionListener(new ActionHandler());
		btn5.addActionListener(new ActionHandler());
		btn6.addActionListener(new ActionHandler());
		btn7.addActionListener(new ActionHandler());
		btn8.addActionListener(new ActionHandler());
		btn9.addActionListener(new ActionHandler());
		
		btnPlus.addActionListener(new ActionHandler());
		btnMinus.addActionListener(new ActionHandler());
		btnMulti.addActionListener(new ActionHandler());
		btnDivide.addActionListener(new ActionHandler());
		btnEqual.addActionListener(new ActionHandler());
		btnClear.addActionListener(new ActionHandler());
		
		buttonPanel.add(btn1);
		buttonPanel.add(btn2);
		buttonPanel.add(btn3);
		buttonPanel.add(btnPlus);
		
		buttonPanel.add(btn4);
		buttonPanel.add(btn5);
		buttonPanel.add(btn6);
		buttonPanel.add(btnMinus);
		
		buttonPanel.add(btn7);
		buttonPanel.add(btn8);
		buttonPanel.add(btn9);
		buttonPanel.add(btnMulti);	
		
		buttonPanel.add(btn0);
		buttonPanel.add(btnClear);
		buttonPanel.add(btnEqual);
		buttonPanel.add(btnDivide);	
	}
	
	public void makeFrame(){
		frame.add(display,"North");
		frame.add(buttonPanel,"Center");
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	

	public static void main(String[] args) {
		Calculator2 c=new Calculator2();
		c.makeFrame();
	}
	
	private class ActionHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String num=e.getActionCommand();
			Button btn=(Button)e.getSource();
			if(btn==btn0){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn1){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn2){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn3){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn4){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn5){
											
				susik+=num;
				display.setText(susik);
			}else if(btn==btn6){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn7){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn8){
											
				susik+=num;
				display.setText(susik);
			}else if(btn==btn9){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn0){
				susik+=num;
				display.setText(susik);
			}
			
			
			//연산자 버튼을 클릭한 경우
			if(btn==btnPlus){
				susik+="+";
				operator="+";
				display.setText(susik);
						
			}else if(btn==btnMinus){
				susik+="-";
				operator="-";
				display.setText(susik);
			}else if(btn==btnMulti){
				susik+="*";
				operator="*";
				display.setText(susik);
			}else if(btn==btnDivide){
				susik+="/";
				operator="/";
				display.setText(susik);
			}else if(btn==btnClear){
				operator="";
				susik="";
				display.setText("0");
			}else if(btn==btnEqual){
				result=calculate(susik,operator);
				display.setText(result);
				susik="";
				operator="";
			}
		
			System.out.println("수식 : "+susik);
		}
		
	}
	
	//입력한 문자열을 연산자를 구분자로 각각의 숫자로 분리하는 메소드
	private static String calculate(String str,String opr){
		String result=null;
		String[] num;
		int firstNum=0,secondNum=0;
		
		num=str.split(opr);  //연산자로 문자열을 분리하면 오류가 발생한다.
		//num=str.split("\\"+opr);  //자바 특수문자는 "\\"를 붙여주어야 한다.
		firstNum=Integer.parseInt(num[0]);
		secondNum=Integer.parseInt(num[1]);
		
		if(opr.equals("+")){
			result=Integer.toString(firstNum+secondNum);
		}else if(opr.equals("-")){
			result=Integer.toString(firstNum-secondNum);
		}else if(opr.equals("*")){
			result=Integer.toString(firstNum*secondNum);
		}else if(opr.equals("/")){
			result=Float.toString(((float)firstNum)/secondNum);
		}
		
		return result;
	}

}
