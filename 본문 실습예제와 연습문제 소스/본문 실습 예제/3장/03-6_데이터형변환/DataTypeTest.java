package ch3.ex1;

public class DataTypeTest {

	public static void main(String[] args) {
		byte b=100;      //-128~127
		short s=120;     //-32768~32767
		int num=250000;  //-2147483648 ~2147483647
		
		System.out.println("b의 값은 "+b);
		System.out.println("s의 값은 "+s);
		System.out.println("num의 값은 "+num);
		
		b=(byte)(100+100);
		//s=400000;
		s=(short)(32767+2);
		//num=2147483648;
		num=2147483647+1;
		
		System.out.println();
		System.out.println("b의 값은 "+b);
		System.out.println("s의 값은 "+s);
		System.out.println("num의 값은 "+num);
		

	}

}
