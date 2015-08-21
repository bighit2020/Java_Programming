package ch8.ex2;

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
	//equals ¸Þ¼Òµå overriding
	public boolean equals(Object o){
		boolean result=false;
		if(o instanceof MyStudent){
			MyStudent s=(MyStudent)o;
			if(name.equals(s.name) && (age==s.age)){
				result= true;
			}
		}
		return result;
	}
	
}
