package ch13.ex2a;

import java.net.*;
import java.io.*;

public class SimpleServer {
  public static void main(String args[]) {
    ServerSocket s = null;

    try {
      s = new ServerSocket(5432);
 
 System.out.println( " ���� ������......." );
 
	while (true) {
		//Ŭ���̾�Ʈ�� �����ϸ� ���ο� ������ �����Ѵ�.
        Socket s1 = s.accept();

        OutputStream  out = s1.getOutputStream(); //��ũ��ũ ����� �ڹ��� Stream�� �̿��Ѵ�.
        ObjectOutputStream dos = new ObjectOutputStream(out);

        dos.writeObject("������ ȯ���մϴ�.!");

		dos.close();
        s1.close();
		}
      } catch (IOException e) {
		  e.printStackTrace();
      }
    }
  }



