package ch4.ex2;

public class Ex6 {

	public void convert(char ch){
		//1.지역 변수 선언
		int weight=32;
		int large=0;
		//2.기능 구현
		large=(int)ch-weight;
		
		//3.결과값 출력또는 리턴
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
