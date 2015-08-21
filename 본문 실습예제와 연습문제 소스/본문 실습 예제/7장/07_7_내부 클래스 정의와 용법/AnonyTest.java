package ch7.ex11;

public class AnonyTest {
	
	public void printB(Anony a){
		a.print();
	}

	public static void main(String[] args){
		AnonyTest t=new AnonyTest();
		//Anony 클래스인스턴스는 이 부분에서 일시적으로 사용되어 진다.
		t.printB(new Anony (){
			public void print(){
				System.out.println("익명 클래스 사용 중입니다.");
			}
		});
	}
}
