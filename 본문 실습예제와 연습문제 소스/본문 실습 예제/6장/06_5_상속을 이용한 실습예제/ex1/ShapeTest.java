package ch6.ex5;

public class ShapeTest {
	
	public static void main(String[] args){
		float area;
		int width=10;
		int height=20;
		
		//�簢���� ���̸� ���Ѵ�.
		Rectangle rec =new Rectangle();
		
		rec.calcRectangle(width, height);
		rec.printArea();
		
		//�ﰢ���� ���̸� ���Ѵ�.
		Triangle tri=new Triangle();
		tri.calcTriangle(width,height);
		tri.printArea();
	
	}

}
