package ch6.ex9;

public class Employee {
	String name;  		//��� �̸�
	int payPerMonth;  //��� ���޿�
	int commsion;  		//���ʽ� 

	public Employee(String name, int payPerMonth, int commsion) {
		this.name = name;
		this.payPerMonth = payPerMonth;
		this.commsion = commsion;
	}

	//������ �ѱ޿� ���ϱ�
	int calcTotalPay(){
		int totalPay=12*payPerMonth+ commsion;
		return totalPay;
	}
}

