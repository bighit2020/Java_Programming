package rent.ex1;

import rent.ex1.member.*;
import rent.ex1.car.*;
import rent.ex1.reserve.*;

public class RentTest {
	
	public static void main(String[] args){
		
		//회원 가입하기
		Member member=new Member();		
		member.regMember();
		
		//렌트카를 조회한다.
		Car car =new Car();
		car.checkCarInfo();
		
		//예약을 한다.
		Reserve reserve=new Reserve();
		reserve.reserveCar();
		
		
		
	}

}
