package ch14.ex2;


public class ScoreTest {

	private static void calcScore(Object ... obj){
		int total=0;
		float average=0f;
		
		
		for(int i=0; i<obj.length;i++){
			Student s=(Student)obj[i];
			total+=s.point;
		}
		
		average=(float)total/obj.length;
		
		System.out.println("ÇÐ»ýÀÇ ½ÃÇè ÃÑÁ¡Àº:"+total+", Æò±ÕÀº:"+average);
		
		
	}
	
	public static void main(String[] args) {
		Student s1,s2,s3;
		
		s1=new Student("È«±æµ¿",3,"±¹¾î",80);
		s2=new Student("È«±æµ¿",3,"¼öÇÐ",95);
		s3=new Student("È«±æµ¿",3,"¿µ¾î",87);
		
		calcScore(s1,s2,s3);
	}

}
