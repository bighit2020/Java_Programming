package ch16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gunman  extends JFrame{
	private JFrame frame;
	private Button btnReStart,btnCalc;
	
	private JPanel gamePanel,orderPanel,resultPanel;
	private JLabel lAman ,lBman,lCman;
	private JLabel lGameResult,lOrder;
	private TextField tWord ,tInput,tResult,tOrder;
	private JPanel aPanel,bPanel,cPanel,rPanel;
	private JLabel lAResult,lBResult,lCResult;
	private TextField tAResult,tBResult,tCResult;
	private ImageIcon iconA,iconB,iconC;
	
	private int currentTurn=0;
	private String currentShooter="aman";
	private boolean[ ] alive_status=new boolean[3];
	private int a_win_num=0,b_win_num=0,c_win_num=0;
	
	public Gunman(){
		alive_status[0]=true;
		alive_status[1]=true;
		alive_status[2]=true;
		
		currentTurn=initTurn(); //������ ��� ������ ���Ѵ�.
		frame = new JFrame("�Ǹ� ����");  //ȭ�� ��ü�� �����Ѵ�.
		iconA=new ImageIcon("aman.png");
		iconB=new ImageIcon("bman.png");
		iconC=new ImageIcon("cman.png");
		
		lAman=new JLabel(iconA);
		lAman.setName("aman");
		
		lBman=new JLabel(iconB);
		lBman.setName("bman");
		lCman=new JLabel(iconC);
		lCman.setName("cman");
		
		lAman.addMouseListener(new MouseHandler());
		lBman.addMouseListener(new MouseHandler());
		lCman.addMouseListener(new MouseHandler());
		frame.addMouseListener(new MouseHandler());
		
		
		if(currentTurn==0){
			lAman.setBackground(Color.BLUE);
			currentShooter="aman";
		}else if(currentTurn==1){
			lBman.setBackground(Color.BLUE);
			currentShooter="bman";
		}else if(currentTurn==2){
			lCman.setBackground(Color.BLUE);
			currentShooter="aman";
		}
		
		
		lGameResult=new JLabel("���� ���");
		rPanel=new JPanel();
		rPanel.add(lGameResult);
		
		lOrder=new JLabel("�ѽ�� ����");
		tOrder=new TextField(Integer.toString(currentTurn),30);
		tOrder.setEnabled(false);
		
		orderPanel=new JPanel();
		orderPanel.add(lOrder);
		orderPanel.add(tOrder);
		
		lAResult=new JLabel("A �Ǹ�:");
		lBResult=new JLabel("B �Ǹ�:");
		lCResult=new JLabel("C �Ǹ�:");
		tAResult=new TextField("",10);
		tBResult=new TextField("",10);
		tCResult=new TextField("",10);
		tAResult.setEnabled(false);
		tBResult.setEnabled(false);
		tCResult.setEnabled(false);
		
		aPanel=new JPanel();
		bPanel=new JPanel();
		cPanel=new JPanel();
		
		aPanel.add(lAResult);
		aPanel.add(tAResult);
		bPanel.add(lBResult);
		bPanel.add(tBResult);
		cPanel.add(lCResult);
		cPanel.add(tCResult);
		
		
		resultPanel=new JPanel(new GridLayout(0,1));
		
		resultPanel.add(orderPanel);
		resultPanel.add(rPanel);
		resultPanel.add(aPanel);
		resultPanel.add(bPanel);
		resultPanel.add(cPanel);
		
		gamePanel=new JPanel();
		gamePanel.setLayout(new GridLayout(0,1));
		gamePanel.add(resultPanel);
		
		Container con=frame.getContentPane();
		con.add(lAman, "North");
		con.add(lBman, "East");
		con.add(lCman, "West");
		con.add(gamePanel,"Center");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 100);
		
	}
	private void initGame(){
		alive_status[0]=true;
		alive_status[1]=true;
		alive_status[2]=true;
		
		currentTurn=initTurn(); //������ ��� ������ ���Ѵ�.
		
		if(currentTurn==0){
			lAman.setBackground(Color.BLUE);
			currentShooter="aman";
		}else if(currentTurn==1){
			lBman.setBackground(Color.BLUE);
			currentShooter="bman";
		}else if(currentTurn==2){
			lCman.setBackground(Color.BLUE);
			currentShooter="aman";
		}
		
		JOptionPane.showMessageDialog(this, 
				"ù��° ���: "+currentShooter,
                "Ȯ��",
                JOptionPane.YES_NO_CANCEL_OPTION);
		
		iconA=new ImageIcon("aman.png");
		iconB=new ImageIcon("bman.png");
		iconC=new ImageIcon("cman.png");
		lAman.setIcon(iconA);
		lBman.setIcon(iconB);
		lCman.setIcon(iconC);
	}
	
	private class MouseHandler extends MouseAdapter{
		String target=null;
		@Override
		public void mouseClicked(MouseEvent e) {
			target=e.getComponent().getName();
			System.out.println("���콺 Ŭ���� "+target);
			if(!target.equals(currentShooter))
			   evalHit(target);
			
			boolean isGameOver=decideWinner(currentTurn);  //���� �� �� ���ڸ� �����Ѵ�.
			if(isGameOver==true){
				System.out.println(currentShooter+"�� �̰���ϴ�.!!!");
				restartGame(currentTurn);
			}else{
				currentTurn=nextOrder(currentTurn);
				System.out.println("�ѽ� ����:"+currentShooter);
			}
			
			
		}
		
	}
	
	 
	 public void launchFrame() {
			
			frame.setSize(1000,500);  //�������� ũ�⸦ �����Ѵ�.
			frame.setVisible(true);  //�������� ����Ӽ��� �����Ѵ�.
			JOptionPane.showMessageDialog(this, 
					"ù��° ���:"+currentShooter,
	                "Ȯ��",
	                JOptionPane.YES_NO_CANCEL_OPTION);
	}
	
	private int initTurn(){
		int num=(int)(Math.random()*1000)%2;  //0~2������ �ڿ����� ���Ѵ�.

		System.out.println("����"+ num);
		return num;
	}
	
	//���� ������ �����Ѵ�.
	private void  evalHit(String target){
		//System.out.println("�����Դϴ�.");
		
		int num=(int)(Math.random()*1000)%2;  //1~3������ �ڿ����� ���Ѵ�.
		if(currentShooter.equals("aman")){
			if(num==0){
				if(target.equals("bman")){
					iconB=new ImageIcon("dead.png");
					lBman.setIcon(iconB);
					alive_status[1]=false;
				}else if(target.equals("cman")){
					iconC=new ImageIcon("dead.png");
					lCman.setIcon(iconC);
					alive_status[2]=false;
				}
			}else{
				System.out.println("�ҹ��Դϴ�.");
			}
			
		}else if(currentShooter.equals("bman")){
			if(num==0 || num==1){
				if(target.equals("aman")){
					iconA=new ImageIcon("dead.png");
					lAman.setIcon(iconA);
					alive_status[0]=false;
				}else if(target.equals("cman")){
					iconC=new ImageIcon("dead.png");
					lCman.setIcon(iconC);
					alive_status[2]=false;
				}
			}else{
				System.out.println("�ҹ��Դϴ�.");
			}
		}else if(currentShooter.equals("cman")){
			if(target.equals("aman")){
				iconA=new ImageIcon("dead.png");
				lAman.setIcon(iconA);
				alive_status[0]=false;
			}else if(target.equals("bman")){
				iconB=new ImageIcon("dead.png");
				lBman.setIcon(iconB);
				alive_status[1]=false;
			}
		}
	}
	
	private boolean decideWinner(int turn){
		boolean isGameOver=true;
		
		for(int i=0 ;i<alive_status.length;i++){
			if(i!= turn){
				if(alive_status[i]==true){
					isGameOver=false;
					break;
				}
			}
			
		}
		
		return isGameOver;
	}
	
	private int nextOrder(int turn){
		int nextTurn=turn;
		if(turn<2)
			nextTurn++;
		else
			nextTurn=0;
		
		
		if(alive_status[nextTurn]==false){
			if(nextTurn==2)
				nextTurn=0;
			else
				nextTurn++;
		}
			
		
		if(nextTurn==0){
			currentShooter="aman";
		}else if(nextTurn==1){
			currentShooter="bman";
		}else if(nextTurn==2){
			currentShooter="cman";
		}
		
		JOptionPane.showMessageDialog(this, 
				"�ѽ� ����"+currentShooter,
                "Ȯ��",
                JOptionPane.YES_NO_CANCEL_OPTION);
		
		return nextTurn;
		
	}
	
	private void restartGame(int turn){
		JOptionPane.showMessageDialog(this, 
				currentShooter+"�� �¸� �߽��ϴ�.",
                "Ȯ��",
                JOptionPane.YES_NO_CANCEL_OPTION);
		
		if(turn==0){
			a_win_num++;
			tAResult.setText(Integer.toString(a_win_num));
		}else if(turn==1){
			b_win_num++;
			tBResult.setText(Integer.toString(b_win_num));
		}else if(turn==2){
			c_win_num++;
			tCResult.setText(Integer.toString(c_win_num));
		}
		
		initGame();
	}
	public static void main(String[] args) {
		Gunman gunman=new Gunman();
	    gunman.launchFrame();
	}


}
