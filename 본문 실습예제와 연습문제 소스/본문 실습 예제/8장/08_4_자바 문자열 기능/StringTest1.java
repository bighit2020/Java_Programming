package ch8.ex4;

//���ڿ��� �ٷ�� ���ڿ� ������ ���� ���Ǳ� ������ �⺻�� ����ó�� ���ȴ�.
public class StringTest1 {
	public static void main ( String [ ] args ){
		int a=3;
		int b=0; //a�� ���� ���� b�� ����ȴ�.
		
		b=a; //b�� 3�� �����ص� a�� ���� ������ �ʴ´�.
		System.out.println("a= "+a);
		System.out.println("b= " +b);
		
		String name ="Hong";
		//�޸𸮿� ������ ���ڿ��� ������� �ʰ� ���ο� ���ڿ��� �޸𸮿� �����ȴ�.
		String fullName = name.concat( "kil Dong" ); 

		System.out.println( name );
		System.out.println( fullName );
	}
}


