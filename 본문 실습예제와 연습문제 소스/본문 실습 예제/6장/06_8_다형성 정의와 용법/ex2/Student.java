package ch6.ex11;
public class Student {

	public String name;
	public int grade;
	
	public Student(){
		System.out.println("Student ������ ȣ��");
	}
	
	public String getName(){
		return name;
	}
	
	public int getGrade(){
		return grade;
	}
	
	
	
	public String getStudInfo(){
		System.out.println("Student Ŭ������ getStudInfo()�޼ҵ� ȣ��");
		
		return "�̸��� : " + name + " ,�г��� " +grade;
	}
	
	   /*
		// ��ĳ������ ���� ������ ���� Ŭ���� ���� �����ε��� �ؾ��Ѵ�.
	   public void calcScore(University uni){
		System.out.println("�������� ���ϱ�");
	   }
	   public void calcScore(Elementary ele){
		  System.out.println("�������� ���ϱ�");
	   }
	   */

	 /*public void calcScore (Student s){
			System.out.println("�л� �������� ���ϱ�");
		 }
		 */

	   public void calcScore (Student s){
		 if(s instanceof University){
			System.out.println("University �������� ���ϱ�");
		 }else if(s instanceof Elementary){
			System.out.println("Elementary �������� ���ϱ�");
		 }
	  }

	
}
