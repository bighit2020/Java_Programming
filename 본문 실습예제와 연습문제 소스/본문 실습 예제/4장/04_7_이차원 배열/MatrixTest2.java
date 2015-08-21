package ch4.ex4;

public class MatrixTest2 {
	public static void main(String[] args) {
		int sum=0;
		int [][] arr={{2,3,8},
					  {8,9,1},
					  {7,0,5}};
		
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				if(i==j)
				sum+=arr[i][j];
			}
			
		}
		
		System.out.println("첫번째 대각선의 합은 "+sum);
		sum=0;
		
		System.out.println();
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				if(i+j==2)
					sum+=arr[i][j];
			}
			
		}
		System.out.println("두번째 대각선의 합은 "+sum);
	}

}
