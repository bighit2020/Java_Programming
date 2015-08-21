package ch4.ex5b;

public class MethodEx6 {
	//1.리턴값이 있는 메소드를 선언한다.
	public void  summarize(int a){
		int sum=0;
		for(int i=1; i<=a;i++)
			sum+=i;  //sum=sum+i
		
		print(a,sum);
	}
	
	public void print(int _a,int sum){
		System.out.println("1에서 "+_a+"까지의 합은 " +sum);
	}
	
	public static void main(String[] args){
		//2.변수 선언
		int num1=10;
		int num2=20;
		int result=0;
		
		//3.사용할 메소드가 있는 클래스의 객체 생성
		MethodEx6 m=new MethodEx6();
		
		m.summarize(num1);
		
		m.summarize(num2);
		
		m.summarize(100);
	}
}

