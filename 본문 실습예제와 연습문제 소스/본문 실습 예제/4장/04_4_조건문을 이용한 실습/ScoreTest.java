package ch4;

//시험점수를 학점으로 변환하는 예제
public class ScoreTest {
	
	public static void main(String [] args){
		//int score=89;
		int score=189;
		int category=0;
		char credit;
		
			category=score/10;  //정수/정수는 결과값으로 정수를 리턴한다.
			System.out.println("category=" +category);
			
			if(category==10 || category==9)
				credit='A';
			else if(category==8)
				credit='B';
			else if(category==7)
				credit='C';
			else if(category==6)
				credit='D';
			else
				credit='F';
		
			System.out.println("시험점수 = "+ score +"점 , 학점 ="+credit);	
		}
}

