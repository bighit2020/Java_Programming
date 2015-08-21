package ch6.ex13;

public class Elementary extends Student{
	public Elementary(String name, int grade){
		System.out.println("Elementary 생성자 호출");
		this.name = name;
		this.grade = grade;
	}
	
	public Elementary(String name, int grade,String gender,int age){
		System.out.println("인자 네개인 Elementary 생성자 호출");
		this.name = name;
		this.grade = grade;
		this.gender=gender;
		this.age=age;
	}
}

