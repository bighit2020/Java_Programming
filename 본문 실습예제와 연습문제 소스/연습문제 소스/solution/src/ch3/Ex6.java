package ch3;

public class Ex6 {
	public static void main(String[] args) {
		int money=167730;
		
		int gasu=0;
		
		gasu=money/50000;
		System.out.println("5���� �� ����: "+gasu);
		money=money%50000;
		gasu=money/10000;
		System.out.println("1���� �� ����: "+gasu);
		
		money=money%10000;
		gasu=money/5000;
		System.out.println("5õ�� �� ����: "+gasu);
		
		money=money%5000;
		gasu=money/1000;
		System.out.println("1õ�� �� ����: "+gasu);		
		
		money=money%1000;
		gasu=money/500;
		System.out.println("5��� �� ����: "+gasu);
		
		money=money%500;
		gasu=money/100;
		System.out.println("1��� �� ����: "+gasu);
		
		money=money%100;
		gasu=money/50;
		System.out.println("5�ʿ� �� ����: "+gasu);
		
		money=money%50;
		gasu=money/10;
		System.out.println("�ʿ� �� ����: "+gasu);		
	}
}
