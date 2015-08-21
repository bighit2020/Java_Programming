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
		 divide �޼ҵ� ���� ����
		ù��° �μ� : ������
		2��° �μ��� scale : �Ҽ������� �� �ڸ����� 
		3��°�� �Ҽ��� ���� ó�� ���
		 */
		
		//�Ҽ����ڸ� 3�ڸ����� �ݿø�ó��
		result = d1.divide(d2,3,BigDecimal.ROUND_CEILING);
		System.out.println("������� : "+result);
	}
}

