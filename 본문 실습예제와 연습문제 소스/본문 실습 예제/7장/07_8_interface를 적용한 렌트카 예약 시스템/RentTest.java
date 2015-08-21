package rent.ex2;

import rent.ex2.car.*;
import rent.ex2.member.*;
import rent.ex2.reserve.*;

public class RentTest {
	public static void main(String[] args){
		
		//회원 가입하기
		Member member=new MemberImpl();  //upcasting		
		member.regMember();
		
		//렌트카를 조회한다.
		Car car =new CarImpl();  //upcasting
		car.checkCarInfo();
		
		//예약을 한다.
		Reserve reserve=new ReserveImpl();  //upcasting
		reserve.reserveCar();
		
		//예약을 수정한다.
		reserve.modReserveInfo();
		
		///예약을 취소한다.
		reserve.cancelReserveInfo();
	}
}

