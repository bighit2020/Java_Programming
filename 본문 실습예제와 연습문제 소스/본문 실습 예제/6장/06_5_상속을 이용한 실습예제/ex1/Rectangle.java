package ch6.ex5;

public class Rectangle {
	private float area;
	public void printArea(){
		System.out.println("�簢���� ���̴� "+this.area+" �Դϴ�.");
	}
	
	public void calcRectangle(float width,float height){
		this.area=width*height;
	}
	
}


