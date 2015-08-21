package ch8.ex6;

public class StringFormatTest {
	public static void main(String[] args) {
		String sValue = " 이순신";
		int nValue = 543;
		long lValue = 543L;
		float fValue = 6.5E5f;
		double dValue = 7.654321E10d;

		//%s는 문자열 출력에 사용되는 기호이다.
		System.out.println(String.format("%s 입니다.", sValue));

		//%d는 정수형 출력에 사용되는 기호이다.
		//%다음에 숫자가 오면 그 숫자만큼의 자리수가 확보된다.
		//%0다음에 숫자가 오면 빈 공백이 0으로 채워진다.
		System.out.println(String.format("%d", nValue));
		System.out.println(String.format("%5d", nValue));
		System.out.println(String.format("%05d", nValue));


		System.out.println(String.format("%d", lValue));
		System.out.println(String.format("%5d", lValue));
		System.out.println(String.format("%05d", lValue));

		//%f는 실수형 출력에 사용되는 기호이다.
		//%f에서 사용되는 '0'은 소숫점자리수를 나타낸다. 
		//세번째 '%05.05f' 역시 소숫점자리수에만 적용된다.
		System.out.println(String.format("%f", fValue));
		System.out.println(String.format("%5.5f", fValue));
		System.out.println(String.format("%05.05f", fValue));

		System.out.println(String.format("%f", dValue));
		System.out.println(String.format("%5.5f", dValue));
		System.out.println(String.format("%05.05f", dValue));

	}
}
