package ch12.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardTest{
	public static void main(String [] args){

		String  mesg= null;
		//Ű����� �Է¹��� �����͸� ���ڷ� ��ȯ�Ѵ�.		
		InputStreamReader ir = new InputStreamReader(System.in); 
		BufferedReader in = new BufferedReader(ir); 
		
		System.out.println("exit: Ctrl+Z");  
		//IO �۾��� �׻� ����ó���� ���־�� �Ѵ�.
		try{
			//���๮�ڰ� �Էµ� ������ ���ۿ� �����͸� �Է��Ѵ�.
			mesg = in.readLine(); 			
			while ( mesg != null ){ 
				System.out.println("�б� :" + mesg);
				mesg = in.readLine();
			}
			in.close();
			ir.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}
}

