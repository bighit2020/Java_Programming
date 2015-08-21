package rent.ex2.car;
/*
 * 소스설명:
 * 파일명:CarImpl.java
 * 정의:
 * Car 인터페이스를 구현하는 구현 클래스이다.
 * 인터페이스에서 선언된 메소드를 실제 그 기능을 구현하는 클래스이다.
 * 실졔 각각의 추상 메소드의 기능을 구현한다.
 * 
 * 
 */
public class CarImpl  implements Car{
	
	//렌트카 관련 멤버변수 선언
	private String carNumber;  //차번호
	private String carName;    //차이름
	private String carColor;   //차색상
	private int carSize;       //배기량
	private String carMaker;   //제조사
	
	//getters and setters
	
	/*
	 * 인터페이스에  선언된 추상메소드를 구현한다.
	 */
	
	//차량정보를 조회하는 메소드
	public String checkCarInfo(){
		System.out.println("렌트카 정보를 조회합니다.");
		return "차량정보";
	}
	
	//새로운 렌트카 정보를 등록하는 메소드
	public void regCarInfo(){
		System.out.println("차량을 등록합니다.");
	}
	
	//기존에 등록된 렌트카 정보를 수정하는 메소드
	public void modCarInfo(){
		System.out.println("차량정보를 수정합니다.");
	}
	
	//기존의 렌트카 정보를 삭제하는 메소드
	public void delCarInfo(){
		System.out.println("차량정보를 삭제합니다.");
	}
}



