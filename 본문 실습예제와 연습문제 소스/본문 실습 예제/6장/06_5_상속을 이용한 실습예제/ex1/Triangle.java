package ch6.ex5;

public class Triangle  {
	private float area;
	public void printArea(){
		System.out.println("�ﰢ���� ���̴� "+this.area+" �Դϴ�.");
	}
	
	public void calcTriangle(float width,float height){
		this.area=width*height/2.0f;
	}	
}
