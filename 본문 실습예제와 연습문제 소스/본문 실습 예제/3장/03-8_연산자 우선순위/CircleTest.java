package ch3.ex3;

public class CircleTest {
	public static void main(String[] args) {
		int radius;
		float circum,area;
		float PI=3.141592f;  //원주율을 저장하는 변수
		radius=5;
		circum=2*PI*radius;
		area=PI*radius*radius;
		System.out.println("반지름이 "+radius+"인 원의 둘레:"+circum+
				           ",면적: "+area+"입니다.");
		
		radius=10;
		circum=2*PI*radius;
		area=PI*radius*radius;
		System.out.println("반지름이 "+radius+"인 원의 둘레:"+circum+
				            ",면적: "+area+"입니다.");
	}
}
