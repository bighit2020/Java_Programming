package ch4;

public class Ex4 {
	public static void main(String[] args) {
		//1지역 변수 선언
		int num=100;
		int sum=0;
		
		//2.기능 구현
		for(int i=1;i<=num;i++){
			if(i%2==1){
				sum+=i;
			}else{
				sum-=i;
			}
		}
		//3.결과 출력
		System.out.println("1에서 "+num+"사이의 자연수의 합은 "+sum);
	}
}
