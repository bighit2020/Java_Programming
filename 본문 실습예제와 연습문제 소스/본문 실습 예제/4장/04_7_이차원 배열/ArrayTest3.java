package ch4;

public class ArrayTest3{
	public  static  void main(String[]  args){
		int arr[][];
		arr=new int[3][3];

		//i가 이차원 배열 arr의 일차원 배열요소
		for(int i=0; i < arr.length;i++){  //i= 0,1,2
			//j가 arr의 이차원 배열요소
			for(int j=0; j<arr[i].length;j++)  
				arr[i][j]=3*i +j;  //배열인덱스와 같은 값을 배열에 할당한다.
		}
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++)
				System.out.println("arr[" + i +"]["+ j + "]=" + arr[i][j]);
		}
	}
}