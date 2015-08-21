package rent.ex2;

import rent.ex2.car.*;
import rent.ex2.member.*;
import rent.ex2.reserve.*;

public class RentTest {
	public static void main(String[] args){
		
		//ȸ�� �����ϱ�
		Member member=new MemberImpl();  //upcasting		
		member.regMember();
		
		//��Ʈī�� ��ȸ�Ѵ�.
		Car car =new CarImpl();  //upcasting
		car.checkCarInfo();
		
		//������ �Ѵ�.
		Reserve reserve=new ReserveImpl();  //upcasting
		reserve.reserveCar();
		
		//������ �����Ѵ�.
		reserve.modReserveInfo();
		
		///������ ����Ѵ�.
		reserve.cancelReserveInfo();
	}
}

