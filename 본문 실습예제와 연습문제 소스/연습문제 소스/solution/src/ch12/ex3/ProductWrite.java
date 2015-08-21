package ch12.ex3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ProductWrite {
	public static void main(String[] args){
		int count=1; //몇 번 입력했는지를 카운트하는 변수
		String prodData="";
		
		String prodCode = null;
		String prodName=null;
		String prodColor=null;
		String 	prodQty=null;
		String  prodPrice=null;
		
		
		File file = new File("ProdData.txt");				
		
		try {
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file,false));	// true면 추가하기	
			 						
			do{
				 System.out.println(count + " 번째 제품 정보를 입력하세요" );
				 System.out.print("제품코드");
				prodCode = in.readLine();
				
				System.out.print("제품이름");
				prodName=in.readLine();
				
				System.out.print("제품 색상");
				prodColor=in.readLine();
				
				System.out.print("제품 수량");
				prodQty=in.readLine();
				
				System.out.print("제품가격");
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
		
		System.out.println("제품 정보를 파일로 출력했습니다.");
	}
}
