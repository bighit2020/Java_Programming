package ch4;

public class MethodEx1 {

	
	//1.리턴값과 인자없는 메소드를 선언한다.
	public  void   print(){
		System.out.println("메소드를 호출합니다.");
		
	}
	
	public static void main(String[] args){
		//2.변수 선언
		int a=1;
		int b=2;
		int result=0;
		
		//3.사용할 메소드가 있는 클래스의 객체 생성
		MethodEx1 method=new MethodEx1();
		
		//4.메소드호출
		method.print();
		method.print();
		method.print();
		
	}	

}
