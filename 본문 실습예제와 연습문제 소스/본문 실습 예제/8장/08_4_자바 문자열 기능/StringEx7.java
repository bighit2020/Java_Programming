package ch8.ex4;

//학생의 시험 점수의 총점과 평균을 구하라.
public class StringEx7 {
	
	public static void calcAverage(String[] str){
		int total=0; //총점
		float average=0.0f;
		
		String [] token =null;
		for(int i=0;i<str.length;i++){
			token=str[i].split(",");
			total+=Integer.parseInt(token[3]); //시험점수를 정수값으로 변환한다.
		}
		
		average=(float)total/str.length;
		
		System.out.println("총점은 ="+total);
		System.out.println("평균은 ="+average);
		
		
	}
	
	
	public static void main(String [ ] args){
		String []data={"홍길동,3,국어,80", //이름,학년,과목,시험점수
		               "이순신,3,국어,90",
		               "임꺽정,3,국어,78"
					};
		
		
		calcAverage(data);
		
	}
}
