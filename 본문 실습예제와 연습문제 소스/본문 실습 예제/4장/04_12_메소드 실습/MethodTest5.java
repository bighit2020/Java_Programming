package ch4.ex5;

public class MethodTest5 {

	int calcAksu(int num){
		int total=0;
		
		for(int i=1;i<=num;i++){
			if(num%i==0)
				total+=i;
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		int  num1=100;
		int  num2=150;
		int  sum=0;
		
		MethodTest5 t=new MethodTest5();
		
		sum=t.calcAksu(num1);
		System.out.println(num1+"의 약수들의 합은 "+sum);
		
		sum=t.calcAksu(num2);
		System.out.println(num2+"의 약수들의 합은 "+sum);
	}
}
