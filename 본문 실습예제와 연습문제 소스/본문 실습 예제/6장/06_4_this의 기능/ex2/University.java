package ch6.ex4;

public class University extends Student{
	private int courses;  //����

	public University(String name, int grade, int courses){
		super(); //��������� �θ� Ŭ������ ����Ʈ ������ ȣ��
		System.out.println("University ������ ȣ��");
		super.name = name;
		super.grade =grade;
		this.courses = courses;
	}

	public University(){
		this("�̼���",2,20);
	}
	public int getCourses(){
		return courses;
	}
}

