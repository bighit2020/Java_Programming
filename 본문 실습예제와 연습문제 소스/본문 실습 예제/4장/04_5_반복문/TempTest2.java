package ch4.ex2;

public class TempTest2 {
	public static void main(String[] args) {
		int BASE=32;
		int fahrenheit=0;
		float celsius =0f;
		
		do{
			celsius=(fahrenheit-BASE)*5.0f/9.0f;
			System.out.println("ȭ��:"+fahrenheit+"��, \t����:"+celsius+"��");
			fahrenheit+=10;
		}while(fahrenheit<=100);
	}
}
