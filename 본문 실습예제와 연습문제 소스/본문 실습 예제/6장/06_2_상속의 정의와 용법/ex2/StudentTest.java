package ch6.ex2;

public class StudentTest{
	   public static void main(String [ ] args){
			String sinsang=null;
			String gender=null;
			int age=0;
				
			Elementary e=new Elementary("�̼���",2,"��",15);
				
			sinsang=e.getStudInfo();
			System.out.println("�л�����:" +sinsang);
				
			gender=e.getGender();
			age=e.getGrade();
				
			System.out.println("�л��� ����:"+gender+", �л��� ����:"+age);
	   }
}
