package ch4.ex5;

public class MethodTest3 {
	public void summarize(int a, int b){
		int sum=0;
		int max=b;
		int min=a;
		
		if(a>b){
			max=a;
			min=b;
		}
		
		
		for(int i=min; i<=max;i++){
			sum+=i;
		}
		
		System.out.println(a+"와 "+b+" 사이의 자연수의 합은 "+sum);
	}

	public static void main(String[] args) {
		int num1=7;
		int num2=87;
		
		MethodTest3 t=new MethodTest3();
		
		t.summarize(num1, num2);
		t.summarize(1, 100);
		t.summarize(100, 1);
	}
}
