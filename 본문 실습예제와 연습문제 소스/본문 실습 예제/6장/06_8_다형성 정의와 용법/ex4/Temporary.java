package ch6.ex9;

public class Temporary extends Employee{
	private int workedHour;  //�ӽ����� ���� �ð�

	public Temporary(String name, int payPerMonth, int commsion,int workedHour) {
		super(name, payPerMonth, commsion);
		this.workedHour=workedHour;
	}
	
	//�ӽ��� �ѱ޿� ���ϴ� �������̵� �޼ҵ�
	protected int calcTotalPay(){
		//���� �޼ҵ带 ȣ���ؼ� �ѱ޿��� ���Ѵ�.
		//int totalPay=12*payPerMonth+ commsion+ workedHour*2000;
		int temp= super.calcTotalPay();
		
		//�ӽ����� �ٽ� �� ���� �ð���  �ѱ޿��� ���� �� ���Ѵ�.
		int tempTotalPay=temp+ workedHour*2000;
		return tempTotalPay;
	}
}
