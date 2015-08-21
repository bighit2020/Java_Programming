package ch10.ex4;

import java.util.*;

public class PropertiesTest{
	public static void main(String[] args){

		Properties p = new Properties(); //Properties ��ü�� �ϳ� �����.
		p.setProperty("name","ȫ�浿"); //key ,value ���� �Է��Ѵ�
		p.setProperty("age","18");           
		p.setProperty("job","���α׷���");

		String name = p.getProperty("name"); //Ư�� Ű�� ���� ���� �����´�.
		System.out.println("name : " + name);

		System.out.println("======================");
		Enumeration e = p.propertyNames(); //Properties�������ִ� key���� ��� �����´�.
		while(e.hasMoreElements()){  
			String key = (String)e.nextElement(); //Enumeration���� key �� �ϳ��� �����´�.
			System.out.println(key + "=" + p.getProperty(key));
		}
	}
}

