package ch4;


public class Ifmoon{
	public static void main(String [ ] args){
		int a = 6;
		int b = 5;
		int c = 0;

		int num = 2;

		//if ��
		if(a > b) System.out.println("a > b");

		if(a==4) System.out.println("a�� ���� 4�Դϴ�.");

		if(a==b) System.out.println("a�� ���� b�� ���� �����ϴ�.");



		//����� �̿��� if��
		if(a > b ) {
			System.out.println("a > b");
			System.out.println("block");
		}

		//if ~ else��
		if(a > b) c=a+b;
		else     c= a-b;  //c=-1

		System.out.println("c = " + c );

		//���� if ~ else ��
		if(a > b) c = a+b;
		else if(b > 0 ) c =a-b;
		else System.out.println("else �Դϴ�.");

		System.out.println("c= " + c);


		//switch ��
		switch(num){  //switch ���ǹ����� ������ Ÿ�Ը��� ���ȴ�.
			
			case 1: System.out.println("num = 1");
					break;
			case 2: System.out.println("num = 2");
					break;
			default:System.out.println("����ġ");
		}

	}
}//end class