package ch11.ex4;


public class ThreadTest {
	public static void main(String[] args) {
		Thread first = new UserThread("first");
		Thread second = new UserThread("second");
		Thread third = new UserThread("third");
		
		first.start();
		second.start();
		third.start();
		
	}

}
