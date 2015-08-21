package rent.ex2.reserve;

/*
 * 소스설명:
 * 파일명:ReserveImpl.java
 * 정의:
 * Reserve 인터페이스를 구현하는 구현 클래스이다.
 * 인터페이스에서 선언된 메소드를 실제 그 기능을 구현하는 클래스이다.
 * 실졔 각각의 추상 메소드의 기능을 구현한다.
 * 
 * 
 */
public class ReserveImpl  implements Reserve{
	//멤버변수 선언
	private String resCarNumber;    //예약한 렌트카 번호
	private  String resDate;        //예약한 날짜
	private String useBeginDate;    //렌크카 사용시작 일자
	private String returnDate;      //렌트카 사용반납일자

	//getters and setters
	
	/*
	 * 렌트카 예약관련 기능을 구현한다.
	 */
	
	//렌트카를 예약한다.
	public void reserveCar(){
		System.out.println("렌트카를 예약한다.");
	}
	
	//예약한 렌트카의 예약정보를 수정한다.
	public void modReserveInfo(){
		System.out.println("렌트카 예약 정보를 수정한다.");
	}
	
	//렌트카 예약정보를 취소한다.
	public void cancelReserveInfo(){
		System.out.println("렌트카 예약을 취소한다.");
	}
}


