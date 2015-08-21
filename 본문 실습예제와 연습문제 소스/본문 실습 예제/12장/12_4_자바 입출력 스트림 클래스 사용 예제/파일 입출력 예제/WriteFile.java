package ch12.ex3;

import java.io.*;

public class WriteFile {
	
	public static void main(String args[]) {
		File file = new File("write.txt");			
		try {
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file,true));	// true면 기존 파일의 내용에 추가한다.
			 
			String s;
			System.out.println( "Exit : Ctrl + Z" );
			while ( (s = in.readLine()) != null) {
				out.println(s); // 파일에 키보드로 입력한 문자열을 행단위로 출력한다.
				//out.print(s);
			}
			in.close();
			out.close();
			
		} catch (IOException e) {
			System.out.println("IOException");
		}		
	} 
}

