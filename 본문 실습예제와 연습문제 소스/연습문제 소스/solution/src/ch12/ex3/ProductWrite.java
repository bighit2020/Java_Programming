package ch12.ex3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ProductWrite {
	public static void main(String[] args){
		int count=1; //�� �� �Է��ߴ����� ī��Ʈ�ϴ� ����
		String prodData="";
		
		String prodCode = null;
		String prodName=null;
		String prodColor=null;
		String 	prodQty=null;
		String  prodPrice=null;
		
		
		File file = new File("ProdData.txt");				
		
		try {
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file,false));	// true�� �߰��ϱ�	
			 						
			do{
				 System.out.println(count + " ��° ��ǰ ������ �Է��ϼ���" );
				 System.out.print("��ǰ�ڵ�");
				prodCode = in.readLine();
				
				System.out.print("��ǰ�̸�");
				prodName=in.readLine();
				
				System.out.print("��ǰ ����");
				prodColor=in.readLine();
				
				System.out.print("��ǰ ����");
				prodQty=in.readLine();
				
				System.out.print("��ǰ����");
				prodPrice=in.readLine();
				
				prodData=prodCode+","+prodName+","+prodColor+","+prodQty+","+prodPrice;
				out.println(prodData);  
				count++;
			}while ( count <= 3) ;
			
			
			in.close();
			out.close();
			
		} catch (IOException e) {
			System.out.println("IOException");
		}
		
		System.out.println("��ǰ ������ ���Ϸ� ����߽��ϴ�.");
	}
}
