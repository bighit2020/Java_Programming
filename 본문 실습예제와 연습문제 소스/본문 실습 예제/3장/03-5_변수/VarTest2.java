package ch3;
/*
  3장 예제
  소스설명:
   여러가지 변수의 사용예


*/

public class VarTest2{
	public static void main(String args[]){
	 String name="홍길동"; //문자열 변수 name을 선언한 후 초기화를 한다.
	 String address ="서울시 서초구 서초동";
	 boolean isBoolean =true;	
	 
	 address="경기도 수원시 장안동";   //address에 다른 주소를 할당한다.

	 System.out.println(name + "의 실제 주소는 " + address + " 입니다.");
 	 System.out.println();

	 System.out.println("isBoolean 의 값은 " + isBoolean + "입니다.");
	 System.out.println();
	
	 isBoolean =false;

	 System.out.println("isBoolean의 값은 " + isBoolean + " 입니다.");

	}

}

