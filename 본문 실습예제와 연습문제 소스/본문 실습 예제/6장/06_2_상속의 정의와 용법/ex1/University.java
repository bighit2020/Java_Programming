package ch6.ex1;

public class University extends Student{
	private int courses;  //학점

	public University(String _name, int _grade, int _courses){
		System.out.println("University 생성자 호출");
		name = _name;
		grade =_grade;
		courses=_courses;
	}

	public int getCourses(){
		return courses;
	}
}

