package ch8.ex2a;

public class Employee {
	private String name;  //��� �̸�
	private String dept; 	//�ٹ� �μ�
	private String job;  //��� ����
	private int salary;	//��� �޿�
	
	//������
	public Employee(String name,String dept, String job, int salary){
		this.name=name;
		this.dept=dept;
		this.job=job;
		this.salary=salary;
	}
	
	
		//equals �޼ҵ� overriding
		//���� Ÿ���� Object �̹Ƿ� ��ӿ� ���� �������� ���ؼ� ��� ��ü�� ���޹޴´�.
	public boolean equals(Object o){
		boolean result=false;
			
		if(o instanceof Employee){
			Employee emp=(Employee)o; 
			if(job.equals(emp.job) && (salary==emp.salary)){
				result= true;
			}
		}
		return result;
	}
}
