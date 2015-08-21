package ch14.ex4;

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println(" 첫번째 getInstance() 호출");
		MySingleton a =  MySingleton.getInstance();
		//MySingleton a=new MySingleton();
		System.out.println(" 두번째 getInstance() 호출");
		MySingleton b =  MySingleton.getInstance();
		  
		  if(a == b)		  {
		   System.out.println(" 두 싱글톤은 동일한 객체입니다. ");
		  }

	}

}
