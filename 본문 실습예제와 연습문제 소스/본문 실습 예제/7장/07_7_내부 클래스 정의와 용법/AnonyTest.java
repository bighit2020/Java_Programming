package ch7.ex11;

public class AnonyTest {
	
	public void printB(Anony a){
		a.print();
	}

	public static void main(String[] args){
		AnonyTest t=new AnonyTest();
		//Anony Ŭ�����ν��Ͻ��� �� �κп��� �Ͻ������� ���Ǿ� ����.
		t.printB(new Anony (){
			public void print(){
				System.out.println("�͸� Ŭ���� ��� ���Դϴ�.");
			}
		});
	}
}
