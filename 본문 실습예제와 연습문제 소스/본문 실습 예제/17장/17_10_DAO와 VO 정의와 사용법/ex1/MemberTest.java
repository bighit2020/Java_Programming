package ch17.ex3;

import java.util.ArrayList;

public class MemberTest {
	public static void main(String[] args){
		String _name=null;
		//_name="이순신";
		
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
			
			System.out.println("아이디는>>"+id+
								" 이름은>>"+name+
								" 키는>>"+height+
								" 몸무게는>>"+weight+
								" 나이는>>"+age);
		}
	}

}
