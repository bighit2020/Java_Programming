package ch10.ex3;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
/*
    HashSet�� Ư¡
    1.�������� ������ ����.
	2.�������� �ߺ��� ������� �ʴ´�.
 */
public class HashSetTest {
	public static void main ( String [ ] args ){
		   Set  set = new HashSet(); //��ӿ� ���� ������
		   //HashSet ���� ��� ��ü�� ����� �� �ִ�.
		   set.add( "Hello" );
		   set.add( new Integer( 178 ) );
		   set.add( new Float( 4.56F ) );
		   set.add( "Hello" );
		   set.add( new Integer( 178 ) );
		   set.add(new Student());

		   /*
		   Object [ ] obj = set.toArray();
		   
		   for( int i = 0 ; i< set.size() ; i++ ){
				System.out.println(obj[i]);//println�� ��ü�� ���ڷ� ���̸� �ڵ����� �����ǵ�  toString()�޼ҵ尡 ȣ��ȴ�.
		   }
		   */
		   
		   Iterator elements = set.iterator();
			while( elements.hasNext() ){

				System.out.println( "Set=" + elements.next() );
			}
	}
}


