package ch10.ex2;

import java.util.*;
public class HashTableTest{
	public static void main(String[] args){
		Map map = new Hashtable();
		
		map.put(1, new Integer(100));
		map.put("second","Hello World!!");
		map.put("third",new MyStudent());
		//map.put("fourth",null ); //Hashtable null�� ������� �ʴ´�.
		
		//Integer i =map.get(1); //���� �߻�
		Integer i = (Integer)map.get(1);
		//String str=map.get("second");  //�����߻�
		String str=(String)map.get("second");  
		
		System.out.println(i);
		System.out.println(str);
		
		MyStudent st=(MyStudent)map.get("third");
		System.out.println(st); //overriding �� toString()�޼ҵ带 ȣ���Ѵ�.
		System.out.println( map.get("third")); //�ڵ����� ����ȯ�� ���ش�.
		System.out.println(map.get("fourth"));
	}
}




