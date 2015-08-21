package ch13.ex2a;

import java.net.*;
import java.io.*;

public class SerServer {
  public static void main(String args[]) {
    ServerSocket s = null;

    try {
      s = new ServerSocket(5433);
    } catch (IOException e){}

    while (true) {
      try {

		System.out.println("서버 실행 중!!!!");
		Socket s1 = s.accept();

        OutputStream  out = s1.getOutputStream();
        ObjectOutputStream dos = new ObjectOutputStream(out);
		Employee p = new Employee("박지성" , "서울시 강남구" , "111111-2222222" , "123-1234" );
        dos.writeObject(p);

        dos.close();
        s1.close();
      } catch (IOException e) {  
    	  e.printStackTrace();
      }
    }
  }
}


