package rent.ex1.reserve;

public class Reserve {
	private String id;
	private String resCarNumber;
	private String resDate;
	private String useBeginDate;
	private String returnDate;
	
	//getter/setter
	public String getResCarNumber() {
		return resCarNumber;
	}
	public void setResCarNumber(String resCarNumber) {
		this.resCarNumber = resCarNumber;
	}
	public String getResDate() {
		return resDate;
	}
	public void setResDate(String resDate) {
		this.resDate = resDate;
	}
	public String getUseBeginDate() {
		return useBeginDate;
	}
	public void setUseBeginDate(String useBeginDate) {
		this.useBeginDate = useBeginDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	

	//���� �����ϴ� ����� �ϴ� �޼ҵ�
	public void reserveCar(){
		System.out.println("���� �����մϴ�.");
	}
	
	//�� ���������� �����ϴ� �޼ҵ�
	public void modReserveInfo(){
		
	}
	
	//�� ���� ������ ����ϴ� �޼ҵ�
	public void cancelReserveInfo(){
		
	}
	

}
