package ch7;

public class BasketBall  implements Sports{

	@Override
	public void shoot() {
		System.out.println("���� ���� ������.");
	}

	@Override
	public void dribble() {
		System.out.println("���� ������ ���� ����.");
	}

	@Override
	public void freeShoot() {
		System.out.println("�������ʴ�� ���� ������.");
	}

	@Override
	public void blockShoot() {
		System.out.println("������ ���� ������ ���´�.");
	}

}
