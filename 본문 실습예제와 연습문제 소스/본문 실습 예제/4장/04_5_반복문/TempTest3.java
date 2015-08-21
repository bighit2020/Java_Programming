package ch4.ex2;

public class TempTest3 {
	public static void main(String[] args) {
		int BASE=32;
		float celsius =0f;
		
		for(int fahrenheit=0 ;fahrenheit<=100;fahrenheit+=10){
			celsius=(fahrenheit-BASE)*5.0f/9.0f;
			System.out.println("È­¾¾:"+fahrenheit+"µµ, \t¼·¾¾:"+celsius+"µµ");
		}
	}
}
