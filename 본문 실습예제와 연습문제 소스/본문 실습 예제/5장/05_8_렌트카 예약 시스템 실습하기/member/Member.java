package rent.ex1.member;

public class Member {
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

	//���ο� ȸ������� �ϴ� �޼ҵ�
	public void regMember(){
		System.out.println("ȸ�� �����մϴ�.");
	}
	
	//���� ȸ���� ������ ��ȸ�ϴ� �޼ҵ�
	public String viewMemeber(){
		return null;
	}
	
	//���� ȸ���� ������ �����ϴ� �޼ҵ�
	public void modMember(){
		
	}
	
	//���� ȸ���� ������ �����ϴ� �޼ҵ�]
	public void delMember(){
		
	}
	

}
