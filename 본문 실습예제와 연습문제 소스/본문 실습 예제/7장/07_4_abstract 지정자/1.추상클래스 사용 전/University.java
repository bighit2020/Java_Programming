package ch7.ex2;


public class University extends Student {
	private int courses;
	
	public University(String name, int grade, int courses){
		super();
		System.out.println("University ������ ȣ��");
		super.name=name;
		super.grade=grade;
		this.courses= courses;
				
	}
	
	public University(){
		this("�̼���",2,20);
	}
	
	
	public int getCourses(){
		return courses;
	}
	
	//overriding �޼ҵ�
	public String getStudInfo(){
		System.out.println("University Ŭ������ getStudInfo �޼ҵ� ȣ��");
		return "�̸���>> "+ name + ", �г���>> " +grade + ", ��û ������>> "+courses;
	}
	
	//�б���
	public String getProfessor(){
		return "�̼��� ������";
	}	
}
