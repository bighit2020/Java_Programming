package ch6.ex8;

public class ShapeTest {
	
	public static void main(String[] args){
		
		int width=10;
		int height=20;
		
		Rectangle rec =new Rectangle();
		
		rec.calcArea(width, height);
		rec.printArea();
		
		//�ﰢ���� ���̸� ���Ѵ�.
		Triangle tri=new Triangle();
		tri.calcArea(width,height);
		tri.printArea();
	
	}

}
