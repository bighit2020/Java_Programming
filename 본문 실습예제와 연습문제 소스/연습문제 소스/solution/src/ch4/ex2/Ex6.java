package ch4.ex2;

public class Ex6 {

	public void convert(char ch){
		//1.���� ���� ����
		int weight=32;
		int large=0;
		//2.��� ����
		large=(int)ch-weight;
		
		//3.����� ��¶Ǵ� ����
		System.out.println(ch+"-->"+(char)large);
	}
	public static void main(String[] args) {
		char ch1='h';
		char ch2='e';
		char ch3='l';
		char ch4='l';
		char ch5='o';
		
		Ex6 ex=new Ex6();
		ex.convert(ch1);
		ex.convert(ch2);
		ex.convert(ch3);
		ex.convert(ch4);
		ex.convert(ch5);
	}
}
