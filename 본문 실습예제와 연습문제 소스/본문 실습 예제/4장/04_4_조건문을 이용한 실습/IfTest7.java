package ch4.ex1;

public class IfTest7 {
	public static void main(String[] args) {
		int tax_rate=0, n=0;
		int my_land_Type=1;  //1:건물없는 토지, 2:건물있는 토지
		int my_land_size=25000;
		int my_land_own_year=5;
		
		float tax=0f;
		float area_tax=0f;  //면적당토지세액
		if(my_land_Type==1){  //건물이 없는 토지인 경우
			System.out.println("건물이 없는 토지");
			if(my_land_size<=1800)
				tax_rate=1800;
			else if(my_land_size <=2500)
				tax_rate=2000;
			else
				tax_rate=3000;
			
			area_tax=tax_rate*my_land_size;
			System.out.println("토지면적 세액은 "+area_tax);
			if(my_land_own_year<3)
				n=0;
			else if( my_land_own_year <13)
				n=my_land_own_year-2;
			else
				n=10;
			
			tax=area_tax-area_tax*0.05f*n;
			
		}else {
			System.out.println("건물이 있는 토지 ");
			if(my_land_size<=1800)
				tax_rate=3600;
			else if(my_land_size <=2500)
				tax_rate=4000;
			else
				tax_rate=6000;
			
			area_tax=tax_rate*my_land_size;
			System.out.println("토지면적 세액은 "+area_tax);
			if(my_land_own_year<3)
				n=0;
			else if( my_land_own_year <13)
				n=my_land_own_year-2;
			else
				n=10;
			
			tax=area_tax-area_tax*0.05f*n;
		}
		
		tax=tax+0.3f*area_tax;  //최종 토지 보유세에 지방 교육세를 포함한다.
		//System.out.println("내 토지 보유세금액은>>"+tax+"원입니다.");
		   System.out.printf("내 토지 보유세금액은>>%5.1f 원입니다.",tax);
		//System.out.println("내 토지 보유세액은 "+String.format("%5.1f", tax)+"원입니다.");
	}

}
