package ch6.ex1;

public class StudentTest{
	public static void main(String [ ] args){
		String sinsang=null;
		Elementary e=new Elementary("이순신",2);
		University c = new University("홍길동", 3, 20);
		
		sinsang=e.getStudInfo();
		System.out.println("학생 정보:" +sinsang);
		sinsang=c.getStudInfo();
		System.out.println("학생 정보:"+sinsang+ ", 수강학점: " + c.getCourses()+"점");
	}
}

