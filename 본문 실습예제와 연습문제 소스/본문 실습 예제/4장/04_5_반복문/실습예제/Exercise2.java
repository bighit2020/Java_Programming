package ch4.ex4a;

public class Exercise2 {
	public static void main(String[] args) {
		int num1=150;
		int num2=300;
		
		for(int i=1; i<=num1;i++){
			if(num1%i==0 && num2%i==0)
				System.out.println(i+"�� "+num1+"�� "+num2+"�� ������Դϴ�.");
		}
	}
}
