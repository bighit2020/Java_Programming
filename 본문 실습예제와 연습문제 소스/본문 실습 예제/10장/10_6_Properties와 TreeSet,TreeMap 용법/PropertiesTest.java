package ch10.ex4;

import java.util.*;

public class PropertiesTest{
	public static void main(String[] args){

		Properties p = new Properties(); //Properties 객체를 하나 만든다.
		p.setProperty("name","홍길동"); //key ,value 값을 입력한다
		p.setProperty("age","18");           
		p.setProperty("job","프로그래머");

		String name = p.getProperty("name"); //특정 키에 대한 값을 가져온다.
		System.out.println("name : " + name);

		System.out.println("======================");
		Enumeration e = p.propertyNames(); //Properties가지고있는 key값을 모두 가져온다.
		while(e.hasMoreElements()){  
			String key = (String)e.nextElement(); //Enumeration에서 key 를 하나씩 가져온다.
			System.out.println(key + "=" + p.getProperty(key));
		}
	}
}

