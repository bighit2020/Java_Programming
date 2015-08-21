package ch7.ex1a;

public class MessageTest {
	public static void main(String[] args){
		System.out.println("프로그램을 시작합니다.!");
		Message m=new Message();  //이 부분에서 Hello 인스턴스가 동적으로 메모리에 생성된다.
		m.getMessage();
	}

}


