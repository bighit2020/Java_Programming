package ch10.ex1;

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
		   list.add(new MyStudent());
		   list.add( new Float( 4.56F ) );
		   list.add( "Hello" );
		   list.add( new Integer( 178 ) );
		   
			//컬렉션 객체에 저장된 데이터는 접근 시 반드시 형변환 해 주어야 한다.
		   //String name = list.get(0); //에러 발생
			String name = (String)list.get(0);  
			Integer i1 = (Integer)list.get(1);
			MyStudent s=(MyStudent)list.get(2);
			  
			System.out.println("name= "+name);
			System.out.println("i1= " + i1);
			System.out.println(s);
			System.out.println();

			list.remove(2); //세번째 저장객체를 제거한다.
		    for( int i = 0 ; i< list.size() ; i++ ){
				System.out.println(  list.get( i ));
			}
		   System.out.println( list );//ArrayList의 toString()메소드 호출
	}
}


