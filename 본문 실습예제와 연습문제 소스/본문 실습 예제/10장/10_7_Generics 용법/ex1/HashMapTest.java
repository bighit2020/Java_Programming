package ch10.ex6;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest{
	public static void main(String[] args){

		Map<String,Student> map = new HashMap<String,Student>();
		map.put(1, new Integer(100));  //에러발생
		map.put("second","Hello World!!"); //에러 발생
		map.put("third",new Student("홍길동"));
		
		
		
		Student st=map.get("third");
		System.out.println(st); //overriding 된 toString()메소드를 호출한다.
		System.out.println( map.get("third")); //자동으로 형변환을 해준다.
	}
}


class Student {

	String name;

	public Student( String n){
		name = n;
	}
	public String getName(){
		return name;
	}
}

