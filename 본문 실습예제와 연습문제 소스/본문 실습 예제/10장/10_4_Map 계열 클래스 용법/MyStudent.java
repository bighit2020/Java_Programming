package ch10.ex2;

public class MyStudent {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	
	//생성자
	public MyStudent(){
		this("이순신",23);
	}
	
	public MyStudent(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return "이름은 " + name + " ,나이는" + age+ " 입니다.";
	}
}
