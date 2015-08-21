package ch8.ex4;

//문자열 비교 예제
public class StringTest3 {
	public static void main(String [] args){
		String str1="hello";
		String str2="apple";
		
		
		//str1이 "victory" 보다 철자가 빠른 경우
		if(str1.compareTo("victory")<0)
			System.out.println(str1 + "," + "victory");
		else 
			System.out.println("victory" +","+str1);
		
		if(str1.compareTo(str2)<0)
			System.out.println(str1 + "," + str2);
		else 
			System.out.println(str2 +","+str1);

	}
}

