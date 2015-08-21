package ch12.ex3;

import java.io.*;

public class TestFile {
	public static void main(String[] args)	{

		File file=new File("." , "TestFile.java");//���丮, �����̸�
		System.out.println("������ ��δ�? " + file.getPath());
		System.out.println("������ �̸���? " +file.getName());
		System.out.println("������ �������丮��? " +file.getParent());
		System.out.println("������ �����δ�? " +file.getAbsolutePath());
		System.out.println("������ �����γ� ? " +file.isAbsolute());
		System.out.println("������ �����ϳ�? " +file.exists());
		System.out.println("�����̳�? " +file.isFile());
		System.out.println("���丮�̳�? " +file.isDirectory());
		System.out.println("������ ������ �ֳ�? " +file.canRead());
		System.out.println("������ �����ֳ�? " +file.canWrite());
		System.out.println("������ ����Ʈũ���? " +file.length());		
		
		//��� �ü���� ȣȯ���� ���ؼ� ��� �����ڸ� ����Ѵ�.
		boolean b = new File("."+File.separator+"hello").mkdir(); 
		//boolean b = new File("./hello").mkdir();  //������  ���� ��� ǥ����										
		//boolean b = new File(".\\hello").mkdir();   //������ ���� ��� ǥ����
		
		String[] listing =new File(".").list();				
		System.out.println( "���� ���丮 ������?" );
		for(int i=0;i<listing.length;++i){
			System.out.println(listing[i]);
		}//for
	
	}//main
}//class

