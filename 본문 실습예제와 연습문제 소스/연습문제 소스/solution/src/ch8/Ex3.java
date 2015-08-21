package ch8;

public class Ex3 {
	public static void main(String[] args) {
		String num1="12300";
		String num2="11000000001100";
		String num3="FFFF";
		int num=Integer.parseInt(num1);
		System.out.println(num1+"-->"+Integer.toBinaryString(num));
		
		num=Integer.parseInt(num2,2);

		
		System.out.println(num2+"-->"+num);
		num=Integer.parseInt(num3,16);
		System.out.println(num3+"-->"+num);

	}
}
