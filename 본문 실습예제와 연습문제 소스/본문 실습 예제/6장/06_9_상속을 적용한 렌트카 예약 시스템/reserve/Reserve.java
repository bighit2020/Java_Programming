package rent.ex2.reserve;

import rent.ex2.base.Base;

public class Reserve  extends Base{
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
	public String reserveCar(){
		System.out.println("��Ʈī ���� �ð� :"+showTime());//�θ� Ŭ������ showTime �޼ҵ带 ����Ͽ� �޼ҵ� ȣ�� �ð��� ����Ѵ�.
		System.out.println("���� �����մϴ�.");
		
		return "������ ����";
	}
	
	//�� ���������� �����ϴ� �޼ҵ�
	public void modReserveInfo(){
		System.out.println("��Ʈī �������� �����ð� :"+showTime());
		System.out.println("���� �����մϴ�.");
	}
	
	//�� ���� ������ ����ϴ� �޼ҵ�
	public void cancelReserveInfo(){
		System.out.println("��Ʈī �������� ���� �ð� :"+showTime());
		System.out.println("���� �����մϴ�.");
	}
}


