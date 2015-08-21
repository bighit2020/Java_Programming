package ch12.ex3;

import java.io.*;

public class FileReaderTest
{
	public static void main(String [] args){
		File file = new File("write.txt");
		FileReader fr = null;

		try{
			fr = new FileReader(file);	 //파일의 데이터를 읽어들여서 바로 출력한다.
			int readChar;
			while((readChar =fr.read()) != -1){  
				System.out.println((char) readChar);
			}


		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				if(fr != null) fr.close();
			}catch(IOException ie){
				ie.printStackTrace();
			}
		}
	}
}
