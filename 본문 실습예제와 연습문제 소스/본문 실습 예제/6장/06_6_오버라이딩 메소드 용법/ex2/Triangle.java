package ch6.ex8;

public class Triangle extends Shape {
	public Triangle(){
		System.out.println("Triangle ������ ȣ��");
	}
	public void calcArea(float width,float height){
		super.area=width*height/2.0f;
	}
}
