package rent.ex2;

import rent.ex2.member.*;
import rent.ex2.car.*;
import rent.ex2.reserve.*;

public class RentTest {
	
	public static void main(String[] args){
		String carInfo;
		String resData;
		//ȸ�� �����ϱ�
		Member member=new Member();		
		member.regMember();
		
		//��Ʈī�� ��ȸ�Ѵ�.
		Car car =new Car();
		carInfo=car.checkCarInfo();
		car.displayData(carInfo); //�θ� Ŭ������ �޼ҵ带 ����Ͽ� ��ȸ�� ���� ������ �����ش�.
		
		//������ �Ѵ�.
		Reserve reserve=new Reserve();
		resData=reserve.reserveCar();
		reserve.displayData(resData); //�θ� Ŭ������ �޼ҵ带 ����Ͽ� ��� ������ �����ش�.
	}
}


