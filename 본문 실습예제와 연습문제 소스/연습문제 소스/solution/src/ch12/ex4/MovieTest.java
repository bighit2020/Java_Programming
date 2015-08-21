package ch12.ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MovieTest {
	public static void main(String args[]) {
		File file = new File("movie.txt"); 
		try {
			//node�迭 FileReader�� ���Ͽ��� char �����͸� �о������, �ٽ� BufferedReader�� �����Ѵ�.
			BufferedReader in = new BufferedReader(new FileReader(file)); 

			String s;
			s = in.readLine();//���ۿ� ���๮�ڰ� �ԷµǴ����� Ȯ���� ��, ���๮�ھտ� �Էµ� ���ڿ��� ���ۿ��� ����Ѵ�.
			while (  s != null) {
				System.out.println(s);
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
