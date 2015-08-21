package ch5.ex3;

public class Student2 {
	private String name;
	private int age;
	private String address;

	//사용자 정의 생성자 정의
	public Student2(String n,int a){
		System.out.println("매개변수가 두개인 생성자 호출");
		name=n;
		age=a;
	}
	
	public Student2(String n){
		System.out.println("매개변수가 한 개인 생성자 호출");
		name=n;
	}
	//사용자가 생성자를 명시적으로 정의해 주면 
	// 디폴트 생성자는 컴파일 시 자동으로 추가되지 않는다.
	
	//디폴트 생성자 정의
	public Student2(){
		System.out.println("디폴트 생성자 호출");
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setName(String n){
		name=n;
	}
	
	public void setAge(int a){
		age= a;
	}

}
