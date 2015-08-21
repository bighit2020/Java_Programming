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
	

	//차를 예약하는 기능을 하는 메소드
	public String reserveCar(){
		System.out.println("렌트카 예약 시간 :"+showTime());//부모 클래스의 showTime 메소드를 사용하여 메소드 호출 시간을 출력한다.
		System.out.println("차를 예약합니다.");
		
		return "예약차 정보";
	}
	
	//차 예약정보를 수정하는 메소드
	public void modReserveInfo(){
		System.out.println("렌트카 예약정보 수정시간 :"+showTime());
		System.out.println("차를 예약합니다.");
	}
	
	//차 예약 정보를 취소하는 메소드
	public void cancelReserveInfo(){
		System.out.println("렌트카 예약정보 삭제 시간 :"+showTime());
		System.out.println("차를 예약합니다.");
	}
}


