package ch5.ex4;

//�ڿ����� ������ ���� ���ϴ� ����� �ϴ� Ŭ����
public class MyUtil {
	//1���� ������ �ڿ��� ������ �ڿ����� ���� ���Ѵ� �޼ҵ�
	public void summarize(int num1){
		int sum=0;
		for(int i=1; i<=num1;i++){
			sum+=i;
		}
		
		System.out.println("1��"+num1+ "���̿� �ִ� �ڿ������� ���� "+sum);
	}
	
	//�� �ڿ��� ������ �ڿ������� ���� ���ϴ� �޼ҵ�
	//public void summarize2(int num1,int num2){
	public void summarize(int num1,int num2){
		int sum=0;
		for(int i=num1; i<=num2;i++){
				sum+=i;
		}
		
		System.out.println(num1+"��"+num2+ "������  �ڿ������� ���� "+sum);
	}
}
