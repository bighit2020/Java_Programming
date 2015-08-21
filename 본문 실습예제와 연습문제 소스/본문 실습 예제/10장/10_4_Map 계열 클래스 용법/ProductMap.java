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
		
		System.out.println("Map�� ����� ��ǰ���� ���");
		System.out.println();
		for(int i=0; i<map.size();i++){
			if(i==0)
				prod=(Product)map.get("p0");
			else if(i==1)
				prod=(Product)map.get("p1");
			else if(i==2)
				prod=(Product)map.get("p2");
		   //��ǰ ������ ����Ѵ�.
		   code=prod.getCode();
		   name=prod.getName();
		   color=prod.getColor();
		   qty=prod.getQty();
		   
		   System.out.println("��ǰ��ȣ = " +code);
		   System.out.println("��ǰ�̸� = " +name);
		   System.out.println("��ǰ���� = " +color);
		   System.out.println("��ǰ���� = " +qty);
		   System.out.println();
		}
		
		
	}
	
	public static void main(String[] args){
		
		Map pMap= new HashMap();
		
		Product prod1 = new Product();
		Product prod2=new Product("0002","����Ʈ TV","���",200);
		Product prod3=new Product("0003","��Ʈ��","����",100);
		
		pMap.put("p0",prod1);
		pMap.put("p1",prod2);
		pMap.put("p2",prod3);
		
		displayProdInfo(pMap);
	}
}
