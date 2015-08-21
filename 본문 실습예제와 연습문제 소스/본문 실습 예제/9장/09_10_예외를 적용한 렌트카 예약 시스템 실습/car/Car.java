package rent.ex6.car;
/*
 * 소스설명:
 * 파일명:Car.java
 * 정의:
 * 온라인 렌트카 예약 시스템에서 렌트카에 대한 기본적이고 핵심적인 기능을 하는 추상메소드를 선언한다.
 * 
 */
public interface Car {
	
	//렌트카 정보를 조회하는 메소드
	public String checkCarInfo();
	
	//새로운 렌트카를 등록하는 메소드
	public void regCarInfo();
	
	//기존의 렌트카 정보를 수정하는 메소드
	public void modCarInfo();
	
	//기존에 등록된 렌트카 정보를 삭제하는 메소드
	public void delCarInfo();
}

