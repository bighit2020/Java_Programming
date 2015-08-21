package ch7;

public class BasketBall  implements Sports{

	@Override
	public void shoot() {
		System.out.println("공을 링에 던진다.");
	}

	@Override
	public void dribble() {
		System.out.println("공을 손으로 몰고 간다.");
	}

	@Override
	public void freeShoot() {
		System.out.println("공을차례대로 링에 던진다.");
	}

	@Override
	public void blockShoot() {
		System.out.println("상대방의 슛을 손으로 막는다.");
	}

}
