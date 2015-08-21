package ch4.ex5;

public class MethodTest6 {
	public int calcGCM(int num1,int num2){
		int total=0;
		int max=num1;
		int min=num2;
		
		if(num1<num2){
			max=num2;
			min=num1;
		}
		
		for(int i=1;i<=min;i++){
			if(num1%i==0 && num2%i==0){
				total+=i;
			}
		}
		
		return total;
	}

	public static void main(String[] args) {
		int n1=5;
		int n2=10;
		int total=0;
		
		MethodTest6 t=new MethodTest6();
		
		total=t.calcGCM(n1,n2);
		System.out.println(n1+"과 "+n2+"의 공약수들의 합은"+total);
		

		System.out.println("1505과 300의 공약수들의 합은"+t.calcGCM(150,300));
	}

}
