package ch7.ex10;


public class MultiTest{

	public static void main(String [ ] args){
		Child c = new Child();

		ITest i = new Child();

		ITest1   i1 = new Child();
		c.test();
		c.func1();
		c.func2();

		System.out.println();

		i.test();
		//i.func1();
		//i.func2();

		i1.func1();

	}
}