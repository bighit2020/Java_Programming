package ch7;

public class Soccer  implements Sports{

	@Override
	public void shoot() {
		System.out.println("골대에 발로 공을 찬다.");
		
	}

	@Override
	public void dribble() {
		System.out.println("공을 발로 몰고 간다");
	}

	@Override
	public void freeShoot() {
		System.out.println("페널티킥을 찬다.");
	}

	@Override
	public void blockShoot() {
		System.out.println("골키퍼가 공을 막는다");
	}
	

}
