package ch4;

public class Ex2 {
	public static void main(String[] args) {
		//1.변수 선언
		int num=100;
		int sum=0;
		
		//2.기능 구현
		for(int i=1; i<=num;i++){
			sum+=i;
		}
		
		System.out.println("1에서 "+num+"사이의 자연수들의 합은 "+ sum);

	}

}
