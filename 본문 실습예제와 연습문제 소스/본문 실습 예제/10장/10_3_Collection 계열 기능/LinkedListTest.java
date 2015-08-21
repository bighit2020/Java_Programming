package ch10.ex1a;
import java.util.*;
public class LinkedListTest {
	//오렌지 /딸기X/키위/복숭아
	 public static void main(String[] args) 
	 {
		  LinkedList<String> fruitList=new LinkedList<String>(); 
		  
		  fruitList.add("사과");
		  fruitList.add("바나나");
		  fruitList.add("수박");
		  fruitList.add(2,"망고");
		  
		  int position=fruitList.indexOf("수박");
		  System.out.println("수박의 위치: "+position);
		  
		  fruitList.set(0,"오렌지");
		  String fruitName=fruitList.get(0);
		  System.out.println("과일이름: "+fruitName);
		  
		  
		  fruitList.remove(1);
		  fruitList.remove("수박");
		  int size=fruitList.size();
		  System.out.println("\n연결리스트의 값 출력");
		  for(int cnt=0;cnt<size;cnt++){
			 fruitName=fruitList.get(cnt);
			 System.out.println(fruitName);
		  }

	 }//main

}//class
