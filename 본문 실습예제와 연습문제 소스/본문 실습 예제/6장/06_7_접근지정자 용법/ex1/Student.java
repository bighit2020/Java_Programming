package ch6.ex9a;

public class Student {
	String name;
	private int grade;
	
	
	public Student(String name,int grade){
		this.name=name;
		this.grade=grade;
	}
	
	public int getGrade(){
		return grade;
	}
	
}


