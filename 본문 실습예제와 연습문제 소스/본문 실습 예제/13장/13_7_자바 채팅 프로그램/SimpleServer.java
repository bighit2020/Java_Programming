package ch13.ex3;

import java.net.*;
import java.io.*;

public class SimpleServer{
	  public static void main(String args[]){
		try{
			System.out.println("�����ϱ����� �غ����Դϴ�.");
			ServerSocket s= new ServerSocket(5434);
			System.out.println("������ �������Դϴ�.");

			Socket s1 = s.accept();  //Ŭ���̾�Ʈ�� ������ ����Ѵ�.
					
			BufferedReader in = new BufferedReader(	new InputStreamReader(System.in));  //Ű����� ���ڿ��� �Է��Ѵ�.
		
				 ObjectInputStream ois = new ObjectInputStream( s1.getInputStream() );  //��ü����� ��Ʈ���� �����Ѵ�.
				 ObjectOutputStream oos = new ObjectOutputStream( s1.getOutputStream() );

		
	       oos.writeObject("Simple server�� �����ϽŰ� ȯ���մϴ�.!!");
			while(true){
				
					System.out.println((String)ois.readObject());	//Ŭ���̾�Ʈ���� ���۵� �����͸� ����Ѵ�.
					
					System.out.print("<Server> :");
					String temp = in.readLine();
				if(temp.equals("exit")){
					System.out.println("bye");
					break;
				}
				oos.writeObject("<Server> :"+temp);  //�Է��� ���ڿ��� Ŭ���̾�Ʈ�� �����Ѵ�.
			}
	        oos.close();
	        s1.close();
		}catch(ClassNotFoundException eof){
			System.out.println("Client�� ���� ������ ���������ϴ�. �����մϴ�...");
			System.exit(0);
		}catch(IOException io){
			io.printStackTrace();
		}
	  }
}
