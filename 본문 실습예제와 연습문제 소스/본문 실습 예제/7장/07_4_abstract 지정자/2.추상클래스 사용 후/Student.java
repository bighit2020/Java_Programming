package ch7.ex3;
public abstract  class Student {

	String name;
	int grade;
	String teacher;
	 
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
	
	//�л��� ���Ӽ������� �̸��� ���ϴ� �߻� �޼ҵ�
	public abstract String getTeacher();
}
