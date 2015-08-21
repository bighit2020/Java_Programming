package ch11.ex4a;


public class Horse implements Runnable {
	private int horse_num;

	public Horse(int horse_num) {
		this.horse_num = horse_num;
	}

	public void run() {
		long sleepTime =(long)(Math.random() * 500);
		System.out.println(horse_num + "������ " + sleepTime +"��ŭ sleep ..");
		try{
			//�����尡 ���� �� ���� sleepTime ��ŭ ��� ���·� ������.
				Thread.sleep(sleepTime);
			}catch(Exception e){}
		//��� �ð� ��ŭ ��� �� �� ����� ���� ��߽�Ų��.
		for (int i = 1; i <= 10; i++){
			System.out.println(horse_num+"�� ���� "+100*i+"���� ����");
		}
		System.out.println(horse_num+"�� ���� "+"��¼� ����");
	}
}
