
package ch12.ex2;

import java.io.File;
public class FileTest {
	public static void main(String[] args)	{

		File file=new File("." , "FileTest.java");//디렉토리, 파일이름
		System.out.println("파일의 경로는? " + file.getPath());
		System.out.println("파일의 이름는? " +file.getName());
		System.out.println("파일의 상위디렉토리는? " +file.getParent());
		System.out.println("파일의 절대경로는? " +file.getAbsolutePath());
		System.out.println("파일이 절대경로냐 ? " +file.isAbsolute());
		System.out.println("파일이 존재하냐? " +file.exists());
		System.out.println("파일이냐? " +file.isFile());
		System.out.println("디렉토리이냐? " +file.isDirectory());
		System.out.println("파일을 읽을수 있냐? " +file.canRead());
		System.out.println("파일을 쓸수있냐? " +file.canWrite());
		System.out.println("파일의 바이트크기는? " +file.length());		
		
		//모든 운영체제의 호환성을 위해서 경로 구분자를 사용한다.
		boolean b = new File("."+File.separator+"hello").mkdir(); 
		//boolean b = new File("./hello").mkdir();  //리눅스  파일 경로 표현법										
		//boolean b = new File(".\\hello").mkdir();   //윈도우 파일 경로 표현법
		
		String[] listing =new File(".").list();				
		System.out.println( "현재 디렉토리 내용은?" );
		for(int i=0;i<listing.length;++i){
			System.out.println(listing[i]);
		}//for
	
	}//main
}//class

