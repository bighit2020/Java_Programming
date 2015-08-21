package ch5.ex4;

//자연수들 사이의 합을 구하는 기능을 하는 클래스
public class MyUtil {
	//1에서 임의의 자연수 사이의 자연수의 합을 구한는 메소드
	public void summarize(int num1){
		int sum=0;
		for(int i=1; i<=num1;i++){
			sum+=i;
		}
		
		System.out.println("1과"+num1+ "사이에 있는 자연수들의 합은 "+sum);
	}
	
	//두 자연수 사이의 자연수들의 합을 구하는 메소드
	//public void summarize2(int num1,int num2){
	public void summarize(int num1,int num2){
		int sum=0;
		for(int i=num1; i<=num2;i++){
				sum+=i;
		}
		
		System.out.println(num1+"과"+num2+ "사이의  자연수들의 합은 "+sum);
	}
}
