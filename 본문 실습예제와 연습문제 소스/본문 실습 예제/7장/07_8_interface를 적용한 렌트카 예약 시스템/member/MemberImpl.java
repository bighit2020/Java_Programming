package rent.ex2.member;

/*
 * 소스 설명
 * 파일명:MemberImpl
 * 정의:
 * Member 인터페이스를 구현하는 구현 클래스이다.
 * 인터페이스에서 선언된 메소드를 실제 그 기능을 구현하는 클래스이다.
 * 같은 클래스 내에서 인터페이스로 분리된 메소드와 다른 메소드를 구분해서 소스의 구조를 
 * 명확하게 하고 가독성을 좋게 해서효율적으로  소스 관리를 할 수 있다. 
 * 
 */
public class MemberImpl  implements Member{
	private String id;         //회원 아이디
	private String password;   //회원 비밀번호
	private String name;       //회원 이름
	private String address;    //회원 주소
	private String phoneNum;   //회원 전화번호
	
	//getter and setter
	
	public void regMember(){
		System.out.println("새 회원을 등록합니다.");
	}
	
	public String  viewMember(){
		System.out.println("회원 정보를 조회합니다.");
		return null;
	}
	
	public void modMember(){
		System.out.println("회원 정보를 수정합니다.");
	}
	
	public void delMember(){
		System.out.println("회원 정보를 삭제합니다.");
	}
}




