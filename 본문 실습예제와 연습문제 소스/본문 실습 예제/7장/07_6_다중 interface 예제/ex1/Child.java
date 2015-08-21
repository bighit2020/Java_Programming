package ch7.ex9;

/*
 ITest1과 ITest2를 동시에 implements 하므로 각각의 
 인터페이스에 있는 추상 메소드를 모두 구현해야만 한다.
*/
class Child implements ITest1, ITest2{
	public void func1(){
		System.out.println("func1 메소드 호출");
	}

	public void func2(){
		System.out.println("func2 메소드 호출");
	}
}

