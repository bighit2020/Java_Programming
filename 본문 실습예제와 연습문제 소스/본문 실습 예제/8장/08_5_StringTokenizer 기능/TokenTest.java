package ch8.ex4;

import java.util.StringTokenizer;

public class TokenTest{
	public static void main(String [ ] args){
		String date = "2014/05/02";
		StringTokenizer st = new StringTokenizer(date, "/");

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

		String date2 = "사과 바나나 수박 참외";
		StringTokenizer st2 = new StringTokenizer( date2);

		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
	}
}

