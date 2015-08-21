package ch3.ex3;

public class TempTest {
	public static void main(String[] args) {
		int BASE=32;
		float celsius=0f,fahrenheit=0f;
		
		fahrenheit=100;
		//È­¾¾ ¿Âµµ¸¦ ¼·¾¾ ¿Âµµ·Î º¯È¯ÇÑ´Ù.
		celsius=(fahrenheit-BASE)*5.0f/9.0f;
		
		System.out.println("È­¾¾ "+fahrenheit+"µµ¿¡ ´ëÇÑ ¼·¾¾´Â "+celsius+"µµÀÔ´Ï´Ù.");
		
		//¼·¾¾ ¿Âµµ¸¦ È­¾¾ ¿Âµµ·Î º¯È¯ÇÑ´Ù.
		fahrenheit=celsius*9.0f/5.0f +BASE;
		System.out.println("¼·¾¾ "+celsius+"µµ¿¡ ´ëÇÑ È­¾¾´Â "+fahrenheit+"µµÀÔ´Ï´Ù.");
		
		
	}

}
