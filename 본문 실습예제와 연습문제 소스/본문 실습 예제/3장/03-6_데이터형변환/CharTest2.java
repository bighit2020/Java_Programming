package ch3.ex2;

public class CharTest2 {
	public static void main(String[] args) {
		char ch1='h'; //�ƽ�Ű �ڵ尪:104
		char ch2='e';  //101
		char ch3='l';  //108
		char ch4='l';  //108
		char ch5='o';  //111
		
		//�� ������ �ƽ�Ű �ڵ尪�� ���� �� �������� ����Ѵ�.
		System.out.println(ch1+ch2+ch3+ch4+ch5);
		
		//���ڸ� ����Ѵ�.
		System.out.println((ch1)+""+(ch2)+""+ch3+""+ch4+""+ch5);
		//�ҹ��ڿ� 32�� �� �� �빮�ڷ� ��ȯ�ؼ� ����Ѵ�.
		System.out.println((char)(ch1-32)+""+
						   (char)(ch2-32)+""+
						   (char)(ch3-32)+""+
						   (char)(ch4-32)+""+
						   (char)(ch5-32));

	}

}
