package ch10.ex6;

import java.util.ArrayList;

public class BoxingTest{
	public static void main ( String [ ] args){
		  ArrayList<Object>  list = new ArrayList<Object>();

		// ����ڽ�/�����ڽ� ����� 
		  Integer data0 = new Integer( 123 );
		  list.add ( data0 ); 
		  Integer data1  = (Integer)list.get(0);
		  int  num  = data1.intValue();
		  System.out.println( num );

		// ����ڽ�/�����ڽ� �����		
		int  data2 = 543;
		//autoboxing(543�� �ڵ����� new Integer(543)���� ��ȯ�ȴ�.)
		list.add( data2 ); 
		//unautoboxing(Integer(543)-->543���� �ڵ� ��ȯ)
		int  data3 = (Integer)list.get(1); 
		System.out.println( data3);

	}
}


