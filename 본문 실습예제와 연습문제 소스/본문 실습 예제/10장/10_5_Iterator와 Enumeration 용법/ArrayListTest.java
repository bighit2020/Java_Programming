package ch10.ex3;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
/*
 * ArrayList�� Ư¡
	1.�迭���� �޸� ũ�� ������ �����ʴ´�.
	2.�ٸ� ������ Ÿ�Ե� �����Ѵ�.
	3.�ߺ��� ���ǰ� ,������ �ִ�.

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

