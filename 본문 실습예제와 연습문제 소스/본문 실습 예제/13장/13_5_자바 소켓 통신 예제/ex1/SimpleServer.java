package ch13.ex1;

import java.io.*;
import java.net.*;

public class SimpleServer{
	public static void main(String[] args){
		 InputStream is;
		 BufferedReader br;
		 
		 BufferedReader br1;
		 BufferedWriter bw;
		 PrintWriter pw=null;
		 OutputStream os;
		 ServerSocket serverSocket;
		 Socket s1=null;
		 String ipAddrs=null;
		 String inMessage=null;
		 String outMessage=null;
		try{
			serverSocket= new ServerSocket(5434);
			
			br1=new BufferedReader(new InputStreamReader(System.in));
			
			while(true){
				//Ŭ���̾�Ʈ�� ������ ���� �ÿ� accept()�޼ҵ带 ȣ���ؼ� ���� ��ü�� �����Ѵ�.
				s1= serverSocket.accept();
				System.out.println("������ �����ϼ̽��ϴ�.\n �������� �޽����� ���� ��������...");
				
				is=s1.getInputStream();
				os = s1.getOutputStream();
				
				br = new BufferedReader(new InputStreamReader(is));
				bw = new BufferedWriter(new OutputStreamWriter(os));
				pw=new PrintWriter(bw,true);
				inMessage=br.readLine();
				System.out.println(inMessage);
				
				outMessage=br1.readLine();
				if(outMessage.equals("exit"))
					break;
				System.out.println(outMessage);
				
				pw.println("server: "+outMessage);
				pw.close();
				//s1.close();
			}
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}

