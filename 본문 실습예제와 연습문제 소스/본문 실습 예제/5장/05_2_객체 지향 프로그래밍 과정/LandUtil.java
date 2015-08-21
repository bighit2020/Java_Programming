package ch5.ex3a;

public class LandUtil {
	public float calcLandTax(int type,int size,int year){
		float total_tax=0f;
		float tax=0f;
		float area_tax=0f;  //면적당토지세액
		int tax_rate=0;
		int n=0;
		if(type==1){  //건물이 없는 토지인 경우
			System.out.println("토지 종류:건물이 없는 토지");
			if(size<=1800)
				tax_rate=1800;
			else if(size <=2500)
				tax_rate=2000;
			else
				tax_rate=3000;
			
			area_tax=tax_rate*size;
			System.out.println("토지면적 세액: "+area_tax);
			if(year<3)
				n=0;
			else if(year <13)
				n=year-2;
			else
				n=10;
			
			tax=area_tax-area_tax*0.05f*n;
			
		}else {
			System.out.println("토지 종류: 건물이 있는 토지 ");
			if(size<=1800)
				tax_rate=3600;
			else if(size <=2500)
				tax_rate=4000;
			else
				tax_rate=6000;
			
			area_tax=tax_rate*size;
			System.out.println("토지면적 세액은 "+area_tax);
			if(year<3)
				n=0;
			else if(year <13)
				n=year-2;
			else
				n=10;
			
			tax=area_tax-area_tax*0.05f*n;
		}
		
		total_tax=tax+0.3f*area_tax;  //최종 토지 보유세에 지방 교육세를 포함한다.

		
		return total_tax;
		
		
	}

}
