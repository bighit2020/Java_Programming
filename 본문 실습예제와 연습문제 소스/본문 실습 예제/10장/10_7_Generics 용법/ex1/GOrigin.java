package ch10.ex6;
/*
  Ŭ���� ��ü ���� �� ����ڰ� ���� Ÿ���� ������ �� �ִ�.

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

