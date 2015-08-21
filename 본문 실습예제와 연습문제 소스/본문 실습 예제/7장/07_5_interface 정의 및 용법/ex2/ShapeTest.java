package ch7.ex8;

public class ShapeTest {
	
	public static void main(String[] args){
		
		float area=0.0f; 
		int width=20;
		int height=30;
		//사각형의 넓이를 구한다.
		Shape s=new Rectangle();  //업캐스팅
		
		area=s.calcArea(width, height);
		
		System.out.println("사각형의 넓이는 " +area);
		
		//삼각형의 넓이를 구한다.
		s=new Triangle();
		area= s.calcArea(width,height);
	
		System.out.println("삼각형의 넓이는 " +area);
	}
}

