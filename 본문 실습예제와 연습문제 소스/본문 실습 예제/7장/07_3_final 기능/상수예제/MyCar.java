package ch7.ex4;

public class MyCar{
	//상수 선언
	private static final int SAFE_SPEED =60;  //규정속도
	protected int velocity;
	protected String carName;
	
	

	public MyCar(int velocity, String carName){
		this.velocity=velocity;
		this.carName= carName;
	}

	public static void main(String args[]){
		MyCar myCar, yourCar;

		yourCar = new MyCar(MyCar.SAFE_SPEED, "소나타");

		MyCar.SAFE_SPEED = 80;    //상수는 값을 변경할 수 없다.
		myCar = new MyCar(MyCar.SAFE_SPEED, "아반테");

		System.out.println("당신차의 규정속도는 " + yourCar.velocity + "입니다.");
		System.out.println("내차의 규정속도는 " + myCar.velocity+ "입니다.");

	}
}
