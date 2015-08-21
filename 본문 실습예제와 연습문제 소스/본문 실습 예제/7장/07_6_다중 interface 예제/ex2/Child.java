package ch7.ex10;
/*
두 인터페이스를 상속받은 클래스 Child에서
두 인터페이스에 있던 메소드 두개를 재정의하여 사용하고 있습니다.
*/


class Child implements ITest1, ITest2{
	public void test() { 
		System.out.println("test() 메소드 호출");
	}

	public void func1(){
		System.out.println("func1 호출");
	}

	public void func2(){
		System.out.println("func2 호출");
	}

}