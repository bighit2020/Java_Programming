package ch4.ex2;

public class Ex7 {
	public int summarize(int n){
		//1.지역 변수 선언
		int sum=0;
		int temp=0;
		
		//2.기능 구현
		while(n!=0){
			sum+=n%10;
			n/=10;
		}
		
		
		//3.결과값 출력또는 리턴
		return sum;
	}

	public static void main(String[] args) {
		int num1=5555;
		int num2=6666;
		int value=0;
		
		Ex7 ex=new Ex7();
		value=ex.summarize(num1);
		System.out.println(num1+"자리수의 합은"+value);
		
		value=ex.summarize(num2);
		System.out.println(num2+"자리수의 합은"+value);
	}
}
