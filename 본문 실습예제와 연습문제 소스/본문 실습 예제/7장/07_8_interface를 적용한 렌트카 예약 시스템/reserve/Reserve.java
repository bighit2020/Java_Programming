package rent.ex2.reserve;
/*
 * �ҽ�����:
 * ���ϸ�:Car.java
 * ����:
 * �¶��� ��Ʈī ���� �ý��ۿ��� ȸ���� ��Ʈī ���� ���� �⺻���̰� �ٽ����� ����� �ϴ� �߻�޼ҵ带 �����Ѵ�.
 * 
 */
public interface Reserve {
	//��Ʈī ���� ����� �ϴ� �޼ҵ�
	public void reserveCar();
	
	//����� ��Ʈī ������ �����ϴ� �޼ҵ�
	public void modReserveInfo();
	
	//����� ��Ʈī ������ �����ϴ� �޼ҵ�
	public void cancelReserveInfo();
}



