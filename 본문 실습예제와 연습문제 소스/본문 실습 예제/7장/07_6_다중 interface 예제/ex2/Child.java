package ch7.ex10;
/*
�� �������̽��� ��ӹ��� Ŭ���� Child����
�� �������̽��� �ִ� �޼ҵ� �ΰ��� �������Ͽ� ����ϰ� �ֽ��ϴ�.
*/


class Child implements ITest1, ITest2{
	public void test() { 
		System.out.println("test() �޼ҵ� ȣ��");
	}

	public void func1(){
		System.out.println("func1 ȣ��");
	}

	public void func2(){
		System.out.println("func2 ȣ��");
	}

}