package ch3.ex3;

public class TempTest {
	public static void main(String[] args) {
		int BASE=32;
		float celsius=0f,fahrenheit=0f;
		
		fahrenheit=100;
		//ȭ�� �µ��� ���� �µ��� ��ȯ�Ѵ�.
		celsius=(fahrenheit-BASE)*5.0f/9.0f;
		
		System.out.println("ȭ�� "+fahrenheit+"���� ���� ������ "+celsius+"���Դϴ�.");
		
		//���� �µ��� ȭ�� �µ��� ��ȯ�Ѵ�.
		fahrenheit=celsius*9.0f/5.0f +BASE;
		System.out.println("���� "+celsius+"���� ���� ȭ���� "+fahrenheit+"���Դϴ�.");
		
		
	}

}
