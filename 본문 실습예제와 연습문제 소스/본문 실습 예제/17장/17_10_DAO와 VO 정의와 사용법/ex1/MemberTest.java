package ch17.ex3;

import java.util.ArrayList;

public class MemberTest {
	public static void main(String[] args){
		String _name=null;
		//_name="�̼���";
		
		MemberDao dao=new MemberDao();
		ArrayList<MemberVo> list=dao.list();
		//ArrayList<MemberVo> list=dao.list(_name);
		
		for(int i=0; i<list.size();i++){
			MemberVo data=(MemberVo) list.get(i);
			String id=data.getId();
			String name=data.getName();
			int height=data.getHeight();
			int weight=data.getWeight();
			int age=data.getAge();
			
			System.out.println("���̵��>>"+id+
								" �̸���>>"+name+
								" Ű��>>"+height+
								" �����Դ�>>"+weight+
								" ���̴�>>"+age);
		}
	}

}
