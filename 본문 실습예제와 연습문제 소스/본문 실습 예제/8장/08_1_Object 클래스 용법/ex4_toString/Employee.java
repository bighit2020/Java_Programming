package ch8.ex2c;

public class Employee {
	String name;  //사원 이름
	String dept; 	//근무 부서
	String job;  //사원 직급
	int salary;	//사원 급여
	
	//생성자
	public Employee(String name,String dept, String job, int salary){
		this.name=name;
		this.dept=dept;
		this.job=job;
		this.salary=salary;
	}
	
	public String toString(){
		String data= "사원의 이름:" + name +
					 " ,사원의 부서: "+dept + 
					 " ,사원의 직급: "+job + 
					 " ,급여: "+salary+"원";
		
		return data;
	}
}
