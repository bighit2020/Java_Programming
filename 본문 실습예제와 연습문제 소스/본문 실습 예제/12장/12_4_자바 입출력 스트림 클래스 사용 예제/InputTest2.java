package ch12.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//학생의 시험 점수 총점 구하는 예제
public class InputTest2 {
	public static void main(String [] args){

		int [] score=new int[5]; //입력한 시험점수를 저장하는 배열
		int count=0;  //입력한 회수를 저장하는 변수
		int total=0; //시험 총점을 저장하는 변수
		
		String  data= null;
		InputStreamReader ir = new InputStreamReader(System.in); //키보드로 입력받은 데이터를 문자로 변환한다.		
		BufferedReader in = new BufferedReader(ir); //버퍼에 다시 저장한다.
		
		System.out.println("exit: Ctrl+Z");  
		System.out.println("시험점수를 입력해 주세요");
		try{
			//개행문자가 입력될 때까지 버퍼에 데이터를 입력한다.
			do{
				data = in.readLine();
				System.out.println("점수:" + data);
				score[count]=Integer.parseInt(data); //입력한 점수를 score배열에 차례대로 저장한다.
				count++;
				
			}while(count<5);

			in.close();
			ir.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		for(int i=0; i<score.length;i++){
			//System.out.println(score[i]);
			total+=score[i];
		}
		
		System.out.println("시험 총점은 "+ total);
	}
}
