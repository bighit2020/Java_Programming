package ch6.ex9;

public class Member {
	private String jumin;
	private String name;
	public String getJumin() {
		//보안 등의 이유로 주민번호를 리턴하기 전에 처리를 해 줄 수 있다.
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
