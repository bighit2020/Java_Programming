package ch5.ex2;

//�ڿ����� ������ ���� ���ϴ� ����� �ϴ� Ŭ����
public class MyUtil {
	//�� �ڿ��� ������ �ڿ������� ���� ���ϴ� �޼ҵ�
	public void summarize(int num1){
		int sum=0;
		for(int i=0; i<=num1;i++){
			sum+=i;
		}
		
		System.out.println("1����  "+num1 +"���̿� �ִ� �ڿ������� ���� "+sum);
	}
	
	//�� �� ������ 5�� ����� ������ �ڿ����� ���� ���ϴ� �޼ҵ�
	public void summarize(int num1,int num2){
		int sum=0;
		for(int i=num1; i<=num2;i++){
			if(i%5!=0)
				sum+=i;
		}
		
		System.out.println(num1+"��"+num2+ "���̿� 5�� ����� ������ �ڿ������� ���� "+sum);
	}
}
