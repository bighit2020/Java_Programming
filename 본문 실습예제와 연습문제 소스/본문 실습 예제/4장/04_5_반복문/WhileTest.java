package ch4;

//1+2+3+4+....+n 더한 값이 최초로 1000이상이 되는 n의 값과
//그 합을  구하는 예제
public class WhileTest {
	
	public static void main(String[] args){
		int n=0;
		int sum=0;
		while(true){
		 sum +=n;	
		  
		  if(sum>=1000)
			  break;
		  else
			  n++;			  
		  }
		System.out.println("1000이상이 되게하는 최초의 n 값은  "+n);
		System.out.println("n까지 더한 합은 " + sum );
		
	}
}


