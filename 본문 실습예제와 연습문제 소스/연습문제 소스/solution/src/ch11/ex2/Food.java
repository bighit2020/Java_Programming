package ch11.ex2;

public class Food {
	public  void receiveOrder(String waitor){
		synchronized(this){
			for(int i=0; i<5;i++){
				System.out.println(waitor+ " �� �ֹ��� �޽��ϴ�.");
			}
			
			System.out.println(waitor+ " �� �ֹ��� �ֹ濡 �����մϴ�.");
			System.out.println();
			this.notify();
		}
		
	}
	
	public  void makeFood(String chef){
		synchronized(this){
			for(int i=0; i<5;i++){
				System.out.println(chef+ " ������ ����ϴ�.");
			}
			
			System.out.println(chef + "�� ������ �� ��������ϴ�.");
			System.out.println();
			this.notify();
		}
		
	}
}
