package ch9.ex4;

public class ScoreTest {
	public static void main(String[] args){
		//int score=89;
		int score=120;
		ScoreUtil t= new ScoreUtil();
		try{
			score=t.calcScore(score);
			System.out.println("입력한 시험점수는 "+score+ "입니다.");
		}catch(UserDefinedException e){
			System.out.println(e.getUserExceptionInfo());
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("마지막 부분");
	}
}


