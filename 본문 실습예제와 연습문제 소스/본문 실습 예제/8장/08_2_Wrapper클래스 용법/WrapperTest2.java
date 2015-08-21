package ch8.ex3;

public class WrapperTest2 {
	public static void main( String [ ]args){

		System.out.println( "Float 의 최대값>" +  Float.MAX_VALUE );
		System.out.println( "Float 의 최소값>" +  Float.MIN_VALUE );

	    // 문자열 --> 숫자

		String num = "3.14f";
		String num2 = num + 2.0f;  //숫자가 자동으로 문자열로 변환된다.
		System.out.println( "num2>" + num2  );
		
		float num3 = Float.parseFloat ( num ) +  2.0f; //숫자형 문자열을 실제 숫자로 변환한다.
		System.out.println( "num3>" + num3  );
		

		//  숫자 --> 문자열

		float num4 = 123.345f;

		String num5 = Float.toString ( num4 );//toString메소드를 overriding해서 숫자를 문자열로 변환
		System.out.println( "num5>" + num5 );
	}
}
