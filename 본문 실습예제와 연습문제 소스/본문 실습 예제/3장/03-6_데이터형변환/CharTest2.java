package ch3.ex2;

public class CharTest2 {
	public static void main(String[] args) {
		char ch1='h'; //아스키 코드값:104
		char ch2='e';  //101
		char ch3='l';  //108
		char ch4='l';  //108
		char ch5='o';  //111
		
		//각 문자의 아스키 코드값을 더한 후 정수값을 출력한다.
		System.out.println(ch1+ch2+ch3+ch4+ch5);
		
		//문자를 출력한다.
		System.out.println((ch1)+""+(ch2)+""+ch3+""+ch4+""+ch5);
		//소문자에 32를 뺀 후 대문자로 변환해서 출력한다.
		System.out.println((char)(ch1-32)+""+
						   (char)(ch2-32)+""+
						   (char)(ch3-32)+""+
						   (char)(ch4-32)+""+
						   (char)(ch5-32));

	}

}
