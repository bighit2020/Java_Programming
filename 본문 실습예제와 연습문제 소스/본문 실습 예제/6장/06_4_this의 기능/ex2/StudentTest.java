package ch6.ex4;

public class StudentTest {
	   public static void main(String[] args){
		String sinsang=null;
		int courses=0;
			
		University u=new University("ȫ�浿",3,22);
		University u1=new University();
			
		sinsang=u.getStudInfo();
		courses=u.getCourses();
			
		System.out.println("�л�����:"+sinsang+" , ����:"+courses);
			
		sinsang=u1.getStudInfo();
		courses=u1.getCourses();
		System.out.println("�л�����:"+sinsang+" , ����:"+courses);
			
	   }
}
