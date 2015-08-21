package ch4.ex4;

public class ArrayTest3 {
	public static void main(String[] args) {
		int [] num;
		char [] ch;
		
		num=new int[5];
		ch=new char[5];
		
		for(int i=0; i<num.length;i++){
			num[i]=i;
		}
		
		for(int i=0; i<ch.length;i++){
			ch[i]=(char)(97+i);
		}
		
		for(int i=0; i<num.length;i++){
			System.out.println("num["+i+"]="+num[i]);
		}
		
		for(int i=0; i<ch.length;i++){
			System.out.println("ch["+i+"]="+ch[i]);
		}
	}
}
