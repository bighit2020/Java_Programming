package ch4.ex2;

public class Ex2 {

	public int summarzie(int n){
		//1.���� ���� ����
		int sum=0;
		
		//2.��� ����
		for(int i=1;i<=n;i++){
			if(i%2==1)
				sum+=i;
			else
				sum-=i;
		}
		
		//3.����� ��¶Ǵ� ����
		return sum;
	}
	
	public static void main(String[] args) {
		int num1=100;
		int num2=1000;
		int value=0;
		
		Ex2 ex=new Ex2();
		
		value=ex.summarzie(num1);
		System.out.println("1�� "+num1+" ������ ���� "+value);
		value=ex.summarzie(num2);
		System.out.println("1�� "+num2+" ���������� "+value);
		
	}

}
