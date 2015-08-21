package ch5.ex4;

public class MyTest {
	public static void main(String[] args){
		int a=10;
		int b=100;
		
		//메소드를 사용하기 위해서 인스턴스 생성
		MyUtil my=new MyUtil();
		
		my.summarize(a);
		//my.summarize2(a, b);
		my.summarize(a, b);
	}
}
