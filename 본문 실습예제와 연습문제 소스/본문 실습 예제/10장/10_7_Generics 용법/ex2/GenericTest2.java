package ch10.ex7;

import java.util.*;
public class GenericTest2 {
	public static void main ( String [ ] args){

		ArrayList<MyStudent>  list = new ArrayList<MyStudent>();
	    list.add( new MyStudent("이순신") );
	    //list.add(new Integer(123));
	    MyStudent s  = list.get(0);
		//MyStudent s  = (MyStudent)list.get(0);  	       
	    //MyStudent s  = (Integer)list.get(0); 
		System.out.println("학생 이름:"+ s.getName());
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
	public String toString(){
		return "이름은 : " + name ;
	}
}


