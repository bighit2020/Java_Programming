package ch14.ex4;

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println(" ù��° getInstance() ȣ��");
		MySingleton a =  MySingleton.getInstance();
		//MySingleton a=new MySingleton();
		System.out.println(" �ι�° getInstance() ȣ��");
		MySingleton b =  MySingleton.getInstance();
		  
		  if(a == b)		  {
		   System.out.println(" �� �̱����� ������ ��ü�Դϴ�. ");
		  }

	}

}
