package rent.ex2.member;
/*
 * �ҽ�����
 * ���ϸ�:Member
 * ����:
 * �¶��� ��Ʈī ���� �ý��ۿ���  Member�������̽���  ȸ���� ���� �⺻���̰� �ٽ����� ������� ������ ó���ϴ� 
 * �����  �߻�޼ҵ�� �����Ѵ�. 
 */
public interface Member {
	//ȸ�� ������ ����ϴ� �޼ҵ�
	public void regMember();
	
	//��ϵ� ȸ���� ������ ��ȸ�ϴ� �޼ҵ�
	public String viewMember();
	
	//��ϵ� ȸ���� ������ �����ϴ� �޼ҵ�
	public void modMember();
	
	//��ϵ� ȸ���� Ż�� �� ȸ�������� �����ϴ� �޼ҵ�
	public void delMember();

}


