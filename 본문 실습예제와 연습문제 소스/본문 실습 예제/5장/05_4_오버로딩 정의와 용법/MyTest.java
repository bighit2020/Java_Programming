package ch5.ex4;

public class MyTest {
	public static void main(String[] args){
		int a=10;
		int b=100;
		
		//�޼ҵ带 ����ϱ� ���ؼ� �ν��Ͻ� ����
		MyUtil my=new MyUtil();
		
		my.summarize(a);
		//my.summarize2(a, b);
		my.summarize(a, b);
	}
}
