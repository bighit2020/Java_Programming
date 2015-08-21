package ch6.ex11;
public class Student {

	public String name;
	public int grade;
	
	public Student(){
		System.out.println("Student 생성자 호출");
	}
	
	public String getName(){
		return name;
	}
	
	public int getGrade(){
		return grade;
	}
	
	
	
	public String getStudInfo(){
		System.out.println("Student 클래스의 getStudInfo()메소드 호출");
		
		return "이름은 : " + name + " ,학년은 " +grade;
	}
	
	   /*
		// 업캐스팅을 하지 않으면 하위 클래스 마다 오버로딩을 해야한다.
	   public void calcScore(University uni){
		System.out.println("시험점수 구하기");
	   }
	   public void calcScore(Elementary ele){
		  System.out.println("시험점수 구하기");
	   }
	   */

	 /*public void calcScore (Student s){
			System.out.println("학생 시험점수 구하기");
		 }
		 */

	   public void calcScore (Student s){
		 if(s instanceof University){
			System.out.println("University 시험점수 구하기");
		 }else if(s instanceof Elementary){
			System.out.println("Elementary 시험점수 구하기");
		 }
	  }

	
}
