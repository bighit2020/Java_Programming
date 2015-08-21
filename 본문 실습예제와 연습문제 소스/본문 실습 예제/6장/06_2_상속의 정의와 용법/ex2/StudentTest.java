package ch6.ex2;

public class StudentTest{
	   public static void main(String [ ] args){
			String sinsang=null;
			String gender=null;
			int age=0;
				
			Elementary e=new Elementary("이순신",2,"남",15);
				
			sinsang=e.getStudInfo();
			System.out.println("학생정보:" +sinsang);
				
			gender=e.getGender();
			age=e.getGrade();
				
			System.out.println("학생의 성별:"+gender+", 학생의 나이:"+age);
	   }
}
