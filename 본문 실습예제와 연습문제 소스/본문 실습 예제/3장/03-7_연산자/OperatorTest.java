package ch3.ex1;
/*
   소스 설명:
   1.여러가지 연산자를 안다.
   2.연산자 우선 순위를 안다.

*/

public class OperatorTest{

	public static void main(String[] args){
		int x=10;
		int y=2;
		int z=4;
		int result = x-y*z;

		System.out.println("result=x-y*z   : " + result);  //곱셈부터 연산한다.
		System.out.println("(1+4)*2) : "+(1+4)*2);         //괄호안에 있는 연산자부터 연산한다.
		System.out.println("result%10 :" +result%10);      //10으로 나눈 후 그 나머지를 출력한다.

		String s="Hello";
		int su =10;		
		System.out.println("s instanceof String :" + (s instanceof String)); //s가 문자열 타입인지 검사한다.

		boolean b =true;
		byte i =104;
		System.out.println("!b :" +!b);  //not 연산을 수행한다.
		System.out.println("i :"+ i);  
		System.out.println("Integer.toBinaryString(i) :"+Integer.toBinaryString(i));  //104의 이진수를 출력한다.

		int num =10;

		/* 
		 System.out.println(num);
		 num =num+1;
		*/	

		System.out.println("num++ :"+ (num++));  //num 값을 출력후 1증가시킨다.
		System.out.println("++num :"+ (++num));  //num 값을 1증가 시킨후 출력한다.

		int num1 =10;
		num1++;    //num1을 1증가시킨다.
		System.out.println("num1 :"+ num1);

	}
}//end class