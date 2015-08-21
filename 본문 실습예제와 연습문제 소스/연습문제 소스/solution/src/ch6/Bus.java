package ch6;

public class Bus extends Car {
	private int passenger;  //버스 승객 수
	private int fee ;  //버스 요금
	private String company;  //버스 소속회사
	
	
	//생성자
	public Bus(String carName,int passenger,int fee, int velocity){
		System.out.println("Bus 생성자 호출");
		carName=super.carName;
		velocity=super.velocity;
		passenger=this.passenger;
		fee=this.fee;
	}

	public Bus(String carName,int velocity,int passenger,int fee, String company){
		System.out.println("Bus 생성자 호출");
		carName=super.carName;
		velocity=super.velocity;
		passenger=this.passenger;
		fee=this.fee;
		company=this.company;
	}
		
	//getters and setters
	public int getPassenger(){
		return passenger;
	}
	
	public int getFee(){
		return fee;
	}
	
	public void setPassenger(int p){
		passenger=p;
	}
	
	public void setFee(int f){
		fee=f;
	}
	
	public String getCompany(){
		return company;
	}
	
	public void setCompany(String c){
		company=c;
	}
	
	//승객을 태우는 기능
	public void ridePassenger(){
		if(passenger>0)
			System.out.println("승객을 태웁니다.");
		
	}
	//overriding 메소드
	public String getCarInfo(){
		System.out.println("overriding 메소드 호출");
		return carName+"의 속도는 "+velocity + " 이고 " + " 버스 승객수는  "+passenger+ " 명이고, 버스 요금은 " +fee+ "원 입니다.";
	}
}



