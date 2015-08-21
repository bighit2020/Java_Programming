package ch6.ex3;

public class University extends Student{
	private int courses;  //학점

	public University(String name, int grade, int _courses){
		super(); //명시적으로 부모 클래스의 디폴트 생성자 호출
		System.out.println("University 생성자 호출");
		super.name = name;
		super.grade =grade;
		courses = _courses;
	}

	public int getCourses(){
		return courses;
	}
}

