package ch8.ex4;

public class StringTest4 {
	public static void main(String [] args){
		String[] str={"hello","world","love","victory","truth"};
		String temp=null;
		
		//���ڿ��� ���� ��������  �迭�� �����Ѵ�.
		for(int i=0; i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].compareTo(str[j])>0){
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		//��� ���
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
	}
}


