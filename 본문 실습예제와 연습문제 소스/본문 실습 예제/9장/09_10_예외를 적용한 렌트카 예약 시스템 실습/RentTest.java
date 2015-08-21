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
			//ȸ�� �����ϱ�
			Member member=new MemberImpl();  //upcasting		
			member.regMember();

			//��Ʈī�� ��ȸ�Ѵ�.
			Car car =new CarImpl();  //upcasting
			carInfo=car.checkCarInfo();
			UtilDisp.displayData(carInfo);
			
			//������ �Ѵ�.
			Reserve reserve=new ReserveImpl();  //upcasting
			resData=reserve.reserveCar();
			UtilDisp.displayData(resData);
			//������ �����Ѵ�.
			reserve.modReserveInfo();
			
			///������ ����Ѵ�.
			reserve.cancelReserveInfo();
		}catch(RentException e){
			System.out.println(e.getRentExceptionInfo());
		}catch(Exception e){
			e.printStackTrace();
		}	
	}
}

