package ch4;

public class Loopmoon6 {
	public static void main(String[ ] args){
	// ����for��
		for(int i=0; i<5; i++){  
			System.out.println("i= " + i);
			for(int j=0; j<5; j++){
				if(j==2) continue; //����for���� ���������� �̵��Ѵ�.
				System.out.println("j= " + j);
			}
				System.out.println();
		}
	}
}


