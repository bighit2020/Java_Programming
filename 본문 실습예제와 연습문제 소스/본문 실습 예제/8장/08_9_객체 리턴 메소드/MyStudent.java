package ch8.ex1;

public class MyStudent {
	String name;
	int kor;
	int eng;
	int total;
	
	public MyStudent(){
		
	}
	
	public String toString(){
		String info=name+"�� ��������>>"+
				    " ����:"+kor+
					" ����:"+eng+
					" ����:"+total;
		
		return info;
	}

}
