package ch8.ex4;

public class StringMethodTest{
	public static void main(String [] args){
		String s = "Hello World";
		
		System.out.println(s.concat(" and Java!!"));	// 문자열 연결
		System.out.println(s.replace('o','c'));	// 문자 바꿈
		System.out.println(s.substring(2,4));	// 부분열 출력(세번째문자부터 네번째 문자사이의 문자열을 출력)
		System.out.println(s.toLowerCase());	// 소문자로 바꿈
		System.out.println(s.toUpperCase());	// 대문자로 바꿈
		System.out.println("Hello World".toUpperCase());
		System.out.println(s.endsWith("World"));	// 끝나는 문자열 비교
	
		System.out.println(s.charAt(3));		//  인덱스값 에 맞는 문자 출력
		System.out.println(s.length());			//  문자열 길이
		System.out.println("hello world".length());
		System.out.println(s);					//"hello world"문자열은 변경되지 않는다.
		System.out.println(s.indexOf("o"));		//문자열에서 첫번째 o의  인덱스값 출력 
		System.out.println(s.indexOf("a"));		
		
		System.out.println(s.lastIndexOf("o"));	
		
		//문자열의 문자를 출력한다.
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			System.out.println(ch);
		}

	}
}

