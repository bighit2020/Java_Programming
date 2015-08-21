package ch4;

public class ArrayTest {
	public static void main(String[ ] args){
		int[] num ;
		String [] name ;

		//배열생성
		num = new int[3];
		name = new String[2];

		//배열초기화, 초기화 하지않으면 0이 할당된다.

		num[0]=1;
		num[1]=2;
		num[2]=3;
		//배열요소에는 같은 타입의 데이터만 저장가능하다.
		//num[2]="홍길동";
		
		//에러 발생 생성된 배열 요소보다 큰 요소에 값을 할당할 수 없다.
		//num[3]=4;
		

		name[0] = "홍길동";
		name[1]="이순신";
		//name[2] = "박지성"; 에러 발생

		System.out.println("num배열의 개수 : " + num.length);

		for(int i=0; i<num.length; i++){
			System.out.println("num:" + num[i]);
		}

		System.out.println("name 배열의 개수 : " + name.length);
		for(int i=0; i<name.length;i++){
			System.out.println("name: " + name[i]);
		}




	}
}
