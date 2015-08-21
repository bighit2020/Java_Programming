package ch4.ex2;

public class Ex5 {

	public void summarize(int n){
		//1.지역 변수 선언
		int sum=0;
		
		//2.기능 구현
		for(int i=1; i<=n;i++){
			if(i%5!=0)
				sum+=i;
		}
		
		//3.결과값 출력또는 리턴
		System.out.println("1에서 "+n+"사이의 5의 배수를 제외한 자연수의 합은"+sum);
	}
	
	public static void main(String[] args) {
		int num1=100;
		int num2=2000;
		
		Ex5 ex=new Ex5();
		ex.summarize(num1);
		ex.summarize(num2);
	}
}
