package ch6.ex2;

public class Student extends Person{
	protected String name;  //�̸�
	protected int grade;   //�г�

  public Student() {
	  System.out.println("Student �θ� ������ ȣ��");
   }

  public String getName() {
	  return name;
   }
  public int getGrade() {
	  return grade;
  }

  //�л��� �Ż� ������ �ѹ���  ����� �ִ� �޼ҵ�
  public String getStudInfo() { 
   System.out.println("Student Ŭ������ getStudInfo() ȣ��");
   return "�̸�: " + name + ",�г�: " + grade+",����:"+gender+",����:"+age;
  }
}

