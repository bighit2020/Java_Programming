package ch11.ex6;

public class Restaurant {
	public static void main(String[] args){
		Food food=new Food();
		
		Waitor waitor=new Waitor("������",food);
		Chef chef=new Chef("�ֹ���",food);
		
		waitor.start();
		chef.start();
	}
}
