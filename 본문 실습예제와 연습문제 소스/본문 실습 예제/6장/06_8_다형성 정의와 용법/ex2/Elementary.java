package ch6.ex11;

public class Elementary extends Student {
	
	public Elementary(String name, int grade,int point){
		System.out.println("Elementary ������ ȣ��");
		super.name=name;
		super.grade=grade;
		
	}
	
	public Elementary(String name, int grade){
		System.out.println("Elementary ������ ȣ��");
		super.name=name;
		super.grade=grade;
	}
	
	public Elementary(){
		this("�̼���",3);
		System.out.println("Elementary ������ ȣ��");
	}

}
