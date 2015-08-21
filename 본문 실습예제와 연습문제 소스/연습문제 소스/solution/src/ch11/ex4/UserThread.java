package ch11.ex4;

public class UserThread extends Thread {
	private String tName=null;
	long sleepTime=0;
	
	public UserThread(String tName){
		this.tName=tName;
	}
	public void run(){
		
		if(tName.equals("first")){
			sleepTime=500;
		}else if(tName.equals("second")){
			sleepTime=300;
		}else if(tName.equals("third")){
			sleepTime=100;
		}
		
		System.out.println(tName+"이"+ sleepTime +"만큼 sleep ..");
		try{
			//쓰레드가 실행 시 먼저 sleepTime 만큼 대기 상태로 보낸다.
				Thread.sleep(sleepTime);
			}catch(Exception e){
				e.printStackTrace();
			}
		for (int i = 1; i <= 5; i++){
			System.out.println(tName);
		}
	}
}
