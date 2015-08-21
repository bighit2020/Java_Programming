package ch10.ex1;

import java.util.Set;
import java.util.HashSet;
/*
    HashSet의 특징
    1.데이터의 순서가 없다.
	2.데이터의 중복을 허용하지 않는다.
 */
public class HashSetTest {
	public static void main ( String [ ] args ){
		   Set  set = new HashSet(); //상속에 의한 다형성
		   //HashSet 에는 모든 객체가 저장될 수 있다.
		   set.add( "Hello" );
		   set.add( new Integer( 178 ) );
		   set.add( new Float( 4.56F ) );
		   set.add( "Hello" );
		   set.add( new Integer( 178 ) );
		   set.add(new MyStudent());

		   Object [ ] obj = set.toArray();
		   
		   for( int i = 0 ; i< set.size() ; i++ ){
			 //println에 객체가 인자로 쓰이면 자동으로 재정의된  toString()메소드가 호출된다.
				System.out.println(obj[i]);
		   }

		   System.out.println( set );//toString()메소드 호출
	}
}


