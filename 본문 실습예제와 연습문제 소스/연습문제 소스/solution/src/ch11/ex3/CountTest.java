package ch11.ex3;


public class CountTest {
	public static void main(String[] args) {
		Area area;
		area=new Area();
		
		Thread first = new CountThread("first",area);
		Thread second = new CountThread("second",area);
		Thread third = new CountThread("third",area);
		
		try{
			first.start();
			Thread.sleep(100);
			second.start();
			Thread.sleep(100);
			third.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
