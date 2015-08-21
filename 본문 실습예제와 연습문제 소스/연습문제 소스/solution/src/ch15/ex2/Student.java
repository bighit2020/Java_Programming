package ch15.ex2;


public class Student{
	private String name;  //학생이름
	private int grade;  //학년
	private String subject;  //시험 과목
	private int point;  //시험 점수
		
	//생성자
	public Student(String name, int grade, String subject,int point){
		this.name=name;
		this.grade=grade;
		this.subject=subject;
		this.point=point;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point =point;
	}	
}
