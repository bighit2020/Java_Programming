package ch6;

public class Car {
	 int velocity;
	 int wheelNum;
	 String carName;
	 String owner;  //차소유주
	
	 public Car(){
		 System.out.println("Car 객체 생성자 호출");
	 }
	//getters//setters
	public int getVelocity(){
		return velocity;
	}
	
	public void setVelocity(int v){
		velocity=v;
	}
	
	public String getCarName(){
		return carName;
	}
	
	public void setCarName(String c){
		carName=c;
	}
	
	public String getOwner(){
		return owner;
	}
	
	public void setOwner(String o){
		owner=o;
	}
	
	//차량 소유주의 이름을 구하는 메소드
	public void getOwnerInfo(Car car){
		if(car instanceof Sedan){
			//Sedan sedan=(Sedan)car;  //downcasting
			//System.out.println("차 주인의 이름은 " + sedan.getOwner());
			System.out.println("차 주인의 이름은 " + car.getOwner());
		}else if(car instanceof Bus){
			Bus bus=(Bus)car;  //downcasting
			System.out.println("버스 소속회사는 " + bus.getCompany());
		}else if(car instanceof Truck){
			Truck truck=(Truck)car;  //downcasting
			System.out.println("트럭 소속회사는 " + truck.getCompany());
		}
		
	}
	
	
	//차의 기능을 하는 메소드
	public void speedUp(int speed){
		velocity=velocity+speed;
	}
	
	public void speedDown(int speed){
		velocity=velocity-speed;
	}
	
	public void stop(){
		velocity=0;
	}
	
	public String getCarInfo(){
		return carName+"의 속도는 "+velocity;
	}

}
