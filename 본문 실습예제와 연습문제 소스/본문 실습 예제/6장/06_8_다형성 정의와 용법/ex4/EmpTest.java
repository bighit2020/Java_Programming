package ch6.ex9;

public class EmpTest {
	public static void main(String[] args) {
		String name;
		int totalPay;
		Employee Hong,Lee;
		
		Lee=new Regular("�̼���",2000000,5000000);
		Hong=new Temporary("ȫ�浿",1500000,0,500);
		
		System.out.println("��� ���� ���");
		name=Lee.name;
		totalPay=Lee.calcTotalPay();
		System.out.println("��� �̸�: "+name + " , ��� �ѱ޿�: "+totalPay+"��");
		
		name=Hong.name;
		totalPay=Hong.calcTotalPay(); //�������̵� �� �޼ҵ� ȣ��
		System.out.println("��� �̸�: "+name + " , ��� �ѱ޿�: "+totalPay+"��");
	
	}

}
