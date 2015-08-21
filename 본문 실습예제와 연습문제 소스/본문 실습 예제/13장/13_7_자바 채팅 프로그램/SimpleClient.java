package ch13.ex3;

import java.net.*;
import java.io.*;
public class SimpleClient
 {
	  public static void main(String args[])throws IOException
	 { 
		if(args.length==0)
	  {
				System.out.println("사용법 : java SimpleClient [server_name]");
				System.out.println("server_name을 입력하지 않으셔서 localhost로 접속을 시도합니다.");
				args =new String[] {"127.0.0.1"};
		}
		try{
			Socket s1 = new Socket(args[0], 5434);  //소켓 객체를 생성한다.
	
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  //키보드로 문자열을 입력 받는다.

			ObjectOutputStream oos = new ObjectOutputStream( s1.getOutputStream() );  //네트워크로 입,출력을 위해서 객체 입출력 스트림을 생성한다.
			ObjectInputStream  ois = new ObjectInputStream( s1.getInputStream() );
	
				System.out.println("접속완료..");	
	
				System.out.println((String)ois.readObject());   //서버에서 받은 문자열을 출력한다.
		
				System.out.println("서버에게 먼저 메시지를 보내십시요 !!");
	
				while(true){
		
						System.out.print("<Client> :");
						String temp = in.readLine(); 
				if(temp.equals("exit")){
						System.out.println("bye~");
						break;
				}
				oos.writeObject("<Client> :"+temp);   //서버로 입력한 문자열을 보낸다.
				
			      System.out.println((String)ois.readObject());
			}
		    ois.close();
		    s1.close();
		}catch(ClassNotFoundException eof){
			System.out.println("Server로 부터 연결이 끊어졌습니다. 종료합니다...");
			System.exit(0);
		}catch(IOException io){
			io.printStackTrace();
		}
	}
}
