package rent.ex1;

import rent.ex1.member.*;
import rent.ex1.car.*;
import rent.ex1.reserve.*;

public class RentTest {
	
	public static void main(String[] args){
		
		//ȸ�� �����ϱ�
		Member member=new Member();		
		member.regMember();
		
		//��Ʈī�� ��ȸ�Ѵ�.
		Car car =new Car();
		car.checkCarInfo();
		
		//������ �Ѵ�.
		Reserve reserve=new Reserve();
		reserve.reserveCar();
		
		
		
	}

}
