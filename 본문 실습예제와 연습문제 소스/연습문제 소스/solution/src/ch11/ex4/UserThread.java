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
		
		System.out.println(tName+"��"+ sleepTime +"��ŭ sleep ..");
		try{
			//�����尡 ���� �� ���� sleepTime ��ŭ ��� ���·� ������.
				Thread.sleep(sleepTime);
			}catch(Exception e){
				e.printStackTrace();
			}
		for (int i = 1; i <= 5; i++){
			System.out.println(tName);
		}
	}
}
