package ch9.ex3;

import java.io.IOException;

public class ArrayUtil{
	 //checked exception 계열은 throws 다음에 생략이 불가능하다.
	public void call()  throws IOException {    
		System.out.println("call 메소드 시작");
 				 int [ ] num = new int[2];
				 num[0] = 1;
				 num[1] = 2;
				 
                if( num.length == 2 ) throw new IOException("배열크기가 2" );
        System.out.println("call 메소드 종료");
	}
}

