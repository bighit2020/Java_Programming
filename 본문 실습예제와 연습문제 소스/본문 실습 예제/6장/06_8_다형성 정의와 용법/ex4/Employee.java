package ch6.ex9;

public class Employee {
	String name;  		//사원 이름
	int payPerMonth;  //사원 월급여
	int commsion;  		//보너스 

	public Employee(String name, int payPerMonth, int commsion) {
		this.name = name;
		this.payPerMonth = payPerMonth;
		this.commsion = commsion;
	}

	//정규직 총급여 구하기
	int calcTotalPay(){
		int totalPay=12*payPerMonth+ commsion;
		return totalPay;
	}
}

