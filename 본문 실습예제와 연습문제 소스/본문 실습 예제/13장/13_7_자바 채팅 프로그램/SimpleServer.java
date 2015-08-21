package ch13.ex3;

import java.net.*;
import java.io.*;

public class SimpleServer{
	  public static void main(String args[]){
		try{
			System.out.println("서비스하기위해 준비중입니다.");
			ServerSocket s= new ServerSocket(5434);
			System.out.println("서버가 동작중입니다.");

			Socket s1 = s.accept();  //클라이언트의 접속을 허락한다.
					
			BufferedReader in = new BufferedReader(	new InputStreamReader(System.in));  //키보드로 문자열을 입력한다.
		
				 ObjectInputStream ois = new ObjectInputStream( s1.getInputStream() );  //객체입출력 스트림을 생성한다.
				 ObjectOutputStream oos = new ObjectOutputStream( s1.getOutputStream() );

		
	       oos.writeObject("Simple server에 접속하신걸 환영합니다.!!");
			while(true){
				
					System.out.println((String)ois.readObject());	//클라이언트에서 전송된 데이터를 출력한다.
					
					System.out.print("<Server> :");
					String temp = in.readLine();
				if(temp.equals("exit")){
					System.out.println("bye");
					break;
				}
				oos.writeObject("<Server> :"+temp);  //입력한 문자열을 클라이언트로 전송한다.
			}
	        oos.close();
	        s1.close();
		}catch(ClassNotFoundException eof){
			System.out.println("Client로 부터 연결이 끊어졌습니다. 종료합니다...");
			System.exit(0);
		}catch(IOException io){
			io.printStackTrace();
		}
	  }
}
