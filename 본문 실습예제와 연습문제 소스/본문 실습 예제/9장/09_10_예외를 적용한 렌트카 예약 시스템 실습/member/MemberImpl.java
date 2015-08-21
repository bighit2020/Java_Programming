package rent.ex6.member;

import rent.ex6.base.Base;

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
public class MemberImpl extends Base implements Member{
	private String id;         //ȸ�� ���̵�
	private String password;   //ȸ�� ��й�ȣ
	private String name;       //ȸ�� �̸�
	private String address;    //ȸ�� �ּ�
	private String phoneNum;   //ȸ�� ��ȭ��ȣ
	
	//getter and setter
	
	//���ο� ȸ������� �ϴ� �޼ҵ�
	public void regMember() throws MemberException{
		name="ȫ�浿";
		if(name==null || name.equals("")){
			throw new MemberException("�̸��� �ʼ� �Է� �����Դϴ�.");
		}else{
			System.out.println("ȸ�� ��Ͻð�: "+showTime()); //�θ� Ŭ������ showTime �޼ҵ带 ����Ͽ� �޼ҵ� ȣ�� �ð��� ����Ѵ�.
			System.out.println("ȸ�� �����մϴ�.");
		}
	}
	
	//���� ȸ���� ������ ��ȸ�ϴ� �޼ҵ�
	public String viewMember() throws MemberException{
		System.out.println("ȸ�� ��ȸ�ð�: "+showTime());
		return  " ��ȸ�� ȸ�� ����";
	}
	
	//���� ȸ���� ������ �����ϴ� �޼ҵ�
	public void modMember() throws MemberException{
		System.out.println("ȸ�� �����ð�: "+showTime());
		System.out.println("ȸ�� ������ �����մϴ�.");
	}
	
	//���� ȸ���� ������ �����ϴ� �޼ҵ�]
	public void delMember() throws MemberException{
		System.out.println("ȸ�� �����ð�: "+showTime());
		System.out.println("ȸ�� ������ �����մϴ�.");
	}
}




