package ch7.ex9;

/*
 ITest1�� ITest2�� ���ÿ� implements �ϹǷ� ������ 
 �������̽��� �ִ� �߻� �޼ҵ带 ��� �����ؾ߸� �Ѵ�.
*/
class Child implements ITest1, ITest2{
	public void func1(){
		System.out.println("func1 �޼ҵ� ȣ��");
	}

	public void func2(){
		System.out.println("func2 �޼ҵ� ȣ��");
	}
}

