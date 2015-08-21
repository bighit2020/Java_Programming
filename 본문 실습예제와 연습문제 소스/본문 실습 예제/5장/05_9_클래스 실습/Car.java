package ch5.ex6;

public class Car{
	private String carName;
	private String carColor;
    private int carSize ;
	private int velocity;
	
	public String  getCarName(){
		return carName;
	}
	public void setCarName(String _name){
		carName=_name;
	}
	public String getCarColor(){
		return carColor;
	}
	public void setCarColor(String _carColor){
		carColor=_carColor;
	}
	
	public int getCarSize(){
		return carSize;
	}
	public  void setCarSize(int _carSize){
		carSize = _carSize;
	}
	
	public int getVelocity(){
		return velocity;
	}
	public  void setVelocity(int _velocity){
		velocity = _velocity;
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
	
	public void park(){
		System.out.println("주차합니다.");
	}
}

