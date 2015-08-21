package ch4;

public class MethodEx4 {
	//1.리턴값이 있는 메소드를 선언한다.
	public int  add(int a, int b){
		int c=a+b;
		return c;
		//return 3.5; 에러 발생
	}
	
	public static void main(String[] args){
		//2.변수 선언
		int num1=10;
		int num2=20;
		int result=0;
		
		//3.사용할 메소드가 있는 클래스의 객체 생성
		MethodEx4 m=new MethodEx4();
		
		//메소드를 호출한 후 리턴값이 result에 저장된다.
		result = m.add(num1,num2);
		
		//5.결과출력
		System.out.println("두 수의 합은 " +result);
		System.out.println("두 수의 합은 " +m.add(100, 300));
	}	
}

