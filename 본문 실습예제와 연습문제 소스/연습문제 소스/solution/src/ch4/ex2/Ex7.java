package ch4.ex2;

public class Ex7 {
	public int summarize(int n){
		//1.���� ���� ����
		int sum=0;
		int temp=0;
		
		//2.��� ����
		while(n!=0){
			sum+=n%10;
			n/=10;
		}
		
		
		//3.����� ��¶Ǵ� ����
		return sum;
	}

	public static void main(String[] args) {
		int num1=5555;
		int num2=6666;
		int value=0;
		
		Ex7 ex=new Ex7();
		value=ex.summarize(num1);
		System.out.println(num1+"�ڸ����� ����"+value);
		
		value=ex.summarize(num2);
		System.out.println(num2+"�ڸ����� ����"+value);
	}
}
