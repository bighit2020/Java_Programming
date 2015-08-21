package ch4.ex3;

public class ForTest5 {
	public static void main(String[] args) {
		int dan=9;
		
		for(int i=1; i<=dan;i++){
			for(int j=1; j<=9;j++){
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
	}

}
