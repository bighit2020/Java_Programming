package ch7.ex3;

public class Elementary extends Student {
	
	public Elementary(String name, int grade,String teacher){
		System.out.println("Elementary ������ ȣ��");
		super.name=name;
		super.grade=grade;
		super.teacher=teacher;
	}
	
	public Elementary(){
		this("�̼���",3,"ȫ�浿");
		System.out.println("Elementary ������ ȣ��");
	}
	
	public String getTeacher(){
		return "��� ������:"+ super.teacher;
	}	

}
