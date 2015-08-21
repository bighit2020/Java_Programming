package ch12.ex3;
import java.io.*;

public class ReadFile {
	public static void main(String args[]) {
		File file = new File("write.txt"); 
		try {
			//node계열 FileReader가 파일에서 char 데이터를 읽어들인후, 다시 BufferedReader로 전달한다.
			BufferedReader in = new BufferedReader(new FileReader(file)); 

			String s;
			s = in.readLine();//버퍼에 개행문자가 입력되는지를 확인한 후, 개행문자앞에 입력된 문자열을 버퍼에서 출력한다.
			while (  s != null) {
				System.out.println("read: " + s);
				s = in.readLine();
			}
			in.close();
			
		} catch(FileNotFoundException e1) {
			System.out.println("File not found");
		} catch(Exception e) {
			e.printStackTrace();
		}	
	} 
} 
