package ch4;

public class Ex12 {

	public static void main(String[] args) {
		//1.지역 변수 선언
		int[]  num1={1,34,56,23,7,89};
		int[]  num2={2,45,6,8,90};
		int temp=0;
		int len=num1.length+num2.length;
		int [] num=new int[len];
		
		//2.기능 구현
		for(int i=0; i<num1.length;i++){
			num[i]=num1[i];
		}
		
		for(int i=0; i<num2.length;i++){
			num[i+num1.length]=num2[i];
		}
		
	/*	for(int i=0; i<len;i++){
			System.out.print(num[i]+"\t");
		}*/
		
		for(int i=0; i<num.length;i++){
	    	for(int j=i+1; j<num.length;j++){
	    		if(num[i]> num[j]){
	    			temp=num[i];
	    			num[i]=num[j];
	    			num[j]=temp;
	    		}
	    	}
	    }
		
		//3.결과 출력
	    for(int i=0;i< num.length;i++){
	    	System.out.print(num[i]+"\t");
	    }
	}

}
