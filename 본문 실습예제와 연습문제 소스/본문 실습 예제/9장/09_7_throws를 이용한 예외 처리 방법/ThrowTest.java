package ch9.ex2;

public class ThrowTest{
	public static void main(String[] args){
		ArrayUtil t= new ArrayUtil();

		try{
			t.call();
			System.out.println("Hello");
			
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("main �޼ҵ忡�� ���� ó��");
		}
			System.out.println("World");
	}
}


