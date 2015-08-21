package ch6.ex9;

public class Temporary extends Employee{
	private int workedHour;  //임시직이 일한 시간

	public Temporary(String name, int payPerMonth, int commsion,int workedHour) {
		super(name, payPerMonth, commsion);
		this.workedHour=workedHour;
	}
	
	//임시직 총급여 구하는 오버라이딩 메소드
	protected int calcTotalPay(){
		//상위 메소드를 호출해서 총급여를 구한다.
		//int totalPay=12*payPerMonth+ commsion+ workedHour*2000;
		int temp= super.calcTotalPay();
		
		//임시직은 다시 총 일한 시간을  총급여에 합한 후 구한다.
		int tempTotalPay=temp+ workedHour*2000;
		return tempTotalPay;
	}
}
