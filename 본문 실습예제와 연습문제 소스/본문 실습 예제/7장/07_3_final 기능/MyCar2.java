/*
  �޼��带  final�� ������ ���
*/
package ch7.ex3;

public class MyCar2{
	protected  int velocity ;
	public MyCar2(){
		System.out.println("MyCar2 ������ ȣ��");
	}

	public  final void speedUp(){
		velocity++;
	}
}


