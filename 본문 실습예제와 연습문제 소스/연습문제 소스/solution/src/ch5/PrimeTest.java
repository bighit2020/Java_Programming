package ch5;

public class PrimeTest {
	public static void main(String[] args) {
		int num1=4;
		int num2=100;
		
		PrimeUtil p=new PrimeUtil();
		p.calcPrime(num2);
		p.calcPrime(num1,num2);
		
	}
}
