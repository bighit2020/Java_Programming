package ch7.ex4;

public class MyCar{
	//��� ����
	private static final int SAFE_SPEED =60;  //�����ӵ�
	protected int velocity;
	protected String carName;
	
	

	public MyCar(int velocity, String carName){
		this.velocity=velocity;
		this.carName= carName;
	}

	public static void main(String args[]){
		MyCar myCar, yourCar;

		yourCar = new MyCar(MyCar.SAFE_SPEED, "�ҳ�Ÿ");

		MyCar.SAFE_SPEED = 80;    //����� ���� ������ �� ����.
		myCar = new MyCar(MyCar.SAFE_SPEED, "�ƹ���");

		System.out.println("������� �����ӵ��� " + yourCar.velocity + "�Դϴ�.");
		System.out.println("������ �����ӵ��� " + myCar.velocity+ "�Դϴ�.");

	}
}
