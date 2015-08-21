package ch12.ex4;

import java.io.*;
public class PrintWriterEx1{
	public static void main(String[] args){
		FileWriter fw =null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		try{
			fw = new FileWriter("printWriter1.txt");
			bw= new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);  //자동으로 플러시 기능 제공함
			pw.println("안녕하세요.");
			pw.println("반갑습니다.");
			pw.println("Hello World");
			pw.println(100);
			pw.println(new Integer(20000));

			fw.close();
			bw.close();
			pw.close();

		}catch(IOException ie){
			System.out.println("IOException 발생");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

