package ch8.ex3;

public class WrapperTest2 {
	public static void main( String [ ]args){

		System.out.println( "Float �� �ִ밪>" +  Float.MAX_VALUE );
		System.out.println( "Float �� �ּҰ�>" +  Float.MIN_VALUE );

	    // ���ڿ� --> ����

		String num = "3.14f";
		String num2 = num + 2.0f;  //���ڰ� �ڵ����� ���ڿ��� ��ȯ�ȴ�.
		System.out.println( "num2>" + num2  );
		
		float num3 = Float.parseFloat ( num ) +  2.0f; //������ ���ڿ��� ���� ���ڷ� ��ȯ�Ѵ�.
		System.out.println( "num3>" + num3  );
		

		//  ���� --> ���ڿ�

		float num4 = 123.345f;

		String num5 = Float.toString ( num4 );//toString�޼ҵ带 overriding�ؼ� ���ڸ� ���ڿ��� ��ȯ
		System.out.println( "num5>" + num5 );
	}
}
