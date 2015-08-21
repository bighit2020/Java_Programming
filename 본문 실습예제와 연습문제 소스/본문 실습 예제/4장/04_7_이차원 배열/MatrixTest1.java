package ch4.ex4b;

public class MatrixTest1 {
	int [][] arr={{2,3,8},
			  {8,9,1},
			  {7,0,5}};
	public static void main(String[] args) {
		int sum=0;
		int [][] arr={{2,3,8},
					  {8,9,1},
					  {7,0,5}};
		
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				sum+=arr[i][j];
			}
			System.out.println(i+1+ "행의 합은 "+sum);
			sum=0;
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				sum+=arr[j][i];
			}
			System.out.println(i+1+ "열의 합은 "+sum);
			sum=0;
		}
		
	}

}
