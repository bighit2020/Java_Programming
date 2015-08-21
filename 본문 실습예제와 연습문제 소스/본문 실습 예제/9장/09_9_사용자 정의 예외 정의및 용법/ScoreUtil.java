package ch9.ex4;

public class ScoreUtil{
	public int calcScore(int score)  throws UserDefinedException {  
		System.out.println("calcScore 메소드 시작");
		//입력한 시험 점수가 0에서 100점 범위를 벗어나면 명시적으로 예외 발생
        if(score<0 || score>100) 
        	throw new UserDefinedException("정확한 점수를 입력하세요." );
        System.out.println("calcScore 메소드 끝");       
        return score;
	}
}

