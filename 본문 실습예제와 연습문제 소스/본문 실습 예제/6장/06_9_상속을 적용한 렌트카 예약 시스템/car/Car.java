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
	

	//���� ������ ��ȸ�ϴ� �޼ҵ�
	public String checkCarInfo(){
		System.out.println("��Ʈī ��ȸ �ð� :"+showTime());//�θ� Ŭ������ showTime �޼ҵ带 ����Ͽ� �޼ҵ� ȣ�� �ð��� ����Ѵ�.
		System.out.println("��Ʈī�� ��ȸ�մϴ�.");
		 
		return "��ȸ�� ��Ʈī ����";
	}
	
	//�� ���� ������ ����ϴ� �޼ҵ�
	public void regCarInfo(){
		System.out.println("��Ʈī ��� �ð� :"+showTime());
		System.out.println("��Ʈī�� ��ȸ�մϴ�.");
	}
	
	//���� ������ �����ϴ� �޼ҵ�
	public void modCarInfo(){
		System.out.println("��Ʈī ���� �����ð� :"+showTime());
		System.out.println("��Ʈī�� ��ȸ�մϴ�.");
	}
	
	//���� ������ �����ϴ� �޼ҵ�
	public void delCarInfo(){
		System.out.println("��Ʈī ���� ���� �ð� :"+showTime());
		System.out.println("��Ʈī�� ��ȸ�մϴ�.");
	}
}


