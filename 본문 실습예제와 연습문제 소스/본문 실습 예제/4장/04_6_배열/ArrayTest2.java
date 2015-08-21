package ch4.ex4;

public class ArrayTest2 {
	public static void main(String[] args) {
		int [] num={0,1,2,3,4};
		char [] ch={'a','b','c','d','e'};
		int total=0;
		
		System.out.println("num[0]="+num[0]);
		System.out.println("num[1]="+num[1]);
		System.out.println("num[2]="+num[2]);
		System.out.println("num[3]="+num[3]);
		System.out.println("num[4]="+num[4]);
		
		total=num[0]+num[1]+num[2]+num[3]+num[4];
		System.out.println("num배열의 총합은 "+total);
		
		System.out.println("ch[0]="+ch[0]);
		System.out.println("ch[1]="+ch[1]);
		System.out.println("ch[2]="+ch[2]);
		System.out.println("ch[3]="+ch[3]);
		System.out.println("ch[4]="+ch[4]);
	}
}
