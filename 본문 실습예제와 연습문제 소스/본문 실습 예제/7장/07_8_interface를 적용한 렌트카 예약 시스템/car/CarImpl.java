package rent.ex2.car;
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
public class CarImpl  implements Car{
	
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
	
	//���������� ��ȸ�ϴ� �޼ҵ�
	public String checkCarInfo(){
		System.out.println("��Ʈī ������ ��ȸ�մϴ�.");
		return "��������";
	}
	
	//���ο� ��Ʈī ������ ����ϴ� �޼ҵ�
	public void regCarInfo(){
		System.out.println("������ ����մϴ�.");
	}
	
	//������ ��ϵ� ��Ʈī ������ �����ϴ� �޼ҵ�
	public void modCarInfo(){
		System.out.println("���������� �����մϴ�.");
	}
	
	//������ ��Ʈī ������ �����ϴ� �޼ҵ�
	public void delCarInfo(){
		System.out.println("���������� �����մϴ�.");
	}
}



