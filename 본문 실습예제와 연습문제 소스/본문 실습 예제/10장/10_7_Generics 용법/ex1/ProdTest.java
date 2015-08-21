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
		
		//pList���� ��� �ν��Ͻ��� ����ȴ�.
		//ArrayList pList= new ArrayList();

		//pList���� Product �ν��Ͻ����� ���尡���ϴ�.
		ArrayList<Product> pList= new ArrayList<Product>();
		Product p1 = new Product();
		Product p2=new Product("0002","����Ʈ TV","���",200);
		Product p3=new Product("0003","��Ʈ��","����",100);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
				
		//pList.add("ȫ�浿"); //���� �߻�   
		//pList.add(new Integer(123));
		
		ProdTest test= new ProdTest(); //�޼ҵ带 ����ϱ� ���ؼ� ��ü�� �����Ѵ�.
		test.displayProdInfo(pList);
	}	
}


