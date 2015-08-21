package ch7;

public class HandBall  implements Sports{

	@Override
	public void shoot() {
		System.out.println("공을 손으로 골대로 던진다.");
	}

	@Override
	public void dribble() {
		System.out.println("공을 손으로 튕기면서 몰고 간다.");
		
	}

	@Override
	public void freeShoot() {
		System.out.println("공을 자유롭게 골대로 던진다.");
	}

	@Override
	public void blockShoot() {
		System.out.println("골키퍼가 상대방의 슛을 막는다.");
	}

}
