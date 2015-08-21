package ch4.ex1;

public class IfTest4 {
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int c = 0;

		if(a > b ) {
		   System.out.println("a는 b보다 큽니다.");
		   System.out.println("a의 값은 "+a);
		}else if(b >0){
		   System.out.println("b는 0보다 큽니다.");
		   System.out.println("b의 값은 "+b);
		}else{
		  System.out.println("모든 조건식이 거짓입니다.");
		}
	}
}
