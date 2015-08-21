package ch9;

public class CarTest {

	 static void speedUp(Car car,int speed) throws TrafficException{
		 int total_speed=car.getVelocity()+speed;
		 
		 if(total_speed <=50 || total_speed >100)
			 throw new TrafficException("속도 위반입니다.");
		 else
			 car.setVelocity(total_speed);
	}
	
	
	public static void main(String[] args) {
		Car myCar=new Car("소나타",60);
		Car yourCar=new Car("제너시스",60);
		
		try{
			speedUp(myCar,100);
			System.out.println("dd");
		}catch(TrafficException te){
			System.out.println(te.getViolationMessage());
		}catch(Exception e){
			System.out.println(e.getStackTrace());
		}

	}

}
