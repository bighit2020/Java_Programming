package ch8.ex4;

public class StringMethodTest{
	public static void main(String [] args){
		String s = "Hello World";
		
		System.out.println(s.concat(" and Java!!"));	// ���ڿ� ����
		System.out.println(s.replace('o','c'));	// ���� �ٲ�
		System.out.println(s.substring(2,4));	// �κп� ���(����°���ں��� �׹�° ���ڻ����� ���ڿ��� ���)
		System.out.println(s.toLowerCase());	// �ҹ��ڷ� �ٲ�
		System.out.println(s.toUpperCase());	// �빮�ڷ� �ٲ�
		System.out.println("Hello World".toUpperCase());
		System.out.println(s.endsWith("World"));	// ������ ���ڿ� ��
	
		System.out.println(s.charAt(3));		//  �ε����� �� �´� ���� ���
		System.out.println(s.length());			//  ���ڿ� ����
		System.out.println("hello world".length());
		System.out.println(s);					//"hello world"���ڿ��� ������� �ʴ´�.
		System.out.println(s.indexOf("o"));		//���ڿ����� ù��° o��  �ε����� ��� 
		System.out.println(s.indexOf("a"));		
		
		System.out.println(s.lastIndexOf("o"));	
		
		//���ڿ��� ���ڸ� ����Ѵ�.
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			System.out.println(ch);
		}

	}
}

