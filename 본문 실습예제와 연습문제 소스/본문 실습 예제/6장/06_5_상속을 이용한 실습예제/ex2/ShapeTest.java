package ch6.ex6;

public class ShapeTest {
	
	public static void main(String[] args){
		
		int width=10;
		int height=20;
		
		Rectangle rec =new Rectangle();
		
		rec.calcRectangle(width, height);
		rec.printArea();
		
		//�ﰢ���� ���̸� ���Ѵ�.
		Triangle tri=new Triangle();
		tri.calcTriangle(width,height);
		tri.printArea();
	
	}

}
