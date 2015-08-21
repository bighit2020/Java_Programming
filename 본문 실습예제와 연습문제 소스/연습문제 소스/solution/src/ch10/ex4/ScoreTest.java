package ch10.ex4;

import java.util.ArrayList;
import java.util.List;


public class ScoreTest {
	//ArrayList에 저장된 학생의 시험점수를 학생별로 시험점수의 총점과 평균을 구하는 메소드
	public static void calcScore(List list){
		//1.로컬변수 선언
		Student st=null;
		
		int length=list.size(); //ArrayList에 저장된 학생의 수를 구한다.
		String [] name=new String[length]; //학생의 이름을 저장하는 배열
		int [] score=new int[length]; //학생의 점수를 저장하는 배열
		int[] subNum=new int[length]; //각 학생의 시험 과목수
		String sName=null;
		int point=0;
		//2.구현 방법
		/*
		 *1.ArrayList에서 학생객체를 순차적으로 가지고 온다.
		 *2.각각의 학생객체에서 이름과 점수를 구한다.
		 *3,가지고 온 이름이 name배열에 존재하는지 체크한다.
		 *3.배열에 존재하면 score배열에서  똑같은 인덱스의   배열요소에 point값을 누적시킨다.
		 *4.존재하지 않으면 name배열에 이름을 추가한 후, score배열에 똑같은 배열요소의 위치에 점수를 저장한다. 
		 * 
		 * 
		 */
		for(int i=0; i<list.size();i++){
			st=(Student)list.get(i);
		   //학생의 이름과 시험 점수를 얻는다.
		   sName=st.getName();
		   point=st.getPoint();
		   
			for(int j=0;j<length;j++){
				if(sName.equals(name[j])){ 
					score[j]+=point;//같은 이름이 존재하면 점수를 더한다.
					subNum[j]++; //점수를 더한 과목의 수를 증가시킨다.
					break;
				}else if(name[j]==null){ //name 배열의 마지막 요소에 새로운이름을 추가한다.
						name[j]=sName;
						score[j]+=point;//socre배열의 같은 배열요소에  점수를 더한다.
						subNum[j]++; //점수를 더한 과목의 수를 증가시킨다.
						break;
				}
			}
		}
		
		for(int i=0;i<length;i++){
			if(name[i]!=null){
				System.out.println( "이름:" +name[i]+
									" \t 총점:"+score[i]+ 
									" \t 과목수:"+subNum[i]+
									" \t 평균:"+((float)score[i]/subNum[i]));
			}
		}
	}
	
	public static void main(String[] args){
		/*
		String []data={"홍길동,3,국어,80", //이름,학년,과목,시험점수
		               "이순신,3,국어,90",
		               "임꺽정,3,국어,78",
		               "홍길동,3,영어,76",
		               "이순신,3,영어,88",
		               "임꺽정,3,영어,56",		
		               "홍길동,3,수학,70",
		               "이순신,3,수학,67",
		               "임꺽정,3,수학,77"
					};
		 */
		List sList= new ArrayList();
		
		sList.add(new Student("홍길동",3,"국어",80));
		sList.add(new Student("이순신",3,"국어",90));
		sList.add(new Student("임꺽정",3,"국어",78));
		sList.add(new Student("홍길동",3,"영어",76));
		sList.add(new Student("임꺽정",3,"영어",56));
		sList.add(new Student("홍길동",3,"수학",70));
		sList.add(new Student("이순신",3,"수학",67));
		sList.add(new Student("임꺽정",3,"수학",77));
		
		calcScore(sList);
	}
} 

