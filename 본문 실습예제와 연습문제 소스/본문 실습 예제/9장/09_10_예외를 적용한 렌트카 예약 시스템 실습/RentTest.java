package rent.ex6;

import rent.ex6.car.*;
import rent.ex6.common.exception.RentException;
import rent.ex6.common.util.UtilDisp;
import rent.ex6.member.*;
import rent.ex6.reserve.*;

public class RentTest {
	public static void main(String[] args){
		String carInfo;
		String resData;
		try{
			//회원 가입하기
			Member member=new MemberImpl();  //upcasting		
			member.regMember();

			//렌트카를 조회한다.
			Car car =new CarImpl();  //upcasting
			carInfo=car.checkCarInfo();
			UtilDisp.displayData(carInfo);
			
			//예약을 한다.
			Reserve reserve=new ReserveImpl();  //upcasting
			resData=reserve.reserveCar();
			UtilDisp.displayData(resData);
			//예약을 수정한다.
			reserve.modReserveInfo();
			
			///예약을 취소한다.
			reserve.cancelReserveInfo();
		}catch(RentException e){
			System.out.println(e.getRentExceptionInfo());
		}catch(Exception e){
			e.printStackTrace();
		}	
	}
}

