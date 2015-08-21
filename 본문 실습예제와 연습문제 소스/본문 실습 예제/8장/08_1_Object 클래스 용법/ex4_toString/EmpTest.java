package ch8.ex2c;

public class EmpTest {
	public static void main(String[] args){
		Employee emp1=new Employee("차범근","회계부","과장",3000000);
		Employee emp2=new Employee("이순신","관리부","과장",3000000);
		
		/*
		 System.out.println("사원의 이름:"+emp1.name+
				           ",사원의 부서: "+emp1.dept+
				           ",사원의 직급: "+emp1.job+
				           ",사원의 급여액: "+emp1.salary);
	    */
		
		System.out.println(emp1.toString());
		System.out.println(emp1);
		
		System.out.println(emp2.toString());
		System.out.println(emp2);
	}
}
