package ch4.ex4;

public class ArrayTest1 {
	public static void main(String[] args) {
		int [] num;
		char [] ch;
		int total=0;
		
		num=new int[5];
		ch=new char[5];
		
		num[0]=0;
		//num[0]=3.14;
		num[1]=1;
		num[2]=2;
		num[3]=3;
		num[4]=4;
		//num[5]=5;
		
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		ch[3]='d';
		ch[4]='e';
		
		System.out.println("num[0]="+num[0]);
		System.out.println("num[1]="+num[1]);
		System.out.println("num[2]="+num[2]);
		System.out.println("num[3]="+num[3]);
		System.out.println("num[4]="+num[4]);
		//System.out.println("num[5]="+num[5]);
		
		total=num[0]+num[1]+num[2]+num[3]+num[4];
		System.out.println("num배열의 총합은 "+total);
		
		System.out.println("ch[0]="+ch[0]);
		System.out.println("ch[1]="+ch[1]);
		System.out.println("ch[2]="+ch[2]);
		System.out.println("ch[3]="+ch[3]);
		System.out.println("ch[4]="+ch[4]);
	}
}
