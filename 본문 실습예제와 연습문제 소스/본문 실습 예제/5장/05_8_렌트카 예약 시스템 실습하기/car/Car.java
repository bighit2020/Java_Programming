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
	

	//���� ������ ��ȸ�ϴ� �޼ҵ�
	public String checkCarInfo(){
		 System.out.println("��Ʈī�� ��ȸ�մϴ�.");
		return null;
	}
	
	//�� ���� ������ ����ϴ� �޼ҵ�
	public void regCarInfo(){
		
	}
	
	//���� ������ �����ϴ� �޼ҵ�
	public void modCarInfo(){
		
	}
	
	//���� ������ �����ϴ� �޼ҵ�
	public void delCarInfo(){
		
	}
	

}
