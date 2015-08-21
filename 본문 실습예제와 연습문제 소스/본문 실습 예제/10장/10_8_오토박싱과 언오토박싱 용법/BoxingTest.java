package ch10.ex6;

import java.util.ArrayList;

public class BoxingTest{
	public static void main ( String [ ] args){
		  ArrayList<Object>  list = new ArrayList<Object>();

		// 오토박싱/언오토박싱 사용전 
		  Integer data0 = new Integer( 123 );
		  list.add ( data0 ); 
		  Integer data1  = (Integer)list.get(0);
		  int  num  = data1.intValue();
		  System.out.println( num );

		// 오토박싱/언오토박싱 사용후		
		int  data2 = 543;
		//autoboxing(543이 자동으로 new Integer(543)으로 변환된다.)
		list.add( data2 ); 
		//unautoboxing(Integer(543)-->543으로 자동 변환)
		int  data3 = (Integer)list.get(1); 
		System.out.println( data3);

	}
}


