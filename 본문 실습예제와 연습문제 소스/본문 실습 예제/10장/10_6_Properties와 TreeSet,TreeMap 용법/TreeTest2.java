package ch10.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeTest2 {

	public static void main(String[] args) {
		  TreeMap tm = new TreeMap();
		  
		  tm.put("홍길동", "서울시");
		  tm.put("차범근", "대구시");
		  tm.put("유재석", "부산시");
		  tm.put("박명수", "서울시");
		  tm.put("박지성", "광주시");
		  tm.put("박지성", "부산시");
		  tm.put("김유신", "울산시");
		  
		  Set set=tm.keySet();
		  Iterator ite= set.iterator();
		  
		  while(ite.hasNext()){
			  //System.out.println(ite.next());
			  String key=(String)ite.next();
			  String value=(String)tm.get(key);
			  
			  System.out.println("key="+key+",value="+value);
		  }
		  
		  
		  System.out.println(tm); 
		  
	}

}
