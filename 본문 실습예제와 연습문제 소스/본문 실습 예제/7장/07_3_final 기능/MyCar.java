/*
 ������ final�� ����
*/
package ch7.ex3;

public class MyCar{
	private final int SAFE_SPEED = 100;

	public void speedUp(int value ){
		SAFE_SPEED = value;	
		System.out.println("���ǵ�� " + SAFE_SPEED);

	}

	public static void main(String args[]){
		MyCar myCar = new MyCar();
		myCar.speedUp(150);
		myCar.speedUp(200);
		
	}
}


