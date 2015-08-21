package ch11.ex4a;


public class Horse implements Runnable {
	private int horse_num;

	public Horse(int horse_num) {
		this.horse_num = horse_num;
	}

	public void run() {
		long sleepTime =(long)(Math.random() * 500);
		System.out.println(horse_num + "번말이 " + sleepTime +"만큼 sleep ..");
		try{
			//쓰레드가 실행 시 먼저 sleepTime 만큼 대기 상태로 보낸다.
				Thread.sleep(sleepTime);
			}catch(Exception e){}
		//대기 시간 만큼 대기 한 후 깨어나서 말을 출발시킨다.
		for (int i = 1; i <= 10; i++){
			System.out.println(horse_num+"번 말이 "+100*i+"미터 도착");
		}
		System.out.println(horse_num+"번 말이 "+"결승선 도착");
	}
}
