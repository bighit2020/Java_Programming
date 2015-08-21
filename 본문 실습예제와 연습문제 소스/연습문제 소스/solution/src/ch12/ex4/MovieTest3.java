package ch12.ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//���ڿ� �ӿ� ���ڿ� �˻��ϴ� ����
public class MovieTest3 {
	public static void getMovieInfo(String movie){
		File file = new File("movieInfo.txt");
		boolean isExist=false;
		isExist=movie.matches(".*�׼�.*");
		//isExist=movie.matches("(?i).*�׼�.*");//��ҹ��� ���о��� ���ڿ� �ӿ� ���ڿ� �˻�
		
		
		if(isExist==true){
			try {
				System.out.println(movie);
				PrintWriter out = new PrintWriter(new FileWriter(file,true));		
					out.println(movie); 
				out.close();
			} catch (IOException e) {
				System.out.println("IOException");
			}
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
				getMovieInfo(s);
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
