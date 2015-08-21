package ch12.ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//영화제목 추출하기
public class MovieTest2 {
	public static void getMovieName(String movie){
		File file = new File("movieName.txt");
		int beginIdx=0;
		int endIdx=0;
		String title=null;
		beginIdx=movie.indexOf("영화제목")+5;
		endIdx=movie.indexOf("영화분류");
		
		title=movie.substring(beginIdx,endIdx).trim();
//		System.out.println(beginIdx);
//		System.out.println(endIdx);
		System.out.println(title);
		
		//영화제목을 추출해서 파일로 출력한다.			
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
			//node계열 FileReader가 파일에서 char 데이터를 읽어들인후, 다시 BufferedReader로 전달한다.
			BufferedReader in = new BufferedReader(new FileReader(file)); 

			String s;
			s = in.readLine();//버퍼에 개행문자가 입력되는지를 확인한 후, 개행문자앞에 입력된 문자열을 버퍼에서 출력한다.
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
