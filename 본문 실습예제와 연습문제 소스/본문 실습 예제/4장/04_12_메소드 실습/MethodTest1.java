package ch4.ex5;

public class MethodTest1 {

	public float calcVolume(int w,int l,int h){
		float vol=0f;
		vol=w*l*h;
		
		return vol;
				
	}
	
	public static void main(String[] args) {
		int width=10;
		int length=15;
		int height=20;
		float volume=0f;
		
		MethodTest1 t=new MethodTest1();
		
		volume=t.calcVolume(width,length,height);
		System.out.println("첫번째 직육면체 부피는 "+volume);
		
		width=12;
		length=5;
		height=51;
		volume=t.calcVolume(width,length,height);
		System.out.println("두번째 직육면체 부피는 "+volume);

		System.out.println("첫번째 직육면체 부피는 "+t.calcVolume(35,10,5));
	}
}
