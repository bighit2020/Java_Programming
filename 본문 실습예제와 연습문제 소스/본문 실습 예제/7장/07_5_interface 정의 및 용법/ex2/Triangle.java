package ch7.ex8;

public class Triangle implements Shape {
	//반드시 추상 메소드를 구현해 주어야 한다.
	public float calcArea(float width, float height){
		float  area=width*height/2.0f;		
		return area;
	}
}

