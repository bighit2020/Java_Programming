package ch4;

public class Ex8 {
	public static void main(String[] args) {
		//1.���� ���� ����
		int num=100;
		int sum=0;
		
		//2.��� ����
		for(int i=1; i<=num;i++){
			if(i%5!=0)
				sum+=i;
		}
		
		//3.��� ���
		System.out.println("1���� 100������ 5�� ����� ������ �ڿ����� ����"+sum);
	}

}
