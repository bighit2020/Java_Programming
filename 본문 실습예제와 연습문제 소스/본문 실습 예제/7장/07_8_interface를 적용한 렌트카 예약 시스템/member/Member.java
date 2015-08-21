package rent.ex2.member;
/*
 * 소스설명
 * 파일명:Member
 * 정의:
 * 온라인 렌트카 예약 시스템에서  Member인터페이스에  회원에 관한 기본적이고 핵심적인 비즈니즈 로직를 처리하는 
 * 기능을  추상메소드로 선언한다. 
 */
public interface Member {
	//회원 정보를 등록하는 메소드
	public void regMember();
	
	//등록된 회원의 정보를 조회하는 메소드
	public String viewMember();
	
	//등록된 회원의 정보를 수정하는 메소드
	public void modMember();
	
	//등록된 회원이 탈퇴 시 회원정보를 삭제하는 메소드
	public void delMember();

}


