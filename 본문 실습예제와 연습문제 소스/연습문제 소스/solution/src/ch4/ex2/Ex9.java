package ch4.ex2;

public class Ex9 {
	public void sortArray(int[] arr1,int [] arr2){
		//1.지역 변수 선언
		int temp=0;
		int len=arr1.length+arr2.length;
		int[] arr=new int[len];
	
		//2.기능 구현
		for(int i=0; i<arr1.length;i++){
			arr[i]=arr1[i];
		}
		
		for(int i=0; i<arr2.length;i++){
			arr[i+arr1.length]=arr2[i];
		}
		
		for(int i=0; i<arr.length;i++){
	    	for(int j=i+1; j<arr.length;j++){
	    		if(arr[i]> arr[j]){
	    			temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
	    		}
	    	}
	    }
		
		//3.결과값 출력또는 리턴
	    for(int i=0;i< arr.length;i++){
	    	System.out.print(arr[i]+"\t");
	    }
	}
	
	public static void main(String[] args) {
		int[] num1={35,97,56,85,65,77,88,90,51};
		int[] num2={45,67,89,43,56};
		
		Ex9 ex=new Ex9();
		ex.sortArray(num1,num2);
	}

}
