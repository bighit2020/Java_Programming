package ch4.ex1;

//다음 이차 방정식이 어떤 근을 갖는지 판별하라.
//x
public class IfTest5 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=1;
		
		int result=b*b-4*a*c;
		
		if(result >0){
			System.out.println("방정식은 두 실근을 가집니다.");
		}else if(result ==0){
			System.out.println("방정식은 중근 가집니다.");
		}else if(result <0){
			System.out.println("방정식은 두 허근을 가집니다.");
		}
	}

}
