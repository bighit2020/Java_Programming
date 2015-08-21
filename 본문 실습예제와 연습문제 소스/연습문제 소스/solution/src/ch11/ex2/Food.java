package ch11.ex2;

public class Food {
	public  void receiveOrder(String waitor){
		synchronized(this){
			for(int i=0; i<5;i++){
				System.out.println(waitor+ " 이 주문을 받습니다.");
			}
			
			System.out.println(waitor+ " 가 주문을 주방에 전달합니다.");
			System.out.println();
			this.notify();
		}
		
	}
	
	public  void makeFood(String chef){
		synchronized(this){
			for(int i=0; i<5;i++){
				System.out.println(chef+ " 음식을 만듭니다.");
			}
			
			System.out.println(chef + "가 음식을 다 만들었습니다.");
			System.out.println();
			this.notify();
		}
		
	}
}
