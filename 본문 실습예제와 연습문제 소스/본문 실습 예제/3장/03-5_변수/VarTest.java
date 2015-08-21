package ch3;
/*
  3장 예제
  소스설명:
   여러가지 변수의 사용예


*/

public class VarTest{
	public static void main(String args[]){
	 int a;	  //정수형 변수 a를  선언한다.
	 //int 1a;	 //변수명의 처음글자은 반드시 문자이어야 한다.									 
	 int a1;   //변수명으로 문자뒤에 숫자를 쓸 수 있다.
	 int a123b;  
	 int a123$; //특수문자 중 $와 '_'는 변수 이름을 사용가능하다.
	 int a_123;
	// int a@#; //변수명으로 특수문자를 쓸 수 없다.
	 int b,c;  //정수형 변수 b,c를 선언한다.
	 int b1,c1;
	 int sum;
	 int min;
	 int div;
	 int  mul;


	 a=3;	 
	// a=3.14  //에러 발생
	 b=5;
	 c=a;		  //변수 a의 저장된 값을 할당하라.
     a=a+4;    
	
     a1=10;
	 b1=20;
	 


	 sum = b+c;	 //b와c의 합의 결과은 sum에 할당한다.
	 c1= a1+b1;
	 min=b-c;	 //b와 c의 차의 결과를 div에 할당한다.
	 mul = b*c;  //b와 c의 곱의 결과을 mul에 할당한다.
	 div= b/c ;	  //나눗셈의 결과는 정수으로 캐스팅된다.


	 System.out.println("b+c의 값은 " + sum+ "입니다.");
	 System.out.println("b1+c1의 값은 " + c1+ "입니다.");
	 System.out.println("b-c의 값은 " + min + " 입니다.");
	 System.out.println("b*c의 값은 " + mul + " 입니다.");
	 System.out.println("b/c의 값은 " + div + " 입니다.");

	}

}