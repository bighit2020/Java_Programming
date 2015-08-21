package ch10.ex6;
/*
  클래스 객체 생성 시 사용자가 저장 타입을 지정할 수 있다.

*/

public class GOrigin<T>
{
	T[] arrData;

	public void set(T[] n){
		arrData=n;
	}

	public void getData(){
		for(int i=0 ; i < arrData.length;i++){
			System.out.println(arrData[i]);
		}

	}
}

