package rent.ex2.member;

import rent.ex2.base.Base;

public class Member extends Base{
	private String id;
	private String password;
	private String name;
	private String address;
	private String phoneNum;
	
	//getters/setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	//새로운 회원등록을 하는 메소드
	public void regMember(){
		System.out.println("회원 등록시간: "+showTime()); //부모 클래스의 showTime 메소드를 사용하여 메소드 호출 시간을 출력한다.
		System.out.println("회원 가입합니다.");
	}
	
	//기존 회원의 정보를 조회하는 메소드
	public String viewMemeber(){
		System.out.println("회원 조회시간: "+showTime());
		return  " 조회된 회원 정보";
	}
	
	//기존 회원의 정보를 수정하는 메소드
	public void modMember(){
		System.out.println("회원 수정시간: "+showTime());
		System.out.println("회원 정보를 수정합니다.");
	}
	
	//기존 회원의 정보를 삭제하는 메소드]
	public void delMember(){
		System.out.println("회원 삭제시간: "+showTime());
		System.out.println("회원 정보를 삭제합니다.");
	}
	

}
