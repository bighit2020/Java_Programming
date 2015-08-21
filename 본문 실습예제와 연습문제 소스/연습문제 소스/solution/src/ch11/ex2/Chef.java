package ch11.ex2;

public class Chef  extends Thread{
	String chef;
	Food food;
	
	public Chef(String chef, Food food){
		this.chef=chef;
		this.food=food;
	}
	
	public void run(){
		while(true){
			try{
				Thread.sleep(10);
			}catch(Exception e){
				e.printStackTrace();
			}
			food.makeFood(chef);
		}
	}
}
