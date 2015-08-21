package ch3;

public class Ex5 {
	public static void main(String[] args) {
		int num=100;
		char ch='a';
		boolean bool=false;
		
		bool=(num > ch) ||((char)(num-ch) >0);
		System.out.println(bool);
		
		bool=(num > ch) &&(((char)num-ch) >0);
		System.out.println(bool);
		
		bool=(num > ch)^(((char)num-ch) >0);
		System.out.println(bool);
	}
}
