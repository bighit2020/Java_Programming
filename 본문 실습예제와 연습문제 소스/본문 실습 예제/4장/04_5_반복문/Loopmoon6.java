package ch4;

public class Loopmoon6 {
	public static void main(String[ ] args){
	// 이중for문
		for(int i=0; i<5; i++){  
			System.out.println("i= " + i);
			for(int j=0; j<5; j++){
				if(j==2) continue; //내부for문의 증감식으로 이동한다.
				System.out.println("j= " + j);
			}
				System.out.println();
		}
	}
}


