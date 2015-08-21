package ch16.ex6;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class MovieModel {
	//����Ʈ�� ��ȭ������ �߰��ϴ� �޼ҵ�
	public void addTitle(String title,List movieList){
		movieList.add(title);
	}
	//����Ʈ�� �ִ� ��ȭ ������ �����ϴ� �޼ҵ�
	public void delTitle(String title,List movieList){
		movieList.remove(title); //����Ʈ���� ������ ��ȭ ������ �����Ѵ�.
	}
	
	//����Ʈ�� �ִ� ��ȭ������� ���Ͽ� �����ϴ� �޼ҵ�
	public void saveTitles(List movieList) throws Exception{
		File file=new File("moveTitle.txt");
		FileWriter fw=new FileWriter(file,true);
		PrintWriter pw=new PrintWriter(fw);
		String items[] = movieList.getItems(); //����Ʈ�� ����� �迭�� ������ �´�.
		
		for(int i=0; i<items.length;i++){
			pw.println(items[i]);
			System.out.println(items[i]);
		}
		fw.close();
		pw.close();
	}
}


