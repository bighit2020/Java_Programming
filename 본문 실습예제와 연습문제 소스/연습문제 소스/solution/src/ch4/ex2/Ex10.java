package ch4.ex2;

public class Ex10 {

	public void summarize(int n){
		//1.���� ���� ����
		int remainder=0;
		int temp=0;
		
		//2.��� ����
		for(int i=10; i<=n;i++){
			temp=i;
			while(true){
				remainder=temp%10;
				temp/=10;
				
				if(remainder!=temp%10){
					break;
				}else if(temp>=0 && temp<10){
					System.out.println(i);
				}
			}
		}
		
		//3. ����� ��¶Ǵ� ����
	}
	public static void main(String[] args) {
		int num1=100;
		int num2=1000;
		
		Ex10 ex=new Ex10();
		ex.summarize(num1);
		ex.summarize(num2);

	}

}
