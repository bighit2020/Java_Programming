package rent.ex6.car;
/*
 * �ҽ�����:
 * ���ϸ�:Car.java
 * ����:
 * �¶��� ��Ʈī ���� �ý��ۿ��� ��Ʈī�� ���� �⺻���̰� �ٽ����� ����� �ϴ� �߻�޼ҵ带 �����Ѵ�.
 * 
 */
public interface Car {
	
	//��Ʈī ������ ��ȸ�ϴ� �޼ҵ�
	public String checkCarInfo();
	
	//���ο� ��Ʈī�� ����ϴ� �޼ҵ�
	public void regCarInfo();
	
	//������ ��Ʈī ������ �����ϴ� �޼ҵ�
	public void modCarInfo();
	
	//������ ��ϵ� ��Ʈī ������ �����ϴ� �޼ҵ�
	public void delCarInfo();
}

