package ch10.ex5;

import java.util.*;
public class GenericTest {
	public static void main ( String [ ] args){

		ArrayList  list = new ArrayList();
	    list.add( new MyStudent("ÀÌ¼ø½Å") );
		//MyStudent s  = (MyStudent)list.get(0);  	       
	    MyStudent s  = (Integer)list.get(0); 
		System.out.println( s.getName());
	}
}
class MyStudent {

	String name;

	public MyStudent( String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}


