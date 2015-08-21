package ch8.ex6;

public class StringSortTest {
	public static void main(String[] args) {
		String[] str={"world","hello","love","victory","truth"};
		String temp=null;
		String second=null;
		
		char ch=0;
		int size=0;
		
		for(int i=0; i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				int len1=str[i].length();
				int len2=str[j].length();
					
				if(len1<=len2)
					size=len1;
				else
					size=len2;
				for(int k=0; k<size;k++){
					if(str[i].charAt(k) > str[j].charAt(k)){
						temp=str[i];
						str[i]=str[j];
						str[j]=temp;
						break;
					}else if(str[i].charAt(k) == str[j].charAt(k)){
						continue;
					}else
						break;
					
				}
				
			}
		}
		
		
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
		
	}

}
