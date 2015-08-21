package ch7.ex3;

public class Elementary extends Student {
	
	public Elementary(String name, int grade,String teacher){
		System.out.println("Elementary 생성자 호출");
		super.name=name;
		super.grade=grade;
		super.teacher=teacher;
	}
	
	public Elementary(){
		this("이순신",3,"홍길동");
		System.out.println("Elementary 생성자 호출");
	}
	
	public String getTeacher(){
		return "담당 선생님:"+ super.teacher;
	}	

}
