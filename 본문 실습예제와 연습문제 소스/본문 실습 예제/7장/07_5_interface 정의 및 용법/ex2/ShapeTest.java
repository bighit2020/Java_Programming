package ch7.ex8;

public class ShapeTest {
	
	public static void main(String[] args){
		
		float area=0.0f; 
		int width=20;
		int height=30;
		//�簢���� ���̸� ���Ѵ�.
		Shape s=new Rectangle();  //��ĳ����
		
		area=s.calcArea(width, height);
		
		System.out.println("�簢���� ���̴� " +area);
		
		//�ﰢ���� ���̸� ���Ѵ�.
		s=new Triangle();
		area= s.calcArea(width,height);
	
		System.out.println("�ﰢ���� ���̴� " +area);
	}
}

