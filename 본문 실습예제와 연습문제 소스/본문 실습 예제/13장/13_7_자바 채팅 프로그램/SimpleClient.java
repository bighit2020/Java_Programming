package ch13.ex3;

import java.net.*;
import java.io.*;
public class SimpleClient
 {
	  public static void main(String args[])throws IOException
	 { 
		if(args.length==0)
	  {
				System.out.println("���� : java SimpleClient [server_name]");
				System.out.println("server_name�� �Է����� �����ż� localhost�� ������ �õ��մϴ�.");
				args =new String[] {"127.0.0.1"};
		}
		try{
			Socket s1 = new Socket(args[0], 5434);  //���� ��ü�� �����Ѵ�.
	
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  //Ű����� ���ڿ��� �Է� �޴´�.

			ObjectOutputStream oos = new ObjectOutputStream( s1.getOutputStream() );  //��Ʈ��ũ�� ��,����� ���ؼ� ��ü ����� ��Ʈ���� �����Ѵ�.
			ObjectInputStream  ois = new ObjectInputStream( s1.getInputStream() );
	
				System.out.println("���ӿϷ�..");	
	
				System.out.println((String)ois.readObject());   //�������� ���� ���ڿ��� ����Ѵ�.
		
				System.out.println("�������� ���� �޽����� �����ʽÿ� !!");
	
				while(true){
		
						System.out.print("<Client> :");
						String temp = in.readLine(); 
				if(temp.equals("exit")){
						System.out.println("bye~");
						break;
				}
				oos.writeObject("<Client> :"+temp);   //������ �Է��� ���ڿ��� ������.
				
			      System.out.println((String)ois.readObject());
			}
		    ois.close();
		    s1.close();
		}catch(ClassNotFoundException eof){
			System.out.println("Server�� ���� ������ ���������ϴ�. �����մϴ�...");
			System.exit(0);
		}catch(IOException io){
			io.printStackTrace();
		}
	}
}
