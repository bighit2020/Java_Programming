package ch6.ex8;

public class Shape {
	float area;
	
	public void printArea(){
		System.out.println("������ ���̴� "+this.area+" �Դϴ�.");
	}
	
	public void calcArea(float width,float height){
		this.area=width*height;
	}
}
