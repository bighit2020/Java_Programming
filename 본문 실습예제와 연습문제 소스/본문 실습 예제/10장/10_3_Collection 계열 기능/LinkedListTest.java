package ch10.ex1a;
import java.util.*;
public class LinkedListTest {
	//������ /����X/Ű��/������
	 public static void main(String[] args) 
	 {
		  LinkedList<String> fruitList=new LinkedList<String>(); 
		  
		  fruitList.add("���");
		  fruitList.add("�ٳ���");
		  fruitList.add("����");
		  fruitList.add(2,"����");
		  
		  int position=fruitList.indexOf("����");
		  System.out.println("������ ��ġ: "+position);
		  
		  fruitList.set(0,"������");
		  String fruitName=fruitList.get(0);
		  System.out.println("�����̸�: "+fruitName);
		  
		  
		  fruitList.remove(1);
		  fruitList.remove("����");
		  int size=fruitList.size();
		  System.out.println("\n���Ḯ��Ʈ�� �� ���");
		  for(int cnt=0;cnt<size;cnt++){
			 fruitName=fruitList.get(cnt);
			 System.out.println(fruitName);
		  }

	 }//main

}//class
