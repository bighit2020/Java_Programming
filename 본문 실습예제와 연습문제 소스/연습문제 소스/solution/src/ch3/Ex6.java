package ch3;

public class Ex6 {
	public static void main(String[] args) {
		int money=167730;
		
		int gasu=0;
		
		gasu=money/50000;
		System.out.println("5만원 권 개수: "+gasu);
		money=money%50000;
		gasu=money/10000;
		System.out.println("1만원 권 개수: "+gasu);
		
		money=money%10000;
		gasu=money/5000;
		System.out.println("5천원 권 개수: "+gasu);
		
		money=money%5000;
		gasu=money/1000;
		System.out.println("1천원 권 개수: "+gasu);		
		
		money=money%1000;
		gasu=money/500;
		System.out.println("5백원 권 개수: "+gasu);
		
		money=money%500;
		gasu=money/100;
		System.out.println("1백원 권 개수: "+gasu);
		
		money=money%100;
		gasu=money/50;
		System.out.println("5십원 권 개수: "+gasu);
		
		money=money%50;
		gasu=money/10;
		System.out.println("십원 권 개수: "+gasu);		
	}
}
