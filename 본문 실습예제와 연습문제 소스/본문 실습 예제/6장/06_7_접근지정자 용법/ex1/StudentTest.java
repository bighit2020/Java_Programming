package ch6.ex9a;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student("ȫ�浿",3);
		
		System.out.println("�л��� �̸���:"+s1.name);
		//System.out.println("�л��� �г���:"+s1.grade);
		System.out.println("�л��� �г���:"+s1.getGrade());
		

	}

}

