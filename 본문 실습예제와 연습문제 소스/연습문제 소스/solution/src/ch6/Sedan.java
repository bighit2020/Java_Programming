package ch6;

public class Sedan  extends Car{
	public Sedan(String carName,int velocity, int wheelNum ){
		carName=super.carName;
		velocity=super.velocity;
		wheelNum=super.wheelNum;
	}
	
	public Sedan(String carName,int velocity, int wheelNum,String owner){
		carName=super.carName;
		velocity=super.velocity;
		wheelNum=super.wheelNum;
		owner=super.owner;
	}
}


