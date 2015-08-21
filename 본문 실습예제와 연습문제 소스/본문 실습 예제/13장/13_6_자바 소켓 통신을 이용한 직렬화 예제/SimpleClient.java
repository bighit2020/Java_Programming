package ch13.ex2a;

import java.net.*;
import java.io.*;

public class SimpleClient {
  public static void main(String args[]) {
    try {
      Socket s1 = new Socket("localhost", 5432);  

      InputStream is = s1.getInputStream();
     ObjectInputStream dis = new ObjectInputStream(is);

      System.out.println(dis.readObject());

      dis.close();
      s1.close();
    } catch (ConnectException connExc) {
		  connExc.printStackTrace();
    } catch (Exception e) {
		  e.printStackTrace();
    }
  }
}

