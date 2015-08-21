package ch3.ex2;

public class CurrenyTest {
	public static void main(String[] args) {
		int won=354000;
		int rate=960;
		float dollar;
		
		dollar=won/rate; //정수만 리턴한다(소수값은 버림)
		System.out.println(won+"원 에 대한 달러는 :"+dollar+" 달러");
		
		dollar=(float)won/(float)rate; // float/int는 int가 자동으로 float로 변환(float/float)
		System.out.println(won+"원 에 대한 달러는 :"+dollar+" 달러");

		
		dollar=(float) won/rate; // float/int는 int가 자동으로 float로 변환(float/float)
		System.out.println(won+"원 에 대한 달러는 :"+dollar+" 달러");

		//won=dollar*rate;
		won=(int)dollar*rate;  //dollar의 값이 정수로 변환된다. 368*960
		System.out.println(dollar+"달러에 대한 원은:"+won+"원");
		
		won=(int)(dollar*rate);  //dollar의 값이 정수로 변환된다. 368*960
		System.out.println(dollar+"달러에 대한 원은:"+won+"원");
		
	}

}
