package ch3;
/*
  3�� ����
  �ҽ�����:
   �������� ������ ��뿹


*/

public class VarTest{
	public static void main(String args[]){
	 int a;	  //������ ���� a��  �����Ѵ�.
	 //int 1a;	 //�������� ó�������� �ݵ�� �����̾�� �Ѵ�.									 
	 int a1;   //���������� ���ڵڿ� ���ڸ� �� �� �ִ�.
	 int a123b;  
	 int a123$; //Ư������ �� $�� '_'�� ���� �̸��� ��밡���ϴ�.
	 int a_123;
	// int a@#; //���������� Ư�����ڸ� �� �� ����.
	 int b,c;  //������ ���� b,c�� �����Ѵ�.
	 int b1,c1;
	 int sum;
	 int min;
	 int div;
	 int  mul;


	 a=3;	 
	// a=3.14  //���� �߻�
	 b=5;
	 c=a;		  //���� a�� ����� ���� �Ҵ��϶�.
     a=a+4;    
	
     a1=10;
	 b1=20;
	 


	 sum = b+c;	 //b��c�� ���� ����� sum�� �Ҵ��Ѵ�.
	 c1= a1+b1;
	 min=b-c;	 //b�� c�� ���� ����� div�� �Ҵ��Ѵ�.
	 mul = b*c;  //b�� c�� ���� ����� mul�� �Ҵ��Ѵ�.
	 div= b/c ;	  //�������� ����� �������� ĳ���õȴ�.


	 System.out.println("b+c�� ���� " + sum+ "�Դϴ�.");
	 System.out.println("b1+c1�� ���� " + c1+ "�Դϴ�.");
	 System.out.println("b-c�� ���� " + min + " �Դϴ�.");
	 System.out.println("b*c�� ���� " + mul + " �Դϴ�.");
	 System.out.println("b/c�� ���� " + div + " �Դϴ�.");

	}

}