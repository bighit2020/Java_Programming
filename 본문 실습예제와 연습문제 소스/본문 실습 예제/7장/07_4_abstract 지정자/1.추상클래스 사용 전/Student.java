package ch7.ex2;
public class Student {

	public String name;
	public int grade;
	
	public Student(){
		System.out.println("Student ������ ȣ��");
	}
	
	public String getName(){
		return name;
	}
	
	public int getGrade(){
		return grade;
	}
	
	public String getStudInfo(){
		System.out.println("Student Ŭ������ getStudInfo()�޼ҵ� ȣ��");
		
		return "�̸��� : " + name + " ,�г��� " +grade;
	}
	
	//�л��� ���Ӽ������� �̸��� ���ϴ� �޼ҵ�
	public String getTeacher(){
		return "��浿 ������";
	}
}
