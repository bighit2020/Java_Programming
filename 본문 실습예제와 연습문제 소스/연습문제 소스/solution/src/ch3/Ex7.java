package ch3;

public class Ex7 {
	public static void main(String[] args) {
		int num1=12345;
		int digit=0;
		digit+=num1%10;
		
		num1/=10;
		digit+=num1%10;
		
		num1/=10;
		digit+=num1%10;
		
		num1/=10;
		digit+=num1%10;
		
		num1/=10;
		digit+=num1%10;
		
		System.out.println(num1+"의 각 자리수의 합은 "+digit);
		
	}
}
