package ch11.ex6;

public class Waitor extends Thread{
	String waitor;
	Food food;
	
	public Waitor(String waitor,Food food){
		this.waitor=waitor;
		this.food=food;
	}
	
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			food.receiveOrder(waitor);
		}
	}
}
