package rent.ex2.member;

/*
 * �ҽ� ����
 * ���ϸ�:MemberImpl
 * ����:
 * Member �������̽��� �����ϴ� ���� Ŭ�����̴�.
 * �������̽����� ����� �޼ҵ带 ���� �� ����� �����ϴ� Ŭ�����̴�.
 * ���� Ŭ���� ������ �������̽��� �и��� �޼ҵ�� �ٸ� �޼ҵ带 �����ؼ� �ҽ��� ������ 
 * ��Ȯ�ϰ� �ϰ� �������� ���� �ؼ�ȿ��������  �ҽ� ������ �� �� �ִ�. 
 * 
 */
public class MemberImpl  implements Member{
	private String id;         //ȸ�� ���̵�
	private String password;   //ȸ�� ��й�ȣ
	private String name;       //ȸ�� �̸�
	private String address;    //ȸ�� �ּ�
	private String phoneNum;   //ȸ�� ��ȭ��ȣ
	
	//getter and setter
	
	public void regMember(){
		System.out.println("�� ȸ���� ����մϴ�.");
	}
	
	public String  viewMember(){
		System.out.println("ȸ�� ������ ��ȸ�մϴ�.");
		return null;
	}
	
	public void modMember(){
		System.out.println("ȸ�� ������ �����մϴ�.");
	}
	
	public void delMember(){
		System.out.println("ȸ�� ������ �����մϴ�.");
	}
}




