package ch8.ex4;

public class StringEx5 {
	public static void main ( String [ ] args ){
		String str="2012-01-02 13:09:23";
		String[] data=null;
		String[] temp=null;
		String[] date=null;
		String[] time=null;
		
		data=str.split(" "); //�������� ���ڿ��� �и��ؼ� �迭�� �����Ѵ�.
		for(int i=0;i<data.length;i++){
		//	System.out.println(data[i]);
			temp=data[i].split("-"); //"-"���� ����� ��ū�� �и��Ѵ�.
			
			if(temp.length>1){
				date=temp;
				continue;
			}
			
			temp=data[i].split(":"); //":"���� �ú��� ��ū�� �и��Ѵ�.
			if(temp.length>1){
				time=temp;
			}
			
		}
		
		System.out.println(date[0]+"��"+
						   date[1]+"��"+
						   date[2]+"��"+ 
						   " "+
						   time[0]+"��"+
						   time[1]+"��"+
						   time[2]+"��");
		
	}
}
