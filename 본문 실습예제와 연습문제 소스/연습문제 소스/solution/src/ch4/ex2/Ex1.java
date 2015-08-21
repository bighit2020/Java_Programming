package ch4.ex2;

public class Ex1 {
	
	public int summarize(int n){
		//1.지역 변수 선언
		int sum=0;
		
		//2.기능 구현
		for(int i=1; i<=n;i++){
			if(i%2==1)
				sum+=i;
		}
		
		//3.결과값 출력 또는 리턴
		return sum;
	}

	public static void main(String[] args) {
		int num1=100;
		int num2=1000;
		int value=0;
		
		Ex1 ex=new Ex1();
		value=ex.summarize(num1);
		System.out.println("1과 "+num1+" 사이의 홀수의합은 "+value);
		value=ex.summarize(num2);
		System.out.println("1과 "+num2+" 사이의 홀수의합은 "+value);
	}
}
