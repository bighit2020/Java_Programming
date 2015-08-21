package ch6;

public class Truck extends Car{
	private  int load;  //적재화물량
	private String company; //트럭회사
	
	//생성자
	public Truck(String carName,int load,int velocity){
		System.out.println("Truck 생성자 호출");
		carName=super.carName;
		carName=super.carName;
		load=this.load;
	}
	
	public Truck(String carName,int load,int velocity,String company){
		System.out.println("Truck 생성자 호출");
		carName=super.carName;
		velocity=super.velocity;
		load=this.load;
		company=this.company;
	}	
	public int getLoad(){
		return load;
	}
	
	public void setLoad(int l){
		load=l;
	}
	
	public String getCompany(){
		return company;
	}
	
	public void setCompany(String c){
		company=c;
	}
	//화물을 운반하는 기능
	public void carryLoad(){
		if(load>0)
			System.out.println("화물을 운반합니다.");
		else
			System.out.println("화물을 실어주세요");
	}
	
	//overriding 메소드
	public String getCarInfo(){
		System.out.println("overriding 메소드 호출");
		return carName+"의 속도는 "+velocity + " 이고 " + " 화물 적재량은 "+load + " 입니다.";
	}
}


