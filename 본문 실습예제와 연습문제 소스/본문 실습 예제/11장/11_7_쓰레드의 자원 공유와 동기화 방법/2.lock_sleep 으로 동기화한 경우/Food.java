package ch11.ex7;

public class Food {
	public synchronized void receiveOrder(String waitor){
		for(int i=0; i<5;i++){
			System.out.println(waitor+ " �� �ֹ��� �޽��ϴ�.");
		}
		
		System.out.println(waitor+ " �� �ֹ��� �ֹ濡 �����մϴ�.");
		System.out.println();
	}
	
	public synchronized void makeFood(String chef){
		for(int i=0; i<5;i++){
			System.out.println(chef+ " ������ ����ϴ�.");
		}
		
		System.out.println(chef + "�� ������ �� ��������ϴ�.");
		System.out.println();
	}
}
