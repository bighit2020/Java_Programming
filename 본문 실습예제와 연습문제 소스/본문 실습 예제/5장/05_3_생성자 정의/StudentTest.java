package ch5.ex3;

public class StudentTest {
	
	public static void main(String[] args){
		Student s= new Student();  
		Student s2= new Student("홍길동"); 
		//s.setName("이순신");
		String name=s.getName();
		int grade=s.getGrade();
		System.out.println("첫번째 학생의 이름은 " + name+" ,학년는 "+grade);
		
		name=s2.getName();
		grade=s2.getGrade();
		System.out.println("두번재 학생의 이름은 "+name+" ,학년는 "+grade);
	}
}


