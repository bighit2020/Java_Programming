package ch12.ex8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class StrikeGame {
	static int com_val[]=new int[3];  //컴퓨터가 가지는 세수를 저장하는 배열
    
	public static void main(String[] args){
	    boolean result=false;
	    int try_count=1;  //도전 횟수
	    com_val=init();
	    for(int i=0; i<3;i++){
	    	System.out.println("컴퓨터값 : "+com_val[i]);
	    }
	    
	    System.out.println("====== BaseBall Game~!! ======");
	    System.out.println("총 10 번의 기회 중 "+try_count+"회 도전");
	    System.out.println("세 수를 연속해서 입력하세요. \n 예) 123");
	    System.out.print("숫자 입력: ");
		try {
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			 
			String s;
			
			s = in.readLine();
			while (s!= null) {
				System.out.println("입력값 :"+s);
				
				result=compare(s);
				
				if(result ==true){
					System.out.println("정답입니다.!");
					break;
				}else{
					try_count++;
					if(try_count >=10){
						System.out.println("도전 실패입니다. \n다시 도전(Y), 종료(N)");
						System.exit(1);
					}
					System.out.println("총 10 번의 기회 중 "+try_count+"회 도전");
				    System.out.println("세 수를 연속해서 입력하세요. \n 예) 123");
				    System.out.print("숫자 입력: ");
					s = in.readLine();
					
				}
			}
			in.close();
			
		} catch (IOException e) {
			System.out.println("IOException");
		}	
		
	}
	
	
	//프로그램 실행 시 컴퓨터의 볼카운트를 세팅하는 메소드
	private static int[] init(){
		int [] val=new int[3];
		int num=0;
		int  count=0;
		
		
label1:	
	    while(count<3){
			num=(int)(Math.random()*1000)%10+1;  //1~9사이의 자연수를 구한다.
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

	//컴퓨터의 볼 카운트와 사용자가 입력한 볼 카운트를 비교하는 메소드
	private static boolean compare(String str){
		int ball=0, strike=0;  //볼 카운트 
		boolean result=false;
		int num=0;
		char ch=0;
		
		//사용자가 입력한 수와 컴퓨터가 가지고 있는 수를 비교한 후
		//사용자가 입력한 수 중에 컴퓨터가 가지고 있는 수가 있으면 볼을 증가 시킨다.
		for (int i=0 ; i < 3; i++){
			ch=str.charAt(i);
			num=Integer.parseInt(Character.toString(ch));
			
            for (int j = 0 ; j < 3 ; j++){
                if (num == com_val[j] && i != j) 
                    ball++;
            }
        }
        
        //사용자가 입력한 수와 컴퓨터가 입력한 수가 순서까지 일치하면 스트라이크를 증가시킨다.
        for (int i =0 ; i < 3 ; i++) 
        {
        	ch=str.charAt(i);
			num=Integer.parseInt(Character.toString(ch));
            if (num == com_val[i]) 
                strike++;
        }
       
        //세 숫자를 다 맛추었을 경우
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
			System.out.println("정답입니다.");
		}
	}
}
