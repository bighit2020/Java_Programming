package ch11.ex2;

public class FlagTest {

	public static void main ( String [ ] args ){
		 White white = new White( );
		 Blue blue = new Blue( );
		 white.start(); //쓰레드는 start메소드를 호출해서 시작한다.
		 blue.start();
	}
}

