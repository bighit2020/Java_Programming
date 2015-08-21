package ch12.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardTest{
	public static void main(String [] args){

		String  mesg= null;
		//키보드로 입력받은 데이터를 문자로 변환한다.		
		InputStreamReader ir = new InputStreamReader(System.in); 
		BufferedReader in = new BufferedReader(ir); 
		
		System.out.println("exit: Ctrl+Z");  
		//IO 작업은 항상 예외처리를 해주어야 한다.
		try{
			//개행문자가 입력될 때까지 버퍼에 데이터를 입력한다.
			mesg = in.readLine(); 			
			while ( mesg != null ){ 
				System.out.println("읽기 :" + mesg);
				mesg = in.readLine();
			}
			in.close();
			ir.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}
}

