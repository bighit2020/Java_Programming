package ch7;

public class Soccer  implements Sports{

	@Override
	public void shoot() {
		System.out.println("��뿡 �߷� ���� ����.");
		
	}

	@Override
	public void dribble() {
		System.out.println("���� �߷� ���� ����");
	}

	@Override
	public void freeShoot() {
		System.out.println("���Ƽű�� ����.");
	}

	@Override
	public void blockShoot() {
		System.out.println("��Ű�۰� ���� ���´�");
	}
	

}
