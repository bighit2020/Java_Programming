package ch4.ex2;

public class Ex4 {
	public void calcScore(int[] score){
		//1.���� ���� ����
		int total=0;
		float average=0f;
		
		//2.��� ����
		for(int i=0; i<score.length;i++){
			total+=score[i];
		}
		
		//3.����� ��� �Ǵ� ����
		average=(float)total/score.length;
		
		System.out.println("�������� ������ "+total+"���̰�, �����"+average+"���Դϴ�.");

	}
	public static void main(String[] args) {
		int [] s={45,67,89,12,56,90,64,79,55};
		
		Ex4 ex=new Ex4();
		ex.calcScore(s);
	}
}
