package ch4;

public class Ex6 {

	public static void main(String[] args) {
		//1.���� ����  ����
		int [] score={45,67,89,12,56,90,64,79,55};
		int total=0;
		float average=0f;
		//2.��� ����
		for(int i=0; i<score.length;i++){
			total+=score[i];
		}
		
		average=(float)total/score.length;
		
		System.out.println("���� ������ ������ "+total+"��");
		System.out.println("���� ������ ����� "+average+"��");
	}
}
