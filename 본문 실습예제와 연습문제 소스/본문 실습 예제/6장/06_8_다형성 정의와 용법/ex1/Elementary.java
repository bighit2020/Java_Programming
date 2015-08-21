package ch6.ex10;

public class Elementary extends Student {
	
	public Elementary(String name, int grade,int point){
		super.name=name;
		super.grade=grade;
		
	}
	
	public Elementary(String name, int grade){
		super.name=name;
		super.grade=grade;
	}
	
	public Elementary(){
		this("ÀÌ¼ø½Å",3);
	}

}
