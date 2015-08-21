package ch8.ex5;

public class ProductArray1 {
	public static void main(String[] args){
		String code=null;
		String name=null;
		String color=null;
		int qty=0;
		
		String[] str=new String[3];  //문자열 배열을 생성한다.
		Product[] product =new Product[3]; //Product 객체를 저장할 수 있는 배열을 생성한다.
		
		Product prod0= new Product();
		Product prod1=new Product("0002","스마트 TV","흰색",200);
		Product prod2=new Product("0003","노트북","은색",100);
		
		str[0]="홍길동";  //문자열 배열 요소에는 문자열만 저장 가능하다.
		str[1]="이순신";
		str[2]="임꺽정";
		
	//	product[0]= "홍길동";  //product 배열에는 Product인스턴스 만  저장가능하다.
		product[0]=prod0;
		product[1]=prod1;
		product[2]=prod2;
		
		System.out.println("배열에 저장한 제품 정보 출력");
		System.out.println();
		
		for(int i=0; i<product.length;i++){
			Product prod=product[i];
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
}


