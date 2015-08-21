package ch11.ex4b;


public class Horse implements Runnable {
	private int horse_num;

	public Horse(int horse_num) {
		this.horse_num = horse_num;
	}

	public void run() {
		//��� �ð� ��ŭ ��� �� �� ����� ���� ��߽�Ų��.
		for (int i = 1; i <= 10; i++){
			System.out.println(horse_num+"�� ���� "+100*i+"���� ����");
			if (horse_num == 8 && i == 5) { 
				System.out.println("8�� ��  yield()...");
				Thread.yield(); //���� �������� �� �����尡 ���������� �����·� ����.
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(horse_num+"�� ���� "+"��¼� ����");
	}
}
