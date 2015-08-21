package ch11.ex5a;


public class  JoinTest1
{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName () + " start");
		Runnable r = new MyThread();
		Thread myThread = new Thread(r);

		myThread.start();
		try{
			myThread.join(); //실행 중인 쓰레드를 중지 시킨다.
		}catch(InterruptedException ie){
			ie.printStackTrace();	
		}

		System.out.println(Thread.currentThread().getName() + " end");
	}
}

