package ch8;

public class Ex4 {
	public static void main(String[] args) {
		String str="���,�ٳ���,��-����Ʈ��,TV,��Ʈ��";
		String temp[]=null;
		String fruit[]=null;
		String goods[]=null;
		
		temp=str.split("-");
		
		fruit=temp[0].split(",");
		goods=temp[1].split(",");
		
		System.out.println("��� ���");
		System.out.println("----------------------");
		System.out.println("����:"+fruit[0]+"/"+fruit[1]+"/"+fruit[2]);
		System.out.println("��ǰ:"+ goods[0]+"*"+goods[1]+"*"+goods[2]);
	}

}
