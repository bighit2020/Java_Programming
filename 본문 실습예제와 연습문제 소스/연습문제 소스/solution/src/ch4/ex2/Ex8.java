package ch4.ex2;

public class Ex8 {
	public void sortArray(int[] arr){
		//1.지역변수 선언
		int temp=0;
		
		//2.기능 구현
		for(int i=0; i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//3.결과값 출력또는 리턴
		System.out.println("배열 정렬");
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int num1[]={45,67,89,12,56,90,64,79,55};
		int num2[]={35,97,56,85,65,77,88,90,51};
		int num3[]={45,67,89,43,56,3,45,66,88,99};
		
		Ex8 ex=new Ex8();
		ex.sortArray(num1);
		ex.sortArray(num2);
		ex.sortArray(num3);
	}
}
