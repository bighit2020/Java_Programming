package ch5.ex1;


public class Car{

	int velocity;  //접근자를 생략하면 default이다. 
    int wheelNum;
	String carName;
/*
  	private int velocity;
    private	int wheelNum;
	private String carName;

*/
	//getter메소드
	public int getVelocity(){
		return velocity;
	}

	public int getWheelNum(){
		return wheelNum;
	}

	public String getCarName(){
		return carName;
	}

	//setter메소드
	public  void setVelocity(int v){
		velocity = v;
	}

	public void setWheelNum(int w){
		wheelNum = w;
	}

	public void setCarName(String c){
		carName= c;
	}


	//속도를 높인다.
	//멤버변수 velocity에 1을 더해주는 동작을한다.
	public void speedUp(){
		velocity = velocity + 1;
	}

	//속도를 낮춘다.
	public void speedDown(){
		velocity =velocity -1;
		if(velocity < 0)
			velocity =0;
	}

	//멈춘다.
	public void stop(){
		velocity =0;
	}


}