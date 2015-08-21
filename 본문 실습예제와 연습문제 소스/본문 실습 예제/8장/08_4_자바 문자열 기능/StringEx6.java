package ch8.ex4;

public class StringEx6 {
	public static String[] parseVoca(String str,String delimiter){
		String [] token =null;
		token=str.split(delimiter);
		return token;
	}
	
	public static void main(String [ ] args){
		String fruitData="사과 바나나 귤 수박";
		String deptData="인사부,회계부,개발부,관리부";
		String prodData="스마트TV-스마트폰-노트북-태블릿";
		
		String data[]=null;
		//메소드 호출
		data=parseVoca(fruitData," ");
		
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
		
		data=parseVoca(deptData,",");
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}

		data=parseVoca(prodData, "-");
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
	}

}
