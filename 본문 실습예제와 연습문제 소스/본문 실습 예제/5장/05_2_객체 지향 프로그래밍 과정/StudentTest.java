package ch5.ex1;

public class StudentTest {
	public static void main(String[] args){
		
		//1.Student 인스턴스를  메모리에 생성한다.
		//2.인스턴스를 Student클래스 타입 변수에 할당한다.
		Student2 s= new Student2();
		
		//3.변수를 사용해서 인스턴스에 접근 해서 원하는 작업을 한다.
		s.setName("이순신");
		String name=s.getName();
		System.out.println("학생 이름은  " +name);
	}
}
