package ch6.ex10;
public class Student {

	public String name;
	public int grade;
	
	public Student(){
		System.out.println("Student 생성자 호출");
	}
	
	public String getName(){
		return name;
	}
	
	public int getGrade(){
		return grade;
	}
	
	
	
	public String getStudInfo(){
		System.out.println("Student 클래스의 getStudInfo()메소드 호출");
		
		return "이름은 : " + name + " ,학년은 " +grade;
	}
	

	
}
