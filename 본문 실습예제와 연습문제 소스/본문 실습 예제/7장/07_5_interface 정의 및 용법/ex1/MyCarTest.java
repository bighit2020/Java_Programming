package ch7.ex7;

public class MyCarTest{
	public static void main(String [ ] args){
		//Car c1 = new Car();

		MyCar c = new MySportsCar(); //upcasting
		MySportsCar s = new MySportsCar();
		MyTruck t = new MyTruck();

		//	Car.SAFE_SPEED = 80;  //����� ���� �Ҵ��ϸ� �����߻� 
		System.out.println("Car.SAFE_SPEED= " +MyCar.SAFE_SPEED);

		c.speedUp();
		c.speedDown();
		//c.turbo();  //���� �߻�
		c.stop();

		System.out.println();

		s.speedUp();
		s.speedDown();
		s.turbo();
		s.stop();

	}
}