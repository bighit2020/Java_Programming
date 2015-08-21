package ch10.ex1;

import java.util.ArrayList;
import java.util.List;

public class ProdTest {	
	public void getProdInfo(List list){
		Product prod=null;
		String code=null;
		String name=null;
		String color=null;
		int qty=0;
		
		for(int i=0; i<list.size();i++){
			prod=(Product)list.get(i);
		   
		   //제품 정보를 출력한다.
		   code=prod.getCode();
		   name=prod.getName();
		   color=prod.getColor();
		   qty=prod.getQty();
		   
		   System.out.println("제품번호 = " +code);
		   System.out.println("제품이름 = " +name);
		   System.out.println("제품색상 = " +color);
		   System.out.println("제품수량 = " +qty);
		   System.out.println();
		}
	}
	
	public static void main(String[] args){
		ArrayList pList= new ArrayList();
		Product p1 = new Product();
		Product p2=new Product("0002","스마트 TV","흰색",200);
		Product p3=new Product("0003","노트북","은색",100);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		ProdTest p= new ProdTest(); 
		
		p.getProdInfo(pList);
	}
}

