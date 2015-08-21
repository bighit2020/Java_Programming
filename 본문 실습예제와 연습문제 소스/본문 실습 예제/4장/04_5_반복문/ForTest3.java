package ch4.ex3;

public class ForTest3 {
	public static void main(String[] args) {
		int rowNum=5;
		int starNum=5;
		
		for(int i=0;i<rowNum;i++){
			for(int j=0; j<starNum;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
