package ch4.ex2;

public class Ex5 {

	public void summarize(int n){
		//1.���� ���� ����
		int sum=0;
		
		//2.��� ����
		for(int i=1; i<=n;i++){
			if(i%5!=0)
				sum+=i;
		}
		
		//3.����� ��¶Ǵ� ����
		System.out.println("1���� "+n+"������ 5�� ����� ������ �ڿ����� ����"+sum);
	}
	
	public static void main(String[] args) {
		int num1=100;
		int num2=2000;
		
		Ex5 ex=new Ex5();
		ex.summarize(num1);
		ex.summarize(num2);
	}
}
