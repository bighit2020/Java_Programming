package ch4.ex4a;

public class Exercise3 {
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		
		while(true){
			sum+=num;
			
			if(sum>=1000)
				break;
			else
				num+=2;
		}
		
		System.out.println("1����"+num+"������ Ȧ�������� "+sum);
	}
}

