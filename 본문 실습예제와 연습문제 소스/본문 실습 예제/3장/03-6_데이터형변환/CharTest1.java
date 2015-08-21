package ch3.ex2;

public class CharTest1 {
	public static void main(String[] args){
		char ch='a';
		int num=97;
		
		//char를 정수로 형변환한다.
		System.out.println("ch의 값:"+ch+", 아스키 코드:"+(int)ch);
		//정수를 char로 형변환 한다.
		System.out.println("num의 값:"+num+",문자:"+(char)num);
		
		//문자도 정수이므로 1을 더한 후 char로 형변환 해서 출력한다.
		System.out.println("ch+1의 값: "+(ch+1)+" ,문자:"+(char)(ch+1));
		System.out.println("num+1의 값: "+(num+1)+",문자:"+(char)(num+1));
	}

}
