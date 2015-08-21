package ch6.ex1;

public class Elementary extends Student{
	public Elementary(String _name, int _grade){
		System.out.println("Elementary 생성자 호출");
		name = _name;
		grade = _grade;
	}
}

