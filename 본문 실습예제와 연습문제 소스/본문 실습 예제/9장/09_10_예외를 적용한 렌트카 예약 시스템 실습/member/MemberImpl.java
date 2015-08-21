package rent.ex6.member;

import rent.ex6.base.Base;

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
public class MemberImpl extends Base implements Member{
	private String id;         //회원 아이디
	private String password;   //회원 비밀번호
	private String name;       //회원 이름
	private String address;    //회원 주소
	private String phoneNum;   //회원 전화번호
	
	//getter and setter
	
	//새로운 회원등록을 하는 메소드
	public void regMember() throws MemberException{
		name="홍길동";
		if(name==null || name.equals("")){
			throw new MemberException("이름은 필수 입력 정보입니다.");
		}else{
			System.out.println("회원 등록시간: "+showTime()); //부모 클래스의 showTime 메소드를 사용하여 메소드 호출 시간을 출력한다.
			System.out.println("회원 가입합니다.");
		}
	}
	
	//기존 회원의 정보를 조회하는 메소드
	public String viewMember() throws MemberException{
		System.out.println("회원 조회시간: "+showTime());
		return  " 조회된 회원 정보";
	}
	
	//기존 회원의 정보를 수정하는 메소드
	public void modMember() throws MemberException{
		System.out.println("회원 수정시간: "+showTime());
		System.out.println("회원 정보를 수정합니다.");
	}
	
	//기존 회원의 정보를 삭제하는 메소드]
	public void delMember() throws MemberException{
		System.out.println("회원 삭제시간: "+showTime());
		System.out.println("회원 정보를 삭제합니다.");
	}
}




