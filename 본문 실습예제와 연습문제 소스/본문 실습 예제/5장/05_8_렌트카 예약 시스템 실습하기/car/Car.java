package rent.ex1.car;

public class Car {
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
		 System.out.println("렌트카를 조회합니다.");
		return null;
	}
	
	//새 차의 정보를 등록하는 메소드
	public void regCarInfo(){
		
	}
	
	//차의 정보를 수정하는 메소드
	public void modCarInfo(){
		
	}
	
	//차의 정보를 삭제하는 메소드
	public void delCarInfo(){
		
	}
	

}
