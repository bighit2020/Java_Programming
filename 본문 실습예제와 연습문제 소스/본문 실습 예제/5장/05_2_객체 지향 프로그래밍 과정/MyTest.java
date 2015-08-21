package ch5.ex2;

public class MyTest {
	public static void main(String[] args){
		int min=1;
		int max=100;
		
		//메소드를 사용하기 위해서 인스턴스 생성
		MyUtil my=new MyUtil();
		
		my.summarize(min, max);
		my.summarize(min, max);
	}
}
