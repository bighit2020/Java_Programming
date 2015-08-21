package rent.ex2.car;

import rent.ex2.base.Base;

public class Car extends Base {
	private String carNumber;
	private String carName;
	private String carColor;
	private int carSize;
	private String carMaker;
	
	//getter/setter
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getCarSize() {
		return carSize;
	}
	public void setCarSize(int carSize) {
		this.carSize = carSize;
	}
	public String getCarMaker() {
		return carMaker;
	}
	public void setCarMaker(String carMaker) {
		this.carMaker = carMaker;
	}
	

	//차의 정보를 조회하는 메소드
	public String checkCarInfo(){
		System.out.println("렌트카 조회 시간 :"+showTime());//부모 클래스의 showTime 메소드를 사용하여 메소드 호출 시간을 출력한다.
		System.out.println("렌트카를 조회합니다.");
		 
		return "조회한 렌트카 정보";
	}
	
	//새 차의 정보를 등록하는 메소드
	public void regCarInfo(){
		System.out.println("렌트카 등록 시간 :"+showTime());
		System.out.println("렌트카를 조회합니다.");
	}
	
	//차의 정보를 수정하는 메소드
	public void modCarInfo(){
		System.out.println("렌트카 정보 수정시간 :"+showTime());
		System.out.println("렌트카를 조회합니다.");
	}
	
	//차의 정보를 삭제하는 메소드
	public void delCarInfo(){
		System.out.println("렌트카 정보 삭제 시간 :"+showTime());
		System.out.println("렌트카를 조회합니다.");
	}
}


