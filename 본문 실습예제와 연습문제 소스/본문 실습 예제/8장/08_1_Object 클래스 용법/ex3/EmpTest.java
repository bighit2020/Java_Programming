package ch8.ex2a;


public class EmpTest {
	public static void main(String[] args){
		Employee emp1=new Employee("차범근","회계부","과장",3000000);
		Employee emp2=new Employee("이순신","관리부","과장",3000000);
		Employee emp3=new Employee("임꺽정","총무부","차장",3500000);
		
		if(emp1==emp2){
			System.out.println("두 사원의 직급과 급여는 같습니다.");
		}else{
			System.out.println("두 사원의 직급과 급여는 다릅니다.");
		}
		
		if(emp1.equals(emp2)){
			System.out.println("두 사원의 직급과 급여는 같습니다.");
		}else{
			System.out.println("두 사원의 직급과 급여는 다릅니다.");
		}
		
		if(emp1.equals(emp3)){
			System.out.println("두 사원의 직급과 급여는 같습니다.");
		}else{
			System.out.println("두 사원의 직급과 급여는 다릅니다.");
		}
	}
}
