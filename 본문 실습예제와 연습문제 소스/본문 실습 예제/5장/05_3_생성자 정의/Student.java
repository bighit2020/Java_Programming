package ch5.ex3;

public class Student{
	private String name;
	private int grade;
	
	public Student(String _name,int _grade){
		System.out.println("인자가 두개인 생성자 호출");
		name=_name;
		grade=_grade;
	}
	
	public Student(String _name){
		System.out.println("인자가 한개인 생성자 호출");
		name=_name;
	}
	
	public Student(){
		System.out.println("디폴트 생성자 호출");
	}	
	public String getName(){
		return name;
	}
	public int getGrade(){
		return grade;
	}
	
	public void setName(String _name){
		name=_name;
	}
	
	public void setGrade(int _grade){
		grade=_grade;
	}
}

