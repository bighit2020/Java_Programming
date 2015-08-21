package ch12.ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//��ȭ���� �����ϱ�
public class MovieTest2 {
	public static void getMovieName(String movie){
		File file = new File("movieName.txt");
		int beginIdx=0;
		int endIdx=0;
		String title=null;
		beginIdx=movie.indexOf("��ȭ����")+5;
		endIdx=movie.indexOf("��ȭ�з�");
		
		title=movie.substring(beginIdx,endIdx).trim();
//		System.out.println(beginIdx);
//		System.out.println(endIdx);
		System.out.println(title);
		
		//��ȭ������ �����ؼ� ���Ϸ� ����Ѵ�.			
		try {
			PrintWriter out = new PrintWriter(new FileWriter(file,true));		
				out.println(title); 
			out.close();
		} catch (IOException e) {
			System.out.println("IOException");
		}				
		
	}
	
	public static void main(String args[]) {
		File file = new File("movie.txt"); 
		try {
			//node�迭 FileReader�� ���Ͽ��� char �����͸� �о������, �ٽ� BufferedReader�� �����Ѵ�.
			BufferedReader in = new BufferedReader(new FileReader(file)); 

			String s;
			s = in.readLine();//���ۿ� ���๮�ڰ� �ԷµǴ����� Ȯ���� ��, ���๮�ھտ� �Էµ� ���ڿ��� ���ۿ��� ����Ѵ�.
			while (  s != null) {
		//		System.out.println(s);
				getMovieName(s);
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
