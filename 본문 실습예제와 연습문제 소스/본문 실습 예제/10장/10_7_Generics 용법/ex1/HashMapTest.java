package ch10.ex6;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest{
	public static void main(String[] args){

		Map<String,Student> map = new HashMap<String,Student>();
		map.put(1, new Integer(100));  //�����߻�
		map.put("second","Hello World!!"); //���� �߻�
		map.put("third",new Student("ȫ�浿"));
		
		
		
		Student st=map.get("third");
		System.out.println(st); //overriding �� toString()�޼ҵ带 ȣ���Ѵ�.
		System.out.println( map.get("third")); //�ڵ����� ����ȯ�� ���ش�.
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

