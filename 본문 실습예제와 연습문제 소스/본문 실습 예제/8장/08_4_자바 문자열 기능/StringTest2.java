package ch8.ex4;

public class StringTest2 {
	public static void main ( String [ ] args ){
		String fluitData="사과 바나나 귤 수박";
		String deptData="인사부,회계부,개발부,관리부";
		String prodData="스마트TV-스마트폰-노트북-태블릿";
		String[] data=null;
		
		data=fluitData.split(" "); //공백으로 문자열을 분리해서 배열로 리턴한다.
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
		
		data=deptData.split(","); //","으로 문자열을 분리해서 배열로 리턴한다.
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
		
		data=prodData.split("-"); //","으로 문자열을 분리해서 배열로 리턴한다.
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}		
	}
}
