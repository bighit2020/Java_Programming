package ch13.ex5;

import java.io.*;
import java.net.*;

public class RecvThread  extends Thread{
	 InputStream is;
	 BufferedReader br_in;
	 ServerSocket serverSocket;
	 Socket socket=null;
	 String inMessage=null;
	
	public RecvThread(Socket s){
		this.socket=s;
	}
	
	public  void run(){
		try{
			is=socket.getInputStream();
			br_in = new BufferedReader(new InputStreamReader(is));
			while(true){
				inMessage=br_in.readLine();
				System.out.println(inMessage);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
			

	
}
