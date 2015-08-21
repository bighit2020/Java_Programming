package ch8.ex2a;

public class Employee {
	private String name;  //사원 이름
	private String dept; 	//근무 부서
	private String job;  //사원 직급
	private int salary;	//사원 급여
	
	//생성자
	public Employee(String name,String dept, String job, int salary){
		this.name=name;
		this.dept=dept;
		this.job=job;
		this.salary=salary;
	}
	
	
		//equals 메소드 overriding
		//인자 타입이 Object 이므로 상속에 의한 다형성에 의해서 모든 객체를 전달받는다.
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
