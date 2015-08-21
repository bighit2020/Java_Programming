package ch4;

public class Ex5 {
	public static void main(String[] args) {
		//1.지역 변수 선언
		int dan=9;
		
		//2.기능 구현
		for(int i=1; i<=dan;i++){
			for(int j=1;j<=9;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		
	}

}
