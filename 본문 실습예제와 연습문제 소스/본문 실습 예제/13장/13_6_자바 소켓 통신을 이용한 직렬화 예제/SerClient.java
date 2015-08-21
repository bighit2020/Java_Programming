package ch13.ex2a;

import java.net.*;
import java.io.*;

public class SerClient {
  public static void main(String args[]) {
    try {
      Socket s1 = new Socket("127.0.0.1", 5433);  

      InputStream is = s1.getInputStream();
      ObjectInputStream dis = new ObjectInputStream(is);

	 Employee p = (Employee)dis.readObject();
	 System.out.println( "이름: "+ p.getName() );
	  System.out.println( "주소: "+ p.getAddr() );
	   System.out.println( "주민번호: "+ p.getJumin() );
	    System.out.println( "전화번호: "+ p.getPhone() );

      dis.close();
      s1.close();
    } catch (ConnectException connExc) {
      System.err.println("연결실패.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
