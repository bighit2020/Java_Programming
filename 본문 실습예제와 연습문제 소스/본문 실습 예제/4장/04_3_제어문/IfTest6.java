package ch4.ex1;

public class IfTest6 {
	public static void main(String[] args) {
		int num1=10;
		int num2=15;
		
		if(num1%2==0){
			if(num1%5==0){
				System.out.println(num1+"은 2의 배수이고 5의 배수입니다.");
			}else{
				System.out.println(num1+"은 2의 배수이나 5의 배수는 아닙니다.");
			}
		}else{
			System.out.println(num1+"은 2의 배수가 아닙니다.");
		}
		
		if(num2%2==0 && num2%5==0){
			System.out.println(num2+"은 2의 배수이고 5의 배수입니다.");
		}else if(num2%2==0){
			System.out.println(num2+"은 2의 배수이나 5의 배수는 아닙니다.");
		}else if(num2%5==0){
			System.out.println(num2+"은 2의 배수는 아니고, 5의 배수입니다.");
		}else{
			System.out.println(num2+"은 2의 배수도 아니고,5의 배수도 아닙니다.");
		}

	}

}
