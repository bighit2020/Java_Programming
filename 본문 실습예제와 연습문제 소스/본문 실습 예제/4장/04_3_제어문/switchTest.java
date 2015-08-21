package ch4.ex1;

public class switchTest {
	public static void main(String[] args) {
		int num=2;
		String name="홍길동";
		
		switch(num){
		case 1:
			System.out.println("num의 값은 "+num);
			break;
		case 2:
			System.out.println("num의 값은 "+num);
			break;			
		
		default:
			System.out.println("일치하는 값이 없습니다.");
		}
		

		switch(name){
		case "홍길동":
			System.out.println("이름은 "+name);
			break;
		case "이순신":
			System.out.println("이름은 "+name);
			break;			
		
		default:
			System.out.println("일치하는 사람이 없습니다.");
		}		

	}

}
