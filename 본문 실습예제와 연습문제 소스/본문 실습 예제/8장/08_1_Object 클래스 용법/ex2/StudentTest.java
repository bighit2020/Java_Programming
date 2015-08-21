package ch8.ex2;


public class StudentTest {
	public static void main(String [ ] args){
		MyStudent s = new MyStudent("이순신", 24);
		MyStudent s2 = new MyStudent("이순신", 24);

		if(s == s2){
			System.out.println("두 학생의 이름과 나이는 같습니다.");
		}else{
			System.out.println("두 학생의 이름과 나이는 다릅니다.");
		}

		if(s.equals(s2)){
			System.out.println("두 학생의 이름과 나이는 같습니다.");
		}else{
			System.out.println("두 학생의 이름과 나이는 다릅니다.");
		}
	}

}
