package ch4.ex4;

public class ArrayTest5 {
	public static void main(String[] args) {
		int [] num={1,2,3,4,5,6,7,8,9};
		int len=num.length;
		int [] temp=new int[len];
		
		System.out.println("교환전 배열 요소 값");
		for(int i=0; i<len;i++){
			System.out.print(num[i]+"\t");
		}

		for(int i=0; i<len-1;i++){
			temp[i]=num[len-1-i];
		}
		
		for(int i=0; i<len-1;i++){
			num[i]=temp[i];
		}
		
		System.out.println("\n교환후 배열 요소 값");
		for(int i=0; i<len;i++){
			System.out.print(num[i]+"\t");
		}
	}
}
