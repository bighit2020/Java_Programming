package ch12.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//파일에서 시험 점수를 읽어서 총점과 평균을 구하는 예제
public class ScoreRead {
	public static void main(String[] args){
		int totalScore =0;  //점수의 합계를 저장하는 변수
		int count=0;        //시험 본 사람 수를 저장하는 변수
		float average=0.0f;
		
		File file = new File("ScoreData.txt"); 
		
		try {

			BufferedReader in = new BufferedReader(new FileReader(file)); 

			String s;
			s = in.readLine();
			if(  s != null) {
				System.out.println("시험 점수 : " + s);
				
				//','를 구분자로 각각의 점수를 분리한다.
				StringTokenizer st= new StringTokenizer(s,",");
				
				while(st.hasMoreTokens()){					
					totalScore +=Integer.parseInt(st.nextToken());  //구분자로 구분한 점수를 정수로 변환 후 변수에 저장한다.
					count++;
				}
				
				//총점을 출력한다.
				 System.out.println("총점 : " +totalScore);
				 System.out.println("시험 본 사람 : " +count+" 명");
				//평균을 계산한다.
				
				average= (float)totalScore /count;
				
				System.out.println("시험 평균 :" +  average);
				
			}
			
			
			in.close();
			
		} catch(FileNotFoundException e1) {
			System.out.println("File not found");
		} catch(Exception e) {
			e.printStackTrace();
		}	
				
		
	}
}
