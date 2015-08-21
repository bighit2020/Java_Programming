package ch8.ex4;

public class StringEx5 {
	public static void main ( String [ ] args ){
		String str="2012-01-02 13:09:23";
		String[] data=null;
		String[] temp=null;
		String[] date=null;
		String[] time=null;
		
		data=str.split(" "); //공백으로 문자열을 분리해서 배열로 리턴한다.
		for(int i=0;i<data.length;i++){
		//	System.out.println(data[i]);
			temp=data[i].split("-"); //"-"으로 년월일 토큰을 분리한다.
			
			if(temp.length>1){
				date=temp;
				continue;
			}
			
			temp=data[i].split(":"); //":"으로 시분초 토큰을 분리한다.
			if(temp.length>1){
				time=temp;
			}
			
		}
		
		System.out.println(date[0]+"년"+
						   date[1]+"월"+
						   date[2]+"일"+ 
						   " "+
						   time[0]+"시"+
						   time[1]+"분"+
						   time[2]+"초");
		
	}
}
