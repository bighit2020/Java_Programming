package ch12.ex3;
import java.io.*;

public class ReadFile {
	public static void main(String args[]) {
		File file = new File("write.txt"); 
		try {
			//node�迭 FileReader�� ���Ͽ��� char �����͸� �о������, �ٽ� BufferedReader�� �����Ѵ�.
			BufferedReader in = new BufferedReader(new FileReader(file)); 

			String s;
			s = in.readLine();//���ۿ� ���๮�ڰ� �ԷµǴ����� Ȯ���� ��, ���๮�ھտ� �Էµ� ���ڿ��� ���ۿ��� ����Ѵ�.
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
