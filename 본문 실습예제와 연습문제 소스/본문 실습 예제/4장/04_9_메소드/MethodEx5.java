package ch4;

public class MethodEx5 {
	//1.리턴값이 있는 메소드를 선언한다.
	public int  summarize(int a){
		int sum=0;
		for(int i=1; i<=a;i++)
			sum+=i;  //sum=sum+i
		
		return sum;  //메소드를 호출한 위치로 sum의 값을 리턴한다.		
	}
	
	public static void main(String[] args){
		//2.변수 선언
		int num1=10;
		int num2=20;
		int result=0;
		
		//3.사용할 메소드가 있는 클래스의 객체 생성
		MethodEx5 m=new MethodEx5();
		
		result = m.summarize(num1);
		System.out.println("1에서 10까지의 합은 " +result);
		
		result = m.summarize(num2);
		System.out.println("1에서 20까지의 합은 " +result);
		
		System.out.println("1에서 100까지의 합은 " +m.summarize(100));
	}
}

