package ch4.ex2;

public class Ex1 {
	
	public int summarize(int n){
		//1.���� ���� ����
		int sum=0;
		
		//2.��� ����
		for(int i=1; i<=n;i++){
			if(i%2==1)
				sum+=i;
		}
		
		//3.����� ��� �Ǵ� ����
		return sum;
	}

	public static void main(String[] args) {
		int num1=100;
		int num2=1000;
		int value=0;
		
		Ex1 ex=new Ex1();
		value=ex.summarize(num1);
		System.out.println("1�� "+num1+" ������ Ȧ�������� "+value);
		value=ex.summarize(num2);
		System.out.println("1�� "+num2+" ������ Ȧ�������� "+value);
	}
}
