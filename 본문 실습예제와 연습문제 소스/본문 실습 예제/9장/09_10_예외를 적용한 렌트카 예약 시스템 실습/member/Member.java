package rent.ex6.member;
/*
 * �ҽ�����
 * ���ϸ�:Member
 * ����:
 * �¶��� ��Ʈī ���� �ý��ۿ���  Member�������̽���  ȸ���� ���� �⺻���̰� �ٽ����� ������� ������ ó���ϴ� 
 * �����  �߻�޼ҵ�� �����Ѵ�. 
 */
public interface Member {
	//ȸ�� ������ ����ϴ� �޼ҵ�
	public void regMember() throws MemberException;
	
	//��ϵ� ȸ���� ������ ��ȸ�ϴ� �޼ҵ�
	public String viewMember() throws MemberException;
	
	//��ϵ� ȸ���� ������ �����ϴ� �޼ҵ�
	public void modMember() throws MemberException;
	
	//��ϵ� ȸ���� Ż�� �� ȸ�������� �����ϴ� �޼ҵ�
	public void delMember() throws MemberException;

}


