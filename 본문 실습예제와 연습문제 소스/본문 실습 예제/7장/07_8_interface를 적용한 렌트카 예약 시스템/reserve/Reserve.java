package rent.ex2.reserve;
/*
 * 소스설명:
 * 파일명:Car.java
 * 정의:
 * 온라인 렌트카 예약 시스템에서 회원이 렌트카 예약 대한 기본적이고 핵심적인 기능을 하는 추상메소드를 선언한다.
 * 
 */
public interface Reserve {
	//렌트카 예약 기능을 하는 메소드
	public void reserveCar();
	
	//예약된 렌트카 정보를 수정하는 메소드
	public void modReserveInfo();
	
	//예약된 렌트카 정보를 삭제하는 메소드
	public void cancelReserveInfo();
}



