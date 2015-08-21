package ch16;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MagicSquare  extends JFrame{
	JFrame frame;
	JLabel num1,num2,num3,num4,num5,num6,num7,num8,num9;
	private ImageIcon icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9;
	JPanel numberPanel;
	JPanel buttonPanel;
	JButton btnLow,btnMiddle,btnHigh;
	
	private int [][]  arrayNum=new int[3][3];
	
	private JLabel first_label,second_label;
	private int mouse_click_count=0;
	
	public MagicSquare(){
		 
		frame=new JFrame("마방진 게임");
		numberPanel=new JPanel();
		numberPanel.setLayout(new GridLayout(3,3));
		
		num1=new JLabel(icon1);
		num2=new JLabel(icon2);
		num3=new JLabel(icon3);
		num4=new JLabel(icon4);
		num5=new JLabel(icon5);
		num6=new JLabel(icon6);
		num7=new JLabel(icon7);
		num8=new JLabel(icon8);
		num9=new JLabel(icon9);
				
		initGame();
		shuffle_low();
		
		num1.addMouseListener(new MouseHandler());
		num2.addMouseListener(new MouseHandler());
		num3.addMouseListener(new MouseHandler());
		num4.addMouseListener(new MouseHandler());
		num5.addMouseListener(new MouseHandler());
		num6.addMouseListener(new MouseHandler());
		num7.addMouseListener(new MouseHandler());
		num8.addMouseListener(new MouseHandler());
		num9.addMouseListener(new MouseHandler());
	
		buttonPanel=new JPanel();
		btnLow=new JButton("초급");
		btnMiddle=new JButton("중급");
		btnHigh=new JButton("고급");
		
		btnLow.addActionListener(new ActionHandler());
		btnMiddle.addActionListener(new ActionHandler());
		btnHigh.addActionListener(new ActionHandler());
		
		buttonPanel.add(btnLow);
		buttonPanel.add(btnMiddle);
		buttonPanel.add(btnHigh);
		
		
		
		frame.add(numberPanel,"Center");
		frame.add(buttonPanel,"South");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private  class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			
			if(mouse_click_count==0){
				first_label=(JLabel)e.getComponent();
				mouse_click_count++;
			}else if(mouse_click_count==1){
				second_label=(JLabel)e.getComponent();
				mouse_click_count=0;
				System.out.println("first_num: "+first_label.getName()+", second_num:"+second_label.getName());
				changeNumber(first_label,second_label);
				changeArray(first_label,second_label);
				proveArraySum();
				
			}
			
			
		}
	}
	
	private class ActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("버튼 클릭!!");
			if(e.getSource()==btnLow){
				shuffle_low();
			}else if(e.getSource()==btnMiddle){
				shuffle_Middle();
			}else if(e.getSource()==btnHigh){
				shuffle_Middle();
			}
				
			
		}
		
	}
	
	private void initGame(){
		mouse_click_count=0;
		
		
		icon1=new ImageIcon("num_1.png");
		icon2=new ImageIcon("num_2.png");
		icon3=new ImageIcon("num_3.png");
		icon4=new ImageIcon("num_4.png");
		icon5=new ImageIcon("num_5.png");
		icon6=new ImageIcon("num_6.png");
		icon7=new ImageIcon("num_7.png");
		icon8=new ImageIcon("num_8.png");
		icon9=new ImageIcon("num_9.png");
		
		num1.setIcon(icon1);
		num2.setIcon(icon2);
		num3.setIcon(icon3);
		num4.setIcon(icon4);
		num5.setIcon(icon5);
		num6.setIcon(icon6);
		num7.setIcon(icon7);
		num8.setIcon(icon8);
		num9.setIcon(icon9);
		
		num1.setName("1");
		num2.setName("2");
		num3.setName("3");
		num4.setName("4");
		num5.setName("5");
		num6.setName("6");
		num7.setName("7");
		num8.setName("8");
		num9.setName("9");		
		
	}
	
	private void shuffle_low(){
		initGame();
		int randNum=(int)(Math.random()*1000)%2+1;  //1~2사이의 자연수를 구한다.
		System.out.println("randNum="+randNum);
		
		if(randNum==1){
			numberPanel.add(num7);
			numberPanel.add(num2);
			numberPanel.add(num6);
			numberPanel.add(num9);
			numberPanel.add(num5);
			numberPanel.add(num1);
			numberPanel.add(num4);
			numberPanel.add(num3);
			numberPanel.add(num8);
			num7.setText("0 0");
			num2.setText("0 1");
			num6.setText("0 2");
			num9.setText("1 0");
			num5.setText("1 1");
			num1.setText("1 2");
			num4.setText("2 0");
			num3.setText("2 1");
			num8.setText("2 2");

			arrayNum[0][0]=7;
			arrayNum[0][1]=2;
			arrayNum[0][2]=6;
			arrayNum[1][0]=9;
			arrayNum[1][1]=5;
			arrayNum[1][2]=1;
			arrayNum[2][0]=4;
			arrayNum[2][1]=3;
			arrayNum[2][2]=8;
			
		}else if(randNum==2){
			numberPanel.add(num2);
			numberPanel.add(num7);
			numberPanel.add(num6);
			numberPanel.add(num9);
			numberPanel.add(num1);
			numberPanel.add(num5);
			numberPanel.add(num4);
			numberPanel.add(num3);
			numberPanel.add(num8);
			
			num2.setText("0 0");
			num7.setText("0 1");
			num6.setText("0 2");
			num9.setText("1 0");
			num1.setText("1 1");
			num5.setText("1 2");
			num4.setText("2 0");
			num3.setText("2 1");
			num8.setText("2 2");
			
			arrayNum[0][0]=2;
			arrayNum[0][1]=7;
			arrayNum[0][2]=6;
			arrayNum[1][0]=9;
			arrayNum[1][1]=1;
			arrayNum[1][2]=5;
			arrayNum[2][0]=4;
			arrayNum[2][1]=3;
			arrayNum[2][2]=8;

		}
		
	}

	private void shuffle_Middle(){
		initGame();
		int randNum=(int)(Math.random()*1000)%2+1;  //1~2사이의 자연수를 구한다.
		System.out.println("randNum="+randNum);
		
		if(randNum==1){
			numberPanel.add(num7);
			numberPanel.add(num2);
			numberPanel.add(num6);
			numberPanel.add(num9);
			numberPanel.add(num3);
			numberPanel.add(num1);
			numberPanel.add(num4);
			numberPanel.add(num5);
			numberPanel.add(num8);
			num7.setText("0 0");
			num2.setText("0 1");
			num6.setText("0 2");
			num9.setText("1 0");
			num3.setText("1 1");
			num1.setText("1 2");
			num4.setText("2 0");
			num5.setText("2 1");
			num8.setText("2 2");

			arrayNum[0][0]=7;
			arrayNum[0][1]=2;
			arrayNum[0][2]=6;
			arrayNum[1][0]=9;
			arrayNum[1][1]=3;
			arrayNum[1][2]=1;
			arrayNum[2][0]=4;
			arrayNum[2][1]=5;
			arrayNum[2][2]=8;
			
		}else if(randNum==2){
			numberPanel.add(num2);
			numberPanel.add(num7);
			numberPanel.add(num1);
			numberPanel.add(num5);
			numberPanel.add(num9);
			numberPanel.add(num6);
			numberPanel.add(num3);
			numberPanel.add(num4);
			numberPanel.add(num8);
			
			num2.setText("0 0");
			num7.setText("0 1");
			num1.setText("0 2");
			num5.setText("1 0");
			num9.setText("1 1");
			num6.setText("1 2");
			num3.setText("2 0");
			num4.setText("2 1");
			num8.setText("2 2");
			
			arrayNum[0][0]=2;
			arrayNum[0][1]=7;
			arrayNum[0][2]=1;
			arrayNum[1][0]=5;
			arrayNum[1][1]=9;
			arrayNum[1][2]=6;
			arrayNum[2][0]=3;
			arrayNum[2][1]=4;
			arrayNum[2][2]=8;

		}
		
	}
	
	private void changeNumber(JLabel _first_label,JLabel _second_label){
		String  first_num=_first_label.getName();
		String second_num=_second_label.getName();
		ImageIcon icon_first=null,icon_second=null;
		
		switch(first_num){
		case "1":
			icon_first=icon1;
			break;
			
		case "2":
			icon_first=icon2;
			break;
		case "3":
			icon_first=icon3;
			break;
		case "4":
			icon_first=icon4;
			break;
			
		case "5":
			icon_first=icon5;
			break;
		case "6":
			icon_first=icon6;
			break;
		case "7":
			icon_first=icon7;
			break;
		case "8":
			icon_first=icon8;
			break;
		case "9":
			icon_first=icon9;
			break;
		}
		
		switch(second_num){
		case "1":
			icon_second=icon1;
			break;
			
		case "2":
			icon_second=icon2;
			break;
		case "3":
			icon_second=icon3;
			break;
		case "4":
			icon_second=icon4;
			break;
			
		case "5":
			icon_second=icon5;
			break;
		case "6":
			icon_second=icon6;
			break;
		case "7":
			icon_second=icon7;
			break;
		case "8":
			icon_second=icon8;
			break;
		case "9":
			icon_second=icon9;
			break;
		}
		
		
		_first_label.setIcon(icon_second);
		_second_label.setIcon(icon_first);
		
		_first_label.setName(second_num);
		_second_label.setName(first_num);
		
	}
	
	private void changeArray(JLabel _first_label,JLabel _second_label){
		String pos_first=_first_label.getText();
		String pos_second=_second_label.getText();
		String first[],second[];
		int temp=0,first_x,first_y,second_x,second_y;
		//System.out.println("첫번째 클릭위치:"+pos_first+", 두번째 클릭 위치:"+pos_second);
		first=pos_first.split(" ");
		second=pos_second.split(" ");
		first_x=Integer.parseInt(first[0]);
		first_y=Integer.parseInt(first[1]);
		
		temp=arrayNum[first_x][first_y];
		
		second_x=Integer.parseInt(second[0]);
		second_y=Integer.parseInt(second[1]);
		arrayNum[first_x][first_y]=arrayNum[second_x][second_y];
		arrayNum[second_x][second_y]=temp;
		
		/*System.out.println("arrayNum[first_x][first_y]"+arrayNum[first_x][first_y]);
		System.out.println("arrayNum[second_x][second_y]"+arrayNum[second_x][second_y]);
		*/
		for(int i=0; i<arrayNum.length;i++){
			for(int j=0; j<arrayNum.length;j++){
				System.out.print(arrayNum[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	private void proveArraySum(){
		int sum=0;
		int temp=0;
		
		//대각선의 합을 구한 후 행과열의 합과 비교한다.
		for(int i=0; i<arrayNum.length;i++){
			for(int j=0; j<arrayNum.length;j++){
				if(i==j)
					sum+=arrayNum[i][j];
			}
		}
		
		for(int i=0; i<arrayNum.length;i++){
			for(int j=0; j<arrayNum.length;j++){
				if(i+j==2)
					temp+=arrayNum[i][j];
			}
		}
		
		if(sum!=temp)
			return;
		
		temp=0;
		for(int i=0; i<arrayNum.length;i++){
			for(int j=0; j<arrayNum.length;j++){
				temp+=arrayNum[i][j];
			}
			if(sum!= temp)
				return;
			temp=0;
		}
		
		temp=0;
		for(int i=0; i<arrayNum.length;i++){
			for(int j=0; j<arrayNum.length;j++){
				temp+=arrayNum[j][i];
			}
			if(sum!= temp)
				return;
			temp=0;
		}
		
		JOptionPane.showMessageDialog(this, 
				"마방진을 완성했습니다. 축하합니다!!!!",
                "확인",
                JOptionPane.YES_NO_CANCEL_OPTION);
		shuffle_low();
	}
	
	 public void launchFrame() {
			
			frame.setSize(500,500);  
			frame.setVisible(true); 
	}
	 
	public static void main(String[] args) {
		MagicSquare s=new MagicSquare();
		s.launchFrame();

	}

}
