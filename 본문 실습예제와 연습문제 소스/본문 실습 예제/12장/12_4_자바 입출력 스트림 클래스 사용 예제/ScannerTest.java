package ch12.ex1;

import java.util.Scanner;

public class ScannerTest {
	 public static void main(String[] args) { 

		 int score=0;
		 String str=null;
		 System.out.println("exit: Ctrl+Z"); 
		 System.out.println("���ڿ��� �Է��ϼ���");
       //Ű����� ���ڸ� �Է¹޴´�.
		 try{
			 while(true){
		         Scanner scanner= new Scanner(System.in);          	
		         //score=scanner.nextInt();
		         //str=scanner.next();		      
		         str=scanner.nextLine();
		         System.out.println(str);
		         //System.out.println(score);
			 }
		 }catch(Exception e){
			 e.printStackTrace();
		 }
     }  
}
