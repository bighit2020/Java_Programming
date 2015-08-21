package ch14.ex3;

import java.math.BigInteger;

public class BigIntegerTest1 {
	public static void main(String[] args) {
		System.out.println("최대 정수: "+Long.MAX_VALUE); //9223372036854775807
		System.out.println("최소 정수:"+Long.MIN_VALUE);  //-9223372036854775807
		                                   
		BigInteger bValue1=new BigInteger("100000000000000000000");
		BigInteger bValue2=new BigInteger("-99999999999999999999");
		
		BigInteger addResult=bValue1.add(bValue2);
		BigInteger mulResult=bValue1.multiply(bValue2);
		
		System.out.println("큰 수의 덧셈 결과 : "+addResult);
		System.out.println("큰 수의 곱셈 결과 :"+mulResult);
	}
}


