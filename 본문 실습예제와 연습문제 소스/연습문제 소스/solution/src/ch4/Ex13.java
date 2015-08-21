package ch4;

public class Ex13 {
	public static void main(String[] args) {
		//1.지역 변수 선언
		int num1=100;
		int num2=505;
		int div=2;
		int count=0;
		int num=0;
		
		//2.기능 구현
		while(true){
			//소수 판별 부분
			for(int i=1; i<=div;i++){
				if(div%i==0){
					count++;
				}
			}
			
			//소수로 나누는 부분
			if(count==2){
				num=num1;
				while(num%div==0){
					System.out.println(num1+"의 소인수:"+div);
					num/=div;
				}
			}
			
			if( num==1 || div>=num1 )
				break;
			else{
				count=0;
				div++;
			}
		}
	}
}
