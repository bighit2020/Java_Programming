package ch6.ex3;

public class Student{
	protected String name;  //�̸�
	protected int grade;   //�г�
	//private String name;  //private �� �����ϸ� ����� �ȵȴ�.
	//private int grade; 

  public Student() {System.out.println("Student �θ� ������ ȣ��");}

  public String getName() {return name;}
  public int getGrade() {return grade;}

  public String getInfo() { 
   System.out.println("Student Ŭ������ getInfo()�Դϴ�.");
   return "�̸��� : " + name + "�г��� : " + grade;
  }
}

