package ch5.ex1;


public class Car{

	int velocity;  //�����ڸ� �����ϸ� default�̴�. 
    int wheelNum;
	String carName;
/*
  	private int velocity;
    private	int wheelNum;
	private String carName;

*/
	//getter�޼ҵ�
	public int getVelocity(){
		return velocity;
	}

	public int getWheelNum(){
		return wheelNum;
	}

	public String getCarName(){
		return carName;
	}

	//setter�޼ҵ�
	public  void setVelocity(int v){
		velocity = v;
	}

	public void setWheelNum(int w){
		wheelNum = w;
	}

	public void setCarName(String c){
		carName= c;
	}


	//�ӵ��� ���δ�.
	//������� velocity�� 1�� �����ִ� �������Ѵ�.
	public void speedUp(){
		velocity = velocity + 1;
	}

	//�ӵ��� �����.
	public void speedDown(){
		velocity =velocity -1;
		if(velocity < 0)
			velocity =0;
	}

	//�����.
	public void stop(){
		velocity =0;
	}


}