package ch8.ex2c;

public class Employee {
	String name;  //��� �̸�
	String dept; 	//�ٹ� �μ�
	String job;  //��� ����
	int salary;	//��� �޿�
	
	//������
	public Employee(String name,String dept, String job, int salary){
		this.name=name;
		this.dept=dept;
		this.job=job;
		this.salary=salary;
	}
	
	public String toString(){
		String data= "����� �̸�:" + name +
					 " ,����� �μ�: "+dept + 
					 " ,����� ����: "+job + 
					 " ,�޿�: "+salary+"��";
		
		return data;
	}
}
