package ch10.ex4;

import java.util.ArrayList;
import java.util.List;


public class ScoreTest {
	//ArrayList�� ����� �л��� ���������� �л����� ���������� ������ ����� ���ϴ� �޼ҵ�
	public static void calcScore(List list){
		//1.���ú��� ����
		Student st=null;
		
		int length=list.size(); //ArrayList�� ����� �л��� ���� ���Ѵ�.
		String [] name=new String[length]; //�л��� �̸��� �����ϴ� �迭
		int [] score=new int[length]; //�л��� ������ �����ϴ� �迭
		int[] subNum=new int[length]; //�� �л��� ���� �����
		String sName=null;
		int point=0;
		//2.���� ���
		/*
		 *1.ArrayList���� �л���ü�� ���������� ������ �´�.
		 *2.������ �л���ü���� �̸��� ������ ���Ѵ�.
		 *3,������ �� �̸��� name�迭�� �����ϴ��� üũ�Ѵ�.
		 *3.�迭�� �����ϸ� score�迭����  �Ȱ��� �ε�����   �迭��ҿ� point���� ������Ų��.
		 *4.�������� ������ name�迭�� �̸��� �߰��� ��, score�迭�� �Ȱ��� �迭����� ��ġ�� ������ �����Ѵ�. 
		 * 
		 * 
		 */
		for(int i=0; i<list.size();i++){
			st=(Student)list.get(i);
		   //�л��� �̸��� ���� ������ ��´�.
		   sName=st.getName();
		   point=st.getPoint();
		   
			for(int j=0;j<length;j++){
				if(sName.equals(name[j])){ 
					score[j]+=point;//���� �̸��� �����ϸ� ������ ���Ѵ�.
					subNum[j]++; //������ ���� ������ ���� ������Ų��.
					break;
				}else if(name[j]==null){ //name �迭�� ������ ��ҿ� ���ο��̸��� �߰��Ѵ�.
						name[j]=sName;
						score[j]+=point;//socre�迭�� ���� �迭��ҿ�  ������ ���Ѵ�.
						subNum[j]++; //������ ���� ������ ���� ������Ų��.
						break;
				}
			}
		}
		
		for(int i=0;i<length;i++){
			if(name[i]!=null){
				System.out.println( "�̸�:" +name[i]+
									" \t ����:"+score[i]+ 
									" \t �����:"+subNum[i]+
									" \t ���:"+((float)score[i]/subNum[i]));
			}
		}
	}
	
	public static void main(String[] args){
		/*
		String []data={"ȫ�浿,3,����,80", //�̸�,�г�,����,��������
		               "�̼���,3,����,90",
		               "�Ӳ���,3,����,78",
		               "ȫ�浿,3,����,76",
		               "�̼���,3,����,88",
		               "�Ӳ���,3,����,56",		
		               "ȫ�浿,3,����,70",
		               "�̼���,3,����,67",
		               "�Ӳ���,3,����,77"
					};
		 */
		List sList= new ArrayList();
		
		sList.add(new Student("ȫ�浿",3,"����",80));
		sList.add(new Student("�̼���",3,"����",90));
		sList.add(new Student("�Ӳ���",3,"����",78));
		sList.add(new Student("ȫ�浿",3,"����",76));
		sList.add(new Student("�Ӳ���",3,"����",56));
		sList.add(new Student("ȫ�浿",3,"����",70));
		sList.add(new Student("�̼���",3,"����",67));
		sList.add(new Student("�Ӳ���",3,"����",77));
		
		calcScore(sList);
	}
} 

