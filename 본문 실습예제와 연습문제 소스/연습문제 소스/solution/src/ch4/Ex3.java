package ch4;

public class Ex3 {
	public static void main(String[] args) {
		//1.지역 변수 선언
		int num=100;
		int sum=0;
		int count=0;
		
		//2.기능 구현
		while(count<=100){
			if(count%2==1){
				sum+=count;
			}
			count++;
		}
		
		System.out.println("1과 "+num+"사이의  홀수들의 합은"+sum);
	}
}
