package ch8.ex4;

//각 학생의 시험 점수의 총점과 평균을 구하라.
public class StringEx8 {
	public static void calcScore(String[] str){
		//1.로컬변수 선언
		int length=str.length;
		String [] name=new String[length]; //학생의 이름을 저장하는 배열
		int [] score=new int[length]; //학생의 점수를 저장하는 배열
		int[] subNum=new int[length]; //각 학생의 시험 과목수
		
		String sName=null;
		int point=0;
		//2.구현 방법
		/*1.각각의 배열의 문자열을 분리한다.
		 *2.분리한 첫번째 토큰이 name 배열에 존재하는 지를 조사한다.
		 *3.존재하면 score배열에서  똑같은 인덱스의   배열요소에 네번째 토큰값을 더한 후 저장한다.
		 *4.존재하지 않으면 name배열에 이름을 추가한 후, score배열에 똑같은 배열요소의 위치에 점수를 저장한다. 
		 * 
		 */
		String [] token =null;
		for(int i=0;i<length;i++){
			token=str[i].split(",");
			sName=token[0];
		//	System.out.println(sName);
			point=Integer.parseInt(token[3]); //학생의 점수를 변환한다.
			//분리한 첫번째 토큰이 name배열에 존재하는 지 체크한다.
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
				System.out.println( "이름:" +name[i]+" "+
									"  총점:"+score[i]+ 
									"  과목수:"+subNum[i]+
									"  평균:"+((float)score[i]/subNum[i]));
			}
		}
		//return token;
	}

	public static void main(String [ ] args){
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
		
		calcScore(data);
		
		
	}
}
