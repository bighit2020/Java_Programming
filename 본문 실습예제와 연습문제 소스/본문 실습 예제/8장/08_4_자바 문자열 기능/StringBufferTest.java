package ch8.ex4;

public class StringBufferTest {
	
	public static void main(String args[]) {

		StringBuffer city1 = new StringBuffer("대한시");
		StringBuffer city2 = city1.append( "  민국구" );//append메소드를 이용해서 sb가 가리키는 "Hong"문자열을 변경한다.
		System.out.println("city1:"+city1);
		System.out.println("city2:"+city2);
		
		city2.append(" 하나구");
		System.out.println("city1:"+city1);
		System.out.println("city2:"+city2);
	}
} 

