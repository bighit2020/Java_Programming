package ch4;

public class Ex4 {
	public static void main(String[] args) {
		//1���� ���� ����
		int num=100;
		int sum=0;
		
		//2.��� ����
		for(int i=1;i<=num;i++){
			if(i%2==1){
				sum+=i;
			}else{
				sum-=i;
			}
		}
		//3.��� ���
		System.out.println("1���� "+num+"������ �ڿ����� ���� "+sum);
	}
}
