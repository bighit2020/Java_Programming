package ch6.ex4;

public class University extends Student{
	private int courses;  //학점

	public University(String name, int grade, int courses){
		super(); //명시적으로 부모 클래스의 디폴트 생성자 호출
		System.out.println("University 생성자 호출");
		super.name = name;
		super.grade =grade;
		this.courses = courses;
	}

	public University(){
		this("이순신",2,20);
	}
	public int getCourses(){
		return courses;
	}
}

