package ch6.ex13;

public class Elementary extends Student{
	public Elementary(String name, int grade){
		System.out.println("Elementary ������ ȣ��");
		this.name = name;
		this.grade = grade;
	}
	
	public Elementary(String name, int grade,String gender,int age){
		System.out.println("���� �װ��� Elementary ������ ȣ��");
		this.name = name;
		this.grade = grade;
		this.gender=gender;
		this.age=age;
	}
}

