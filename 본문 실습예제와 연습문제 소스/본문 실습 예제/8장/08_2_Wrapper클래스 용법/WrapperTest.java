package ch8.ex3;

public class WrapperTest {
	public static void main( String [ ]args){
		System.out.println( "int �� �ִ밪>" +  Integer.MAX_VALUE );
		System.out.println( "int �� �ּҰ�>" +  Integer.MIN_VALUE );

	    // ���ڿ� --> ����
		String num = "98";
		String num2 = num + 2;  //���ڰ� �ڵ����� ���ڿ��� ��ȯ�ȴ�.
		System.out.println( "num2>" + num2  );
		
		int num3 = Integer.parseInt ( num ) +  2; //������ ���ڿ��� ���� ���ڷ� ��ȯ�Ѵ�.
		//num3 = Integer.parseInt ( "hello" ) +  2; //������ ���ڿ��� ��ȯ�� �����ϴ�.
		System.out.println( "num3>" + num3  );
		
		System.out.println("�������� ��ȯ�ϱ�");
		System.out.println(num3+ " -->"+Integer.toBinaryString(num3));

		//  ���� --> ���ڿ�
		int num4 = 123;
		String num5 = Integer.toString ( num4 );//toString�޼ҵ带 overriding�ؼ� ���ڸ� ���ڿ��� ��ȯ
		System.out.println( "num5>" + num5 );
	}
}





