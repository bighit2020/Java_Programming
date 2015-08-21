package ch4;

public class Loopmoon5 {
	public static void main(String[ ] args){
	Label1:
		for(int i=0; i<5; i++){
			for(int j=0; j<5;j++){
				if(j==2) break Label1;	        
				System.out.println("j= " +j);
			}		
		}//end for
	}
}

