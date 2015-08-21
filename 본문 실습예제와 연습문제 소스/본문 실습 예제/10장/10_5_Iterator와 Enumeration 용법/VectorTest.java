package ch10.ex3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args){
		Vector v= new Vector();
		
		v.add("È«±æµ¿");
		v.addElement("ÀÌ¼ø½Å");
		v.addElement(new Integer(123));
		v.addElement("È«±æµ¿");
		v.addElement(new Integer(123));
		v.addElement(new Student());
		
/*
		 Iterator elements = v.iterator();
		while( elements.hasNext() ){

			System.out.println(elements.next() );
		}
*/
		
		Enumeration enu = v.elements();
		while( enu.hasMoreElements() ){
			System.out.println(enu.nextElement() );
		}		
		
	
	}
}


/*
 * 
		Enumeration enu = v.elements();
		while( enu.hasMoreElements() ){
			System.out.println(enu.nextElement() );
		}

 *  Iterator elements = v.iterator();
	while( elements.hasNext() ){

		System.out.println(elements.next() );
	}*/
