package ch5.ex2;

//자연수들 사이의 합을 구하는 기능을 하는 클래스
public class MyUtil {
	//두 자연수 사이의 자연수들의 합을 구하는 메소드
	public void summarize(int num1){
		int sum=0;
		for(int i=0; i<=num1;i++){
			sum+=i;
		}
		
		System.out.println("1에서  "+num1 +"사이에 있는 자연수들의 합은 "+sum);
	}
	
	//두 수 사이의 5의 배수를 제외한 자연수의 합을 구하는 메소드
	public void summarize(int num1,int num2){
		int sum=0;
		for(int i=num1; i<=num2;i++){
			if(i%5!=0)
				sum+=i;
		}
		
		System.out.println(num1+"과"+num2+ "사이에 5의 배수를 제외한 자연수들의 합은 "+sum);
	}
}
