package ch8.ex5;

public class ObjectArray {
	public static void main(String[] args){	
		String code=null;
		String name=null;
		String color=null;
		int qty=0;
		
		//모든 클래스의 인스턴스를 저장할 수 있는 Object 배열을 선언한다.
		Object object[] =new Object[5]; 
		
		Product prod0= new Product();
		Product prod1=new Product("0002","스마트 TV","흰색",200);
		Product prod2=new Product("0003","노트북","은색",100);
		 //Object 타입 배열요소에는 모든 클래스의 인트턴스가 저장 가능하다.(상속에 의한 다형성)
		object[0]= "홍길동"; 
		object[1]=prod0;
		object[2]=prod1;
		object[3]=prod2;
		object[4]=new Integer(123);
		
		
		System.out.println("Object 배열에 저장한  제품 정보 출력");
		System.out.println();
		
		for(int i=0; i<object.length;i++){
			if(object[i] instanceof Product){
				Product prod=(Product)object[i];
				code=prod.getCode();
				name=prod.getName();
				color=prod.getColor();
				qty=prod.getQty();
				
				
				 System.out.println("제품번호 = " +code);
				 System.out.println("제품이름 = " +name);
				 System.out.println("제품색상 = " +color);
				 System.out.println("제품수량 = " +qty);
				 
			}else{
				System.out.println(object[i]);
			}
			System.out.println();
		}
	}
}


