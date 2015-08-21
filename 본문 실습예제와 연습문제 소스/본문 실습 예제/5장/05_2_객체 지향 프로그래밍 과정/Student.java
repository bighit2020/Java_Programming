package ch5.ex3a;

public class Student {
	//맴버변수 선언
	private String name;
	private int grade;

	public Student(String _name){
		System.out.println("매개변수가 한 개인 생성자 호출");
		name=_name;
	}
	//디폴트 생성자 정의
	public Student(){
		System.out.println("디폴트 생성자 호출");
	}
	
	//멤버 메소드 선언
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

