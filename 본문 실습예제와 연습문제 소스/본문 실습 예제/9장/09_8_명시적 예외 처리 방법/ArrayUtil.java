package ch9.ex3;

import java.io.IOException;

public class ArrayUtil{
	 //checked exception �迭�� throws ������ ������ �Ұ����ϴ�.
	public void call()  throws IOException {    
		System.out.println("call �޼ҵ� ����");
 				 int [ ] num = new int[2];
				 num[0] = 1;
				 num[1] = 2;
				 
                if( num.length == 2 ) throw new IOException("�迭ũ�Ⱑ 2" );
        System.out.println("call �޼ҵ� ����");
	}
}

