package rent.ex6.car;

import rent.ex5.base.Base;

/*
 * �ҽ�����:
 * ���ϸ�:CarImpl.java
 * ����:
 * Car �������̽��� �����ϴ� ���� Ŭ�����̴�.
 * �������̽����� ����� �޼ҵ带 ���� �� ����� �����ϴ� Ŭ�����̴�.
 * ���� ������ �߻� �޼ҵ��� ����� �����Ѵ�.
 * 
 * 
 */
public class CarImpl extends Base  implements Car{
	
	//��Ʈī ���� ������� ����
	private String carNumber;  //����ȣ
	private String carName;    //���̸�
	private String carColor;   //������
	private int carSize;       //��ⷮ
	private String carMaker;   //������
	
	//getters and setters
	
	/*
	 * �������̽���  ����� �߻�޼ҵ带 �����Ѵ�.
	 */
	
	//���� ������ ��ȸ�ϴ� �޼ҵ�
	public String checkCarInfo(){
		System.out.println("��Ʈī ��ȸ �ð� :"+showTime());//�θ� Ŭ������ showTime �޼ҵ带 ����Ͽ� �޼ҵ� ȣ�� �ð��� ����Ѵ�.
		System.out.println("��Ʈī�� ��ȸ�մϴ�.");
		 
		return "��ȸ�� ��Ʈī ����";
	}
	
	//�� ���� ������ ����ϴ� �޼ҵ�
	public void regCarInfo(){
		System.out.println("��Ʈī ��� �ð� :"+showTime());
		System.out.println("��Ʈī�� ��ȸ�մϴ�.");
	}
	
	//���� ������ �����ϴ� �޼ҵ�
	public void modCarInfo(){
		System.out.println("��Ʈī ���� �����ð� :"+showTime());
		System.out.println("��Ʈī�� ��ȸ�մϴ�.");
	}
	
	//���� ������ �����ϴ� �޼ҵ�
	public void delCarInfo(){
		System.out.println("��Ʈī ���� ���� �ð� :"+showTime());
		System.out.println("��Ʈī�� ��ȸ�մϴ�.");
	}
}



