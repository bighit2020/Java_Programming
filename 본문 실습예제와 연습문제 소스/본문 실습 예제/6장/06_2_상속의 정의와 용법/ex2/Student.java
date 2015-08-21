package ch6.ex2;

public class Student extends Person{
	protected String name;  //이름
	protected int grade;   //학년

  public Student() {
	  System.out.println("Student 부모 생성자 호출");
   }

  public String getName() {
	  return name;
   }
  public int getGrade() {
	  return grade;
  }

  //학생의 신상 정보를 한번에  출력해 주는 메소드
  public String getStudInfo() { 
   System.out.println("Student 클래스의 getStudInfo() 호출");
   return "이름: " + name + ",학년: " + grade+",성별:"+gender+",나이:"+age;
  }
}

