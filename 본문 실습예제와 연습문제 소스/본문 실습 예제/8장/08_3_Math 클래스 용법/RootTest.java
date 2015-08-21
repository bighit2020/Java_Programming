package ch8.ex5a;

public class RootTest {
	public static void main(String[] args) {
	   int a=7;
	   int b=2;
	   int c=1;
		
	   double result=Math.pow(b,2)-4*a*c;
		
	   System.out.printf("판별식 값은 : %f\n",result);
	   
	   if(result >0){
		System.out.println("방정식은 두 실근을 가집니다.");
	   }else if(result ==0){
		System.out.println("방정식은 중근 가집니다.");
	   }else if(result <0){
		System.out.println("방정식은 두 허근을 가집니다.");
	   }
	}
}
