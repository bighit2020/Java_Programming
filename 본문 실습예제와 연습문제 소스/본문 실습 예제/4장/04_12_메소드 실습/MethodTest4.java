package ch4.ex5;

public class MethodTest4 {
	public void summarize(int max){
		int num=1;
		int sum=0;
		
		while(true){
			sum+=num;
			
			if(sum>=max)
				break;
			num+=2;
		}
		
		System.out.println(max+"보다 최초로 크게 되는 홀수는 "+num+",");
		System.out.println(num+"까지의 합은 "+sum);
		
	}
	
	
	public static void main(String[] args) {
		int limit1=1000;
		int limit2=10000;
		
		MethodTest4 t=new MethodTest4();
		t.summarize(limit1);
		t.summarize(limit2);

	}

}
