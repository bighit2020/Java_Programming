package ch10.ex6;

import java.util.ArrayList;
import java.util.List;

public class ProdTest {	
	public void displayProdInfo(List<Product> list){
		Product prod=null;
		String code=null;
		String name=null;
		String color=null;
		int qty=0;
		
		for(int i=0; i<list.size();i++){
			prod=list.get(i);
		   
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
		
		//pList에는 모든 인스턴스가 저장된다.
		//ArrayList pList= new ArrayList();

		//pList에는 Product 인스턴스만이 저장가능하다.
		ArrayList<Product> pList= new ArrayList<Product>();
		Product p1 = new Product();
		Product p2=new Product("0002","스마트 TV","흰색",200);
		Product p3=new Product("0003","노트북","은색",100);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
				
		//pList.add("홍길동"); //에러 발생   
		//pList.add(new Integer(123));
		
		ProdTest test= new ProdTest(); //메소드를 사용하기 위해서 객체를 생성한다.
		test.displayProdInfo(pList);
	}	
}


