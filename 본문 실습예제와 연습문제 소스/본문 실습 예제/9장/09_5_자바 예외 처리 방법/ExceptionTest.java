package ch9.ex1;

public class ExceptionTest{
	public static void main( String [ ]args){
			try{
				 int [ ] num = new int[3];
				 num[0] = 1;
				 num[1] = 2;
				 num[2] = 3;
				System.out.println("1 2 3 �Է�" );

			} catch( ArrayIndexOutOfBoundsException e){
				 System.out.println("ArrayIndexOutOfBoundsException ó��" );	
				// e.printStackTrace();
			}
			System.out.println("������ �κ�" );				
	}
}


