package ch6.ex2;

public class Elementary extends Student{
	   public Elementary(String _name, int _grade){
		System.out.println("���� �ΰ��� Elementary ������ ȣ��");
		name = _name;
		grade = _grade;
	   }
	   public Elementary(String _name, int _grade,String _gender,int _age){
		System.out.println("���� �� ���� Elementary  ������ ȣ��");
		name = _name;
		grade = _grade;
		gender=_gender;
		age=_age;
	   }	
	}


