package rent.ex2.reserve;

/*
 * �ҽ�����:
 * ���ϸ�:ReserveImpl.java
 * ����:
 * Reserve �������̽��� �����ϴ� ���� Ŭ�����̴�.
 * �������̽����� ����� �޼ҵ带 ���� �� ����� �����ϴ� Ŭ�����̴�.
 * ���� ������ �߻� �޼ҵ��� ����� �����Ѵ�.
 * 
 * 
 */
public class ReserveImpl  implements Reserve{
	//������� ����
	private String resCarNumber;    //������ ��Ʈī ��ȣ
	private  String resDate;        //������ ��¥
	private String useBeginDate;    //��ũī ������ ����
	private String returnDate;      //��Ʈī ���ݳ�����

	//getters and setters
	
	/*
	 * ��Ʈī ������� ����� �����Ѵ�.
	 */
	
	//��Ʈī�� �����Ѵ�.
	public void reserveCar(){
		System.out.println("��Ʈī�� �����Ѵ�.");
	}
	
	//������ ��Ʈī�� ���������� �����Ѵ�.
	public void modReserveInfo(){
		System.out.println("��Ʈī ���� ������ �����Ѵ�.");
	}
	
	//��Ʈī ���������� ����Ѵ�.
	public void cancelReserveInfo(){
		System.out.println("��Ʈī ������ ����Ѵ�.");
	}
}


