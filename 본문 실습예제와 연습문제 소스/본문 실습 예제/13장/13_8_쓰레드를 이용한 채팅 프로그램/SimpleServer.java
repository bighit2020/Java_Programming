package ch13.ex5;

import java.io.*;
import java.net.*;

public class SimpleServer{
	public static void main(String[] args){
		 BufferedReader br_out;
		 BufferedWriter bw;
		 PrintWriter pw=null;
		 OutputStream os;
		 ServerSocket serverSocket;
		 Socket s1=null;
		 String outMessage=null;
		try{
			serverSocket= new ServerSocket(5434);
			System.out.println("���� ���� ��...");
			s1= serverSocket.accept();
			os = s1.getOutputStream();
			
			//�޽��� ������ ���� �����带 ������ ����
			RecvThread rThread=new RecvThread(s1);
			rThread.start();
			
			br_out=new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(os));
			pw=new PrintWriter(bw,true); //�ڵ����� flush �Ѵ�.
			pw.println("server: ������ ȯ���մϴ�.");
			while(true){
				outMessage=br_out.readLine();
				if(outMessage.equals("exit"))
					break;
				pw.println("server: "+outMessage);
			}
			pw.close();
			s1.close();
			
			if(rThread.isAlive()){
				rThread.interrupt();
				rThread=null;
			}
		}catch(SocketException e){
			System.out.println("Ŭ���̾�Ʈ�� ���� ������ ���������ϴ�. �����մϴ�...");
			System.exit(0);
		}catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
	}
}

