package ch3.ex2;

public class CurrenyTest {
	public static void main(String[] args) {
		int won=354000;
		int rate=960;
		float dollar;
		
		dollar=won/rate; //������ �����Ѵ�(�Ҽ����� ����)
		System.out.println(won+"�� �� ���� �޷��� :"+dollar+" �޷�");
		
		dollar=(float)won/(float)rate; // float/int�� int�� �ڵ����� float�� ��ȯ(float/float)
		System.out.println(won+"�� �� ���� �޷��� :"+dollar+" �޷�");

		
		dollar=(float) won/rate; // float/int�� int�� �ڵ����� float�� ��ȯ(float/float)
		System.out.println(won+"�� �� ���� �޷��� :"+dollar+" �޷�");

		//won=dollar*rate;
		won=(int)dollar*rate;  //dollar�� ���� ������ ��ȯ�ȴ�. 368*960
		System.out.println(dollar+"�޷��� ���� ����:"+won+"��");
		
		won=(int)(dollar*rate);  //dollar�� ���� ������ ��ȯ�ȴ�. 368*960
		System.out.println(dollar+"�޷��� ���� ����:"+won+"��");
		
	}

}
