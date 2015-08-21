package prj.member;

import java.util.ArrayList;

public interface MemberDAO {
	//ȸ�� ���� ��ȸ�ϴ� �޼ҵ�
	public ArrayList<MemberVo> listMember();
	
	//ȸ�� ���� �߰��ϴ� �޼ҵ�
	public void insertMember(MemberVo mem);
	
	//ȸ�� ���� �����ϴ� �޼ҵ�
	public void updateMember(MemberVo mem);
	
	//ȸ�� ���� �����ϴ� �޼ҵ�
	public void deleteMember(MemberVo mem);
}


