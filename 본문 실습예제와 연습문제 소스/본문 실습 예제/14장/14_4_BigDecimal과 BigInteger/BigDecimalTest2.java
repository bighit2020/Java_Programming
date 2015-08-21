package ch14.ex3;

import java.math.BigDecimal;

public class BigDecimalTest2 {
	public static void main(String[] args) {
		System.out.println(3.00-2.10);
		BigDecimal d1 = new BigDecimal("3.00");
		BigDecimal d2 = new BigDecimal("2.10");
		
		/*
		'+':add()
		'-':subtract()
		'/': divide()
		'*':multiply
		 */
		
		BigDecimal result = d1.subtract(d2);
		double d = result.doubleValue();
		System.out.println(result +" :"+d);
		
		/*
		 divide 메소드 인자 역할
		첫번째 인수 : 나눌수
		2번째 인수는 scale : 소수점이하 몇 자리까지 
		3번째는 소수점 이하 처리 방식
		 */
		
		//소수점자리 3자리까지 반올림처리
		result = d1.divide(d2,3,BigDecimal.ROUND_CEILING);
		System.out.println("나눈결과 : "+result);
	}
}

