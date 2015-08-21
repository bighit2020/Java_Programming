package ch8.ex2b;

public class MyStudent extends Object{
	private String name;
	private int age;
	
	public MyStudent(String name, int age){
		this.name=name;
		this.age= age;
	}
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String toString(){
		return "이름:"+name+ ", 나이:"+age;
	}
}
