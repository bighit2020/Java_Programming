package ch12.ex8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class StrikeGame {
	static int com_val[]=new int[3];  //��ǻ�Ͱ� ������ ������ �����ϴ� �迭
    
	public static void main(String[] args){
	    boolean result=false;
	    int try_count=1;  //���� Ƚ��
	    com_val=init();
	    for(int i=0; i<3;i++){
	    	System.out.println("��ǻ�Ͱ� : "+com_val[i]);
	    }
	    
	    System.out.println("====== BaseBall Game~!! ======");
	    System.out.println("�� 10 ���� ��ȸ �� "+try_count+"ȸ ����");
	    System.out.println("�� ���� �����ؼ� �Է��ϼ���. \n ��) 123");
	    System.out.print("���� �Է�: ");
		try {
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			 
			String s;
			
			s = in.readLine();
			while (s!= null) {
				System.out.println("�Է°� :"+s);
				
				result=compare(s);
				
				if(result ==true){
					System.out.println("�����Դϴ�.!");
					break;
				}else{
					try_count++;
					if(try_count >=10){
						System.out.println("���� �����Դϴ�. \n�ٽ� ����(Y), ����(N)");
						System.exit(1);
					}
					System.out.println("�� 10 ���� ��ȸ �� "+try_count+"ȸ ����");
				    System.out.println("�� ���� �����ؼ� �Է��ϼ���. \n ��) 123");
				    System.out.print("���� �Է�: ");
					s = in.readLine();
					
				}
			}
			in.close();
			
		} catch (IOException e) {
			System.out.println("IOException");
		}	
		
	}
	
	
	//���α׷� ���� �� ��ǻ���� ��ī��Ʈ�� �����ϴ� �޼ҵ�
	private static int[] init(){
		int [] val=new int[3];
		int num=0;
		int  count=0;
		
		
label1:	
	    while(count<3){
			num=(int)(Math.random()*1000)%10+1;  //1~9������ �ڿ����� ���Ѵ�.
			for(int i=0; i<3;i++){
				if(num==val[i])
					continue label1;
			}
			
			val[count]=num;
			count++;
			num=0;
			
			
		}
		return val;
		
	}

	//��ǻ���� �� ī��Ʈ�� ����ڰ� �Է��� �� ī��Ʈ�� ���ϴ� �޼ҵ�
	private static boolean compare(String str){
		int ball=0, strike=0;  //�� ī��Ʈ 
		boolean result=false;
		int num=0;
		char ch=0;
		
		//����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ �ִ� ���� ���� ��
		//����ڰ� �Է��� �� �߿� ��ǻ�Ͱ� ������ �ִ� ���� ������ ���� ���� ��Ų��.
		for (int i=0 ; i < 3; i++){
			ch=str.charAt(i);
			num=Integer.parseInt(Character.toString(ch));
			
            for (int j = 0 ; j < 3 ; j++){
                if (num == com_val[j] && i != j) 
                    ball++;
            }
        }
        
        //����ڰ� �Է��� ���� ��ǻ�Ͱ� �Է��� ���� �������� ��ġ�ϸ� ��Ʈ����ũ�� ������Ų��.
        for (int i =0 ; i < 3 ; i++) 
        {
        	ch=str.charAt(i);
			num=Integer.parseInt(Character.toString(ch));
            if (num == com_val[i]) 
                strike++;
        }
       
        //�� ���ڸ� �� ���߾��� ���
        if(strike==3) 
        	result=true;
        
        displayCount(ball,strike);
        
		return result;
	}
	
	private static void displayCount(int ball, int strike){
		if(ball==0){
			switch(strike){
			case 0:
				System.out.println("0 ball, 0 strike");
				break;
			case 1:
				System.out.println("0 ball, 1 strike");
				break;
			case 2:
				System.out.println("0 ball, 2 strike");
				break;
			}
			
		}else if(ball==1){
			switch(strike){
			case 0:
				System.out.println("1 ball, 0 strike");
				break;
			case 1:
				System.out.println("1 ball, 1 strike");
				break;
			case 2:
				System.out.println("1 ball, 2 strike");
				break;
			}
		}else if(ball==2){
			switch(strike){
			case 0:
				System.out.println("2 ball, 0 strike");
				break;
			case 1:
				System.out.println("2 ball, 1 strike");
				break;
			}
			
		}else if(ball==3){
				System.out.println("3 ball, 0 strike");
		}else if(strike>2){
			System.out.println("�����Դϴ�.");
		}
	}
}
