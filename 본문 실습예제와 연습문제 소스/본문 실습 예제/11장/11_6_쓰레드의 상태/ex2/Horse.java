package ch11.ex4b;


public class Horse implements Runnable {
	private int horse_num;

	public Horse(int horse_num) {
		this.horse_num = horse_num;
	}

	public void run() {
		//대기 시간 만큼 대기 한 후 깨어나서 말을 출발시킨다.
		for (int i = 1; i <= 10; i++){
			System.out.println(horse_num+"번 말이 "+100*i+"미터 도착");
			if (horse_num == 8 && i == 5) { 
				System.out.println("8번 말  yield()...");
				Thread.yield(); //현재 실행중인 단 쓰레드가 강제적으로 대기상태로 간다.
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(horse_num+"번 말이 "+"결승선 도착");
	}
}
