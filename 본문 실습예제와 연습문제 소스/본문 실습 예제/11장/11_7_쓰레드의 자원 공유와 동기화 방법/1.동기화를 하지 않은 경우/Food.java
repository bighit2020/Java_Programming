package ch11.ex6;

public class Food {
	//Waitor �����尡 ����ϴ� �޼ҵ�
	public  void receiveOrder(String waitor){
		for(int i=0; i<5;i++){
			System.out.println(waitor+ " �� �ֹ��� �޽��ϴ�.");
		}
		
		System.out.println(waitor+ " �� �ֹ��� �ֹ濡 �����մϴ�.");
		System.out.println();
	}
	
	//Chef �����尡 ����ϴ� �޼ҵ�
	public  void makeFood(String chef){
		for(int i=0; i<5;i++){
			System.out.println(chef+ " ������ ����ϴ�.");
		}
		
		System.out.println(chef + "�� ������ �� ��������ϴ�.");
		System.out.println();
	}
}


