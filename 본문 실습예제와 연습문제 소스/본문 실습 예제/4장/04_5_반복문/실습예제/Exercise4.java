package ch4.ex4a;

public class Exercise4 {
	public static void main(String[] args) {
		int num=143;
		int count=0;
		
		for(int i=1; i<=num;i++){
			if(num%i==0){
				System.out.println("약수:"+i);
				count++;
			}
		}
		
		System.out.println(num+"의 약수의 개수:"+count);
		
		if(count==2)
			System.out.println(num+"은 소수입니다.");
		else
			System.out.println(num+"은 합성수입니다.");
	}
}
