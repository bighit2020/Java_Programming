package ch4;

public class Ex3 {
	public static void main(String[] args) {
		//1.���� ���� ����
		int num=100;
		int sum=0;
		int count=0;
		
		//2.��� ����
		while(count<=100){
			if(count%2==1){
				sum+=count;
			}
			count++;
		}
		
		System.out.println("1�� "+num+"������  Ȧ������ ����"+sum);
	}
}
