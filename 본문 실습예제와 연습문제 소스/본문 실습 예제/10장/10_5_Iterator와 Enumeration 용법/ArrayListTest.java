package ch10.ex3;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
/*
 * ArrayList의 특징
	1.배열과는 달리 크기 지정을 하지않는다.
	2.다른 데이터 타입도 저장한다.
	3.중복이 허용되고 ,순서가 있다.

 */
public class ArrayListTest {
	public static void main ( String [ ] args ){
		   List list = new ArrayList();
		   
		   list.add( "Hello" );
		   list.add( new Integer( 178 ) );
		   list.add(new Student());
		   list.add( new Float( 4.56F ) );
		   list.add( "Hello" );
		   list.add( new Integer( 178 ) );
	
	/*	   
		   for( int i = 0 ; i< list.size() ; i++ ){
				System.out.println(  list.get( i ));
		   }
	*/		
		   
	   Iterator elements = list.iterator();
		while( elements.hasNext() ){

			System.out.println(elements.next() );
		}
	}
}

