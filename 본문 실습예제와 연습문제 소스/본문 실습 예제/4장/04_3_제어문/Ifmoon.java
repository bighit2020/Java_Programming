package ch4;


public class Ifmoon{
	public static void main(String [ ] args){
		int a = 6;
		int b = 5;
		int c = 0;

		int num = 2;

		//if 문
		if(a > b) System.out.println("a > b");

		if(a==4) System.out.println("a의 값은 4입니다.");

		if(a==b) System.out.println("a의 값과 b의 값은 같습니다.");



		//블록을 이용한 if문
		if(a > b ) {
			System.out.println("a > b");
			System.out.println("block");
		}

		//if ~ else문
		if(a > b) c=a+b;
		else     c= a-b;  //c=-1

		System.out.println("c = " + c );

		//다중 if ~ else 문
		if(a > b) c = a+b;
		else if(b > 0 ) c =a-b;
		else System.out.println("else 입니다.");

		System.out.println("c= " + c);


		//switch 문
		switch(num){  //switch 조건문에는 정수형 타입만이 사용된다.
			
			case 1: System.out.println("num = 1");
					break;
			case 2: System.out.println("num = 2");
					break;
			default:System.out.println("불일치");
		}

	}
}//end class