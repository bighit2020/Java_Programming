package ch11.ex3;

public class CountThread extends Thread {
	private String tName;
	private Area area;
	
	public CountThread(String tName,Area area){
		this.tName=tName;
		this.area=area;
	}
	
	public void run(){
		area.increase(tName);
		
	}

}
