package ch7;

public class HandBall  implements Sports{

	@Override
	public void shoot() {
		System.out.println("���� ������ ���� ������.");
	}

	@Override
	public void dribble() {
		System.out.println("���� ������ ƨ��鼭 ���� ����.");
		
	}

	@Override
	public void freeShoot() {
		System.out.println("���� �����Ӱ� ���� ������.");
	}

	@Override
	public void blockShoot() {
		System.out.println("��Ű�۰� ������ ���� ���´�.");
	}

}
