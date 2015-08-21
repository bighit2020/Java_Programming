/*
  메서드를  final로 선언할 경우
*/
package ch7.ex3;

public class MyCar2{
	protected  int velocity ;
	public MyCar2(){
		System.out.println("MyCar2 생성자 호출");
	}

	public  final void speedUp(){
		velocity++;
	}
}


