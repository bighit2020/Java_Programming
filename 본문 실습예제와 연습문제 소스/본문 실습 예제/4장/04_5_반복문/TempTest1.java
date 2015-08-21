package ch4.ex2;

public class TempTest1 {
	public static void main(String[] args) {
		int BASE=32;
		int fahrenheit=0;
		float celsius =0f;
		
		while(fahrenheit<=100){
			celsius=(fahrenheit-BASE)*5.0f/9.0f;
			System.out.println("È­¾¾:"+fahrenheit+"µµ, \t¼·¾¾:"+celsius+"µµ");
			fahrenheit+=10;
		}
	}
}
