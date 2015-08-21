package ch10.ex6;

public class GenericTest
{
	public static void  main(String [] args){

		GOrigin<String> t = new GOrigin<String>();
		
		String[] str = {"안녕하세요.","감사합니다.","자바 프로그램밍 실습입니다."};
		 t.set(str);
		 t.getData();

		GOrigin<Integer> t1 = new GOrigin<Integer>();
		
		Integer[] arrayNum = {1,2,3}; 
		 t1.set(arrayNum);
	//	 t1.set(str);  //저장하는 타입이 달라서 에러가 발생한다.
		 t1.getData();

//	 좋은 방법이 아님
		 GOrigin t3  = new GOrigin();
    // GenericOrigin <Object>t3  = new GenericOrigin<Object>();
		 t3.set(str);
		 t3.set(arrayNum);
		 t3.getData();
	}
}



