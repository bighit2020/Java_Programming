package ch8;

public class Ex4 {
	public static void main(String[] args) {
		String str="사과,바나나,귤-스마트폰,TV,노트북";
		String temp[]=null;
		String fruit[]=null;
		String goods[]=null;
		
		temp=str.split("-");
		
		fruit=temp[0].split(",");
		goods=temp[1].split(",");
		
		System.out.println("출력 결과");
		System.out.println("----------------------");
		System.out.println("과일:"+fruit[0]+"/"+fruit[1]+"/"+fruit[2]);
		System.out.println("제품:"+ goods[0]+"*"+goods[1]+"*"+goods[2]);
	}

}
