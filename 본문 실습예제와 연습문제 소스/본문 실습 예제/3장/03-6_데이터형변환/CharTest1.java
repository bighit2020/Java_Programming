package ch3.ex2;

public class CharTest1 {
	public static void main(String[] args){
		char ch='a';
		int num=97;
		
		//char�� ������ ����ȯ�Ѵ�.
		System.out.println("ch�� ��:"+ch+", �ƽ�Ű �ڵ�:"+(int)ch);
		//������ char�� ����ȯ �Ѵ�.
		System.out.println("num�� ��:"+num+",����:"+(char)num);
		
		//���ڵ� �����̹Ƿ� 1�� ���� �� char�� ����ȯ �ؼ� ����Ѵ�.
		System.out.println("ch+1�� ��: "+(ch+1)+" ,����:"+(char)(ch+1));
		System.out.println("num+1�� ��: "+(num+1)+",����:"+(char)(num+1));
	}

}
