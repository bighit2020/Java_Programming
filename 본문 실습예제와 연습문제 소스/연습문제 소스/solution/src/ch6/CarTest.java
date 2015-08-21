package ch6;

public class CarTest {
	
	public static void main(String[] args){
		//1.변수 선언
		Sedan myCar;
		 Truck truck;
		 Bus bus;
		
		//2.객체 생성
		myCar=new Sedan("아반테",60,4,"홍길동");
		truck=new Truck("1톤 포터",60,1,"자바 화물");  
		bus =new Bus("1001번 버스",20,800,50,"안전 상운"); 
		
		//3.메소드 호출
		
		myCar.getOwnerInfo(myCar);
		truck.getOwnerInfo(truck);
		bus.getOwnerInfo(bus);
	}
}

