package ch11.ex3;

public class Area {
	int num=0;
	
	public synchronized void increase(String tName){
		if(tName.equals("first")){
			for(int i=0; i<100;i++){
				num++;
				System.out.println(tName+":" + num);
			}
		}else if(tName.equals("second")){
			for(int i=0; i<70;i++){
				num++;
				System.out.println(tName+":" + num);
			}
		}else if(tName.equals("third")){
			for(int i=0; i<30;i++){
				num++;
				System.out.println(tName+":" + num);
			}
		}
	}

}
