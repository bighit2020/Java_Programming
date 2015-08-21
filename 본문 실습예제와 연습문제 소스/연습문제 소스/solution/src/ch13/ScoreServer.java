package ch13;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class ScoreServer {
	public static ArrayList<String> calcScore(List<Student> list){
	//1.���ú��� ����
	Student st=null;
	ArrayList<String>_sList=new ArrayList<String>();
			
	int length=list.size(); //ArrayList�� ����� �л��� ���� ���Ѵ�.
	String [] name=new String[length]; //�л��� �̸��� �����ϴ� �迭
	int [] score=new int[length]; //�л��� ������ �����ϴ� �迭
	int[] subNum=new int[length]; //�� �л��� ���� �����
	String sName=null;
	int point=0;
			
	for(int i=0; i<list.size();i++){
	   st=(Student)list.get(i);
	//�л��� �̸��� ���� ������ ��´�.
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
		   String res="�̸�:" +name[i]+
				   	" \t ����:"+score[i]+ 
				   	" \t �����:"+subNum[i]+
				   	" \t ���:"+((float)score[i]/subNum[i]);
		   _sList.add(res);
		   
       }
    }	
	
	return _sList;
  }
	
  public static void main(String args[]){
	try{
		System.out.println("�����ϱ����� �غ����Դϴ�.");
		ServerSocket serverSocket= new ServerSocket(5434);
		System.out.println("������ �������Դϴ�.");

		Socket s1 = serverSocket.accept();  //Ŭ���̾�Ʈ�� ������ ����Ѵ�.
				
	
		ObjectInputStream ois = new ObjectInputStream( s1.getInputStream() );  //��ü����� ��Ʈ���� �����Ѵ�.
		ObjectOutputStream oos = new ObjectOutputStream( s1.getOutputStream() );
			
		List sList =(ArrayList)ois.readObject();	//Ŭ���̾�Ʈ���� ���۵� �����͸� �����Ѵ�.
		oos.writeObject(calcScore(sList));  //����� Ŭ���̾�Ʈ�� �����Ѵ�.
		
		oos.close();
        s1.close();
	}catch(ClassNotFoundException eof){
		System.out.println("Client�� ���� ������ ���������ϴ�. �����մϴ�...");
		System.exit(0);
	}catch(IOException io){
		io.printStackTrace();
	}
  }

}
