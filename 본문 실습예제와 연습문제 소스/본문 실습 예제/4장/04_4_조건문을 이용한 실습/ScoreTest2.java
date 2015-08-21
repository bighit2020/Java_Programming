package ch4;

public class ScoreTest2 {
	public static void main(String [] args){
		
		int score=79;
		int category=0;
		char credit;
		
		
		if((score >=0) && (score<=100)){ //점수가 0과 100점사이인 경우
			category=score/10;
			System.out.println("category=" +category);
			
			switch(category){
			
			case 10:
				credit='A';
				break;

			case 9:
				credit='A';
				break;

			case 8:
				credit='B';
				break;
			case 7:
				credit='C';				
				break;

			case 6:
				credit='D';				
				break;
				
			default:
				credit='F';
			}
		
			System.out.println("시험점수 = "+ score +"점 , 학점 ="+credit);	
		}else{
		  System.out.println("시험점수가 잘못입력 되었습니다.");
		}
		
		
	}	

}
