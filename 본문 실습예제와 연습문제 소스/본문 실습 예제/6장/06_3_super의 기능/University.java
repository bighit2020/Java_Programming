package ch6.ex3;

public class University extends Student{
	private int courses;  //����

	public University(String name, int grade, int _courses){
		super(); //��������� �θ� Ŭ������ ����Ʈ ������ ȣ��
		System.out.println("University ������ ȣ��");
		super.name = name;
		super.grade =grade;
		courses = _courses;
	}

	public int getCourses(){
		return courses;
	}
}

