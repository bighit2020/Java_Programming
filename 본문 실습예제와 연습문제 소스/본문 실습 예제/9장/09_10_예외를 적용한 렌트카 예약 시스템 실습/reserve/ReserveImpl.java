package rent.ex6.reserve;

import rent.ex5.base.Base;

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
public class ReserveImpl extends Base implements Reserve{
	//������� ����
	private String resCarNumber;    //������ ��Ʈī ��ȣ
	private  String resDate;        //������ ��¥
	private String useBeginDate;    //��ũī ������ ����
	private String returnDate;      //��Ʈī ���ݳ�����

	//getters and setters
	
	/*
	 * ��Ʈī ������� ����� �����Ѵ�.
	 */
	

	//���� �����ϴ� ����� �ϴ� �޼ҵ�
	public String reserveCar(){
		System.out.println("��Ʈī ���� �ð� :"+showTime());//�θ� Ŭ������ showTime �޼ҵ带 ����Ͽ� �޼ҵ� ȣ�� �ð��� ����Ѵ�.
		System.out.println("���� �����մϴ�.");
		
		return "������ ����";
	}
	
	//�� ���������� �����ϴ� �޼ҵ�
	public void modReserveInfo(){
		System.out.println("��Ʈī �������� �����ð� :"+showTime());
		System.out.println("���� �����մϴ�.");
	}
	
	//�� ���� ������ ����ϴ� �޼ҵ�
	public void cancelReserveInfo(){
		System.out.println("��Ʈī �������� ���� �ð� :"+showTime());
		System.out.println("���� �����մϴ�.");
	}
}


