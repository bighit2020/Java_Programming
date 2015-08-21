package ch13.ex2a;

import java.net.*;
import java.io.*;

public class SimpleServer {
  public static void main(String args[]) {
    ServerSocket s = null;

    try {
      s = new ServerSocket(5432);
 
 System.out.println( " 서버 실행중......." );
 
	while (true) {
		//클라이언트가 접속하면 새로운 소켓을 생성한다.
        Socket s1 = s.accept();

        OutputStream  out = s1.getOutputStream(); //네크워크 통신은 자바의 Stream을 이용한다.
        ObjectOutputStream dos = new ObjectOutputStream(out);

        dos.writeObject("접속을 환영합니다.!");

		dos.close();
        s1.close();
		}
      } catch (IOException e) {
		  e.printStackTrace();
      }
    }
  }



