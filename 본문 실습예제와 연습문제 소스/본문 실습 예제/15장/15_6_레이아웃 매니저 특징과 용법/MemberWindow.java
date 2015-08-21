package ch15.ex1;

import java.awt.*;

public class MemberWindow extends BaseWindow {
	MemberWindow(){
		System.out.println("생성자 호출");		
		
		frame =new Frame("회원관리창");
		lId=new Label("아이디",Label.RIGHT);
		lName=new Label("이름",Label.RIGHT);
		lHeight=new Label("키",Label.RIGHT);
		lWeight = new Label("몸무게",Label.RIGHT);
		lAge  = new Label("나이",Label.RIGHT);
		
		lId.setAlignment(Label.CENTER);
		lName.setAlignment(Label.CENTER);
		lHeight.setAlignment(Label.CENTER);
		lWeight.setAlignment(Label.CENTER);
		lAge.setAlignment(Label.CENTER);
		
		tId =new TextField();
		tName =new TextField();
		tHeight=new TextField();
		tWeight = new TextField();
		tAge = new TextField();
		
		guiList = new List(2, false); 
		guiList.setBackground(Color.green);
		
		btnSearch = new Button("조회");
		btnInsert = new Button("추가");
		btnUpdate = new Button("수정");
		btnDelete = new Button("삭제");
		
				
	}
	
	public void startGUI(){
		part1 = new Panel();
		part1.setLayout(new GridLayout(1,0));
		part1.add(lId);		
		part1.add(tId);
		
		part2 = new Panel();
		part2.setLayout(new GridLayout(1,0));
		part2.add(lName);
		part2.add(tName);
		
		part3= new Panel();
		part3.setLayout(new GridLayout(1,0));
		part3.add(lHeight);
		part3.add(tHeight);
		
		part4= new Panel();
		part4.setLayout(new GridLayout(1,0));
		part4.add(lWeight);
		part4.add(tWeight);
		
		part5 = new Panel();
		part5.setLayout(new GridLayout(1,0));
		part5.add(lAge);
		part5.add(tAge);
		
		p1 = new Panel();
		p1.setLayout(new GridLayout(0,1));
		p1.add(part1);
		p1.add(part2);
		p1.add(part3);
		p1.add(part4);
		p1.add(part5);
		
		
		p2 = new Panel();
		 
		p2.add(btnSearch);
		p2.add(btnInsert);
		p2.add(btnUpdate);
		p2.add(btnDelete);
		
		

		
		frame.add(p1,"North");
		frame.add(guiList,"Center");
		frame.add(p2,"South");
		
		frame.setSize(500,500);
		frame.setVisible(true);
		
		
	}
	
	
	public static void main(String args[]){
		MemberWindow  window  = new MemberWindow();
		window .startGUI();
	}
}
