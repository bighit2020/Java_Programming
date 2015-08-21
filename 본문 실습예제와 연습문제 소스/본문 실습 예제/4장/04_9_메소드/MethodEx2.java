package ch4;

public class MethodEx2 {
	// 인자있는  메소드를 선언한다.
	public  void   print(int a){
		System.out.println("결과값= "+a);
		
	}
	
	public static void main(String[] args){
		//2.변수 선언
		int a=11;
		int b=22;
		int result=0;
		
		//3.사용할 메소드가 있는 클래스의 객체 생성
		MethodEx2 m=new MethodEx2();
		result=a+b;
		//4.메소드호출
		m.print(10);
		m.print(b);
		m.print(result);
	}		
}



