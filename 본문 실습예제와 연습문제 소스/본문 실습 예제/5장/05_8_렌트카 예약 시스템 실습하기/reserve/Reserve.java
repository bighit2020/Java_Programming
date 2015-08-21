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
	

	//차를 예약하는 기능을 하는 메소드
	public void reserveCar(){
		System.out.println("차를 예약합니다.");
	}
	
	//차 예약정보를 수정하는 메소드
	public void modReserveInfo(){
		
	}
	
	//차 예약 정보를 취소하는 메소드
	public void cancelReserveInfo(){
		
	}
	

}
