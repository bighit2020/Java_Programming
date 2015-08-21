package ch6.ex5;

public class ShapeTest {
	
	public static void main(String[] args){
		float area;
		int width=10;
		int height=20;
		
		//사각형의 넓이를 구한다.
		Rectangle rec =new Rectangle();
		
		rec.calcRectangle(width, height);
		rec.printArea();
		
		//삼각형의 넓이를 구한다.
		Triangle tri=new Triangle();
		tri.calcTriangle(width,height);
		tri.printArea();
	
	}

}
