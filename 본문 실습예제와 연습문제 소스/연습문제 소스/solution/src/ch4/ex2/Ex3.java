package ch4.ex2;

public class Ex3 {

	public void gugudan(int dan){
		//1.�������� ����
		
		//2.��� ����
		System.out.println(dan+"���\n");
		for(int i=1; i<=9;i++){
			System.out.print(dan+"*"+i+"="+i*dan+"\t\n");
		}
		
		
		//3.����� ��� �Ǵ� ����
	}
	public static void main(String[] args) {
		int num1=5;
		int num2=8;
		
		Ex3 ex=new Ex3();
		
		ex.gugudan(num1);
		ex.gugudan(num2);

	}

}
