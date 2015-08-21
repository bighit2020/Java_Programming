package ch6.ex6a;

public class LandTest {
	public static void main(String[] args) {
		float my_total_tax=0f;
		int my_land_type=1;  
		int my_land_size=25000;
		int my_land_own_year=5;
		
		float your_total_tax=0f;
		int your_land_type=2;  
		int your_land_size=15000;
		int your_land_own_year=3;
		
		LandUtil util=new LandUtil();
		
		Land my_land=new Land(my_land_type, my_land_size, my_land_own_year);
		
		my_total_tax=util.calcLandTax(my_land);
		//System.out.println("내 토지 보유세액은 "+my_total_tax+"입니다.\n");
		System.out.println("내 토지 보유세액은 "+String.format("%5.1f", my_total_tax)+"원입니다.\n");
		
		Land your_land=new Land(your_land_type, your_land_size, your_land_own_year);
		your_total_tax=util.calcLandTax(your_land);
		System.out.println("당신의 토지 보유세액은 "+String.format("%5.1f", your_total_tax)+"원입니다.");
		
	}
}
