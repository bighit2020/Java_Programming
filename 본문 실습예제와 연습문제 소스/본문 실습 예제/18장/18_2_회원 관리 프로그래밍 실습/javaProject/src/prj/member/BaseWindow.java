package prj.member;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.util.ArrayList;
import javax.swing.*;

public class BaseWindow {
	public  JFrame frame;
	public  List guiList;
	public  JPanel p1, p2;
	public  JPanel part1,part2,part3,part4,part5;
	
	public JTextField tId,tName,tHeight,tWeight,tAge;
	public  JButton btnSearch, btnInsert,btnUpdate,btnDelete;
	
	public  JLabel lId,lName,lHeight,lWeight,lAge;
	
	
	protected MemberController memberController;
	
	public BaseWindow(){
		memberController =new MemberControllerImpl();
	}
	//최초 화면 생성 시 회원 조회 기능 메소드
	public void init(){
		ArrayList<MemberVo> lst = new  ArrayList<MemberVo>();
		lst = memberController.listMember();
		guiList.removeAll();
		//조회된 회원 정보를 화면에 보여 준다.
		for(int i=0; i < lst.size();i++){
			MemberVo mem = new MemberVo();
			mem= (MemberVo)lst.get(i);
			
			String id=(String)mem.getId();
			String name= (String)mem.getName();
			int height = mem.getHeight();
			int weight = mem.getWeight();
			int age = (int)mem.getAge();
			
			guiList.add(id+"                         "+
					  name+"                         "+
					  height+"                         "+
					  weight+"                         "+
					  age);
				
		}
		 
		
	}
}
