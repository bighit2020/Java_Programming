package ch4.ex2;

public class Ex4 {
	public void calcScore(int[] score){
		//1.지역 변수 선언
		int total=0;
		float average=0f;
		
		//2.기능 구현
		for(int i=0; i<score.length;i++){
			total+=score[i];
		}
		
		//3.결과값 출력 또는 리턴
		average=(float)total/score.length;
		
		System.out.println("시험점수 총점은 "+total+"점이고, 평균은"+average+"점입니다.");

	}
	public static void main(String[] args) {
		int [] s={45,67,89,12,56,90,64,79,55};
		
		Ex4 ex=new Ex4();
		ex.calcScore(s);
	}
}
