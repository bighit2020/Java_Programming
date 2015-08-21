package ch9.ex2;

public class ArrayUtil  {
	//unchecked Exception 계열은 throws 생략가능
	public void call()   throws  Exception{  
	
		System.out.println("call 메소드 시작");

 				 int [ ] num = new int[2];
				 num[0] = 1;
				 num[1] = 2;
				 num[2] = 3;
				 
		System.out.println("call 메소드 종료");
	}
}



