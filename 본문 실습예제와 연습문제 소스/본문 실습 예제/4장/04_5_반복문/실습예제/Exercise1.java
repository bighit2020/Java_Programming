package ch4.ex4a;

public class Exercise1 {
	public static void main(String[] args){
		int num=148;
		
		for(int i=1; i<=148;i++){
			if(num%i==0)
				System.out.println(i+"는 "+num+"의 약수입니다.");
		}
	}
}
