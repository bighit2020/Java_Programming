package ch8.ex3;

public class WrapperTest {
	public static void main( String [ ]args){
		System.out.println( "int 의 최대값>" +  Integer.MAX_VALUE );
		System.out.println( "int 의 최소값>" +  Integer.MIN_VALUE );

	    // 문자열 --> 숫자
		String num = "98";
		String num2 = num + 2;  //숫자가 자동으로 문자열로 변환된다.
		System.out.println( "num2>" + num2  );
		
		int num3 = Integer.parseInt ( num ) +  2; //숫자형 문자열을 실제 숫자로 변환한다.
		//num3 = Integer.parseInt ( "hello" ) +  2; //숫자형 문자열만 변환이 가능하다.
		System.out.println( "num3>" + num3  );
		
		System.out.println("이진수로 변환하기");
		System.out.println(num3+ " -->"+Integer.toBinaryString(num3));

		//  숫자 --> 문자열
		int num4 = 123;
		String num5 = Integer.toString ( num4 );//toString메소드를 overriding해서 숫자를 문자열로 변환
		System.out.println( "num5>" + num5 );
	}
}





