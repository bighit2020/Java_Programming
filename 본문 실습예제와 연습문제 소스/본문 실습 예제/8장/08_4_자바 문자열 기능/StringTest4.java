package ch8.ex4;

public class StringTest4 {
	public static void main(String [] args){
		String[] str={"hello","world","love","victory","truth"};
		String temp=null;
		
		//문자열을 오름 차순으로  배열에 저장한다.
		for(int i=0; i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].compareTo(str[j])>0){
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		//결과 출력
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
	}
}


