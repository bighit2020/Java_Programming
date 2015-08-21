package ch10.ex2;

import java.util.HashMap;
import java.util.Map;
public class ProductMap {
	public static void displayProdInfo(Map map){
		Product prod=null;
		String code=null;
		String name=null;
		String color=null;
		int qty=0;
		
		System.out.println("Map에 저장된 제품정보 출력");
		System.out.println();
		for(int i=0; i<map.size();i++){
			if(i==0)
				prod=(Product)map.get("p0");
			else if(i==1)
				prod=(Product)map.get("p1");
			else if(i==2)
				prod=(Product)map.get("p2");
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
		
		Map pMap= new HashMap();
		
		Product prod1 = new Product();
		Product prod2=new Product("0002","스마트 TV","흰색",200);
		Product prod3=new Product("0003","노트북","은색",100);
		
		pMap.put("p0",prod1);
		pMap.put("p1",prod2);
		pMap.put("p2",prod3);
		
		displayProdInfo(pMap);
	}
}
