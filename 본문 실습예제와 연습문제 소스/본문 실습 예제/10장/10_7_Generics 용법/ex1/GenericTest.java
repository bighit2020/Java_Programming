package ch10.ex6;

public class GenericTest
{
	public static void  main(String [] args){

		GOrigin<String> t = new GOrigin<String>();
		
		String[] str = {"�ȳ��ϼ���.","�����մϴ�.","�ڹ� ���α׷��� �ǽ��Դϴ�."};
		 t.set(str);
		 t.getData();

		GOrigin<Integer> t1 = new GOrigin<Integer>();
		
		Integer[] arrayNum = {1,2,3}; 
		 t1.set(arrayNum);
	//	 t1.set(str);  //�����ϴ� Ÿ���� �޶� ������ �߻��Ѵ�.
		 t1.getData();

//	 ���� ����� �ƴ�
		 GOrigin t3  = new GOrigin();
    // GenericOrigin <Object>t3  = new GenericOrigin<Object>();
		 t3.set(str);
		 t3.set(arrayNum);
		 t3.getData();
	}
}



