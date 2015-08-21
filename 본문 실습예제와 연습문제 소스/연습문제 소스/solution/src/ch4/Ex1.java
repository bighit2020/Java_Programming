package ch4;

public class Ex1 {
	public static void main(String[] args) {
		int row_len=5;
		int star_num=5;
		
		for(int i=0; i<row_len;i++){
			for(int j=0; j<star_num;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0; i<row_len;i++){
			for(int j=0; j<star_num-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		row_len=10;
		for(int i=0; i<row_len-1;i++){
			if(i<5){
				for(int j=0; j<star_num-i;j++){
					System.out.print("*");
				}
			}else{
				for(int j=0; j<i-star_num+2;j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
