package ch14.ex4;


public class MySingleton {
 
  private static MySingleton mySingleton = null;
  
  private MySingleton() 
  {
   System.out.println("MySingleton  인스턴스 생성 ");
  }
  
  public static MySingleton getInstance()
  { 
      if(mySingleton == null)		{
		        	 mySingleton  = new MySingleton();
	  }
      return mySingleton;
  } 
  
}
