package ch8.ex4;

//문자열을 다루는 문자열 변수는 많이 사용되기 때문에 기본형 변수처럼 사용된다.
public class StringTest1 {
	public static void main ( String [ ] args ){
		int a=3;
		int b=0; //a의 값이 변수 b에 복사된다.
		
		b=a; //b에 3을 저장해도 a의 값은 변하지 않는다.
		System.out.println("a= "+a);
		System.out.println("b= " +b);
		
		String name ="Hong";
		//메모리에 생성된 문자열은 변경되지 않고 새로운 문자열이 메모리에 생성된다.
		String fullName = name.concat( "kil Dong" ); 

		System.out.println( name );
		System.out.println( fullName );
	}
}


