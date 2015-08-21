package ch4;

public class Ex8 {
	public static void main(String[] args) {
		//1.지역 변수 선언
		int num=100;
		int sum=0;
		
		//2.기능 구현
		for(int i=1; i<=num;i++){
			if(i%5!=0)
				sum+=i;
		}
		
		//3.결과 출력
		System.out.println("1에서 100사이의 5의 배수를 제외한 자연수의 합은"+sum);
	}

}
