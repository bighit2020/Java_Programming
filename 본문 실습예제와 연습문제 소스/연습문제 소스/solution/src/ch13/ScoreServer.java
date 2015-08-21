package ch13;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class ScoreServer {
	public static ArrayList<String> calcScore(List<Student> list){
	//1.로컬변수 선언
	Student st=null;
	ArrayList<String>_sList=new ArrayList<String>();
			
	int length=list.size(); //ArrayList에 저장된 학생의 수를 구한다.
	String [] name=new String[length]; //학생의 이름을 저장하는 배열
	int [] score=new int[length]; //학생의 점수를 저장하는 배열
	int[] subNum=new int[length]; //각 학생의 시험 과목수
	String sName=null;
	int point=0;
			
	for(int i=0; i<list.size();i++){
	   st=(Student)list.get(i);
	//학생의 이름과 시험 점수를 얻는다.
	   sName=st.getName();
	   point=st.getPoint();
			   
	  for(int j=0;j<length;j++){
         if(sName.equals(name[j])){ 
		    score[j]+=point;				
		    subNum[j]++; 
		    break;
         }else if(name[j]==null){ 
		    name[j]=sName;
		    score[j]+=point;
		    subNum[j]++;
		    break;
         }
	  }
	}
	
	for(int i=0;i<length;i++){
	   if(name[i]!=null){
		   String res="이름:" +name[i]+
				   	" \t 총점:"+score[i]+ 
				   	" \t 과목수:"+subNum[i]+
				   	" \t 평균:"+((float)score[i]/subNum[i]);
		   _sList.add(res);
		   
       }
    }	
	
	return _sList;
  }
	
  public static void main(String args[]){
	try{
		System.out.println("서비스하기위해 준비중입니다.");
		ServerSocket serverSocket= new ServerSocket(5434);
		System.out.println("서버가 동작중입니다.");

		Socket s1 = serverSocket.accept();  //클라이언트의 접속을 허락한다.
				
	
		ObjectInputStream ois = new ObjectInputStream( s1.getInputStream() );  //객체입출력 스트림을 생성한다.
		ObjectOutputStream oos = new ObjectOutputStream( s1.getOutputStream() );
			
		List sList =(ArrayList)ois.readObject();	//클라이언트에서 전송된 데이터를 수신한다.
		oos.writeObject(calcScore(sList));  //결과를 클라이언트로 전송한다.
		
		oos.close();
        s1.close();
	}catch(ClassNotFoundException eof){
		System.out.println("Client로 부터 연결이 끊어졌습니다. 종료합니다...");
		System.exit(0);
	}catch(IOException io){
		io.printStackTrace();
	}
  }

}
