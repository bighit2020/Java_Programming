package ch7.ex3;

public class StudentTest {
	public static void main(String[] args){
		
		//Student s= new Student();  //�߻� Ŭ������ ��ü ������ �Ұ����ϴ�.
		Student st= new University ("ȫ�浿",3,22,"������");  //upcasting
		Elementary m  = new Elementary("�̼���",2,"ȫ��");
			
		System.out.println("�л� �̸�:"+st.getName());
		System.out.println(st.getTeacher());
		System.out.println(m.getTeacher());

	
	}
}
