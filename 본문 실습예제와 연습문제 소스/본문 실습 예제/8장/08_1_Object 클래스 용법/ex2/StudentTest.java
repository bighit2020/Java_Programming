package ch8.ex2;


public class StudentTest {
	public static void main(String [ ] args){
		MyStudent s = new MyStudent("�̼���", 24);
		MyStudent s2 = new MyStudent("�̼���", 24);

		if(s == s2){
			System.out.println("�� �л��� �̸��� ���̴� �����ϴ�.");
		}else{
			System.out.println("�� �л��� �̸��� ���̴� �ٸ��ϴ�.");
		}

		if(s.equals(s2)){
			System.out.println("�� �л��� �̸��� ���̴� �����ϴ�.");
		}else{
			System.out.println("�� �л��� �̸��� ���̴� �ٸ��ϴ�.");
		}
	}

}
