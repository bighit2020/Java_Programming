package ch8.ex4;

//�� �л��� ���� ������ ������ ����� ���϶�.
public class StringEx8 {
	public static void calcScore(String[] str){
		//1.���ú��� ����
		int length=str.length;
		String [] name=new String[length]; //�л��� �̸��� �����ϴ� �迭
		int [] score=new int[length]; //�л��� ������ �����ϴ� �迭
		int[] subNum=new int[length]; //�� �л��� ���� �����
		
		String sName=null;
		int point=0;
		//2.���� ���
		/*1.������ �迭�� ���ڿ��� �и��Ѵ�.
		 *2.�и��� ù��° ��ū�� name �迭�� �����ϴ� ���� �����Ѵ�.
		 *3.�����ϸ� score�迭����  �Ȱ��� �ε�����   �迭��ҿ� �׹�° ��ū���� ���� �� �����Ѵ�.
		 *4.�������� ������ name�迭�� �̸��� �߰��� ��, score�迭�� �Ȱ��� �迭����� ��ġ�� ������ �����Ѵ�. 
		 * 
		 */
		String [] token =null;
		for(int i=0;i<length;i++){
			token=str[i].split(",");
			sName=token[0];
		//	System.out.println(sName);
			point=Integer.parseInt(token[3]); //�л��� ������ ��ȯ�Ѵ�.
			//�и��� ù��° ��ū�� name�迭�� �����ϴ� �� üũ�Ѵ�.
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
				System.out.println( "�̸�:" +name[i]+" "+
									"  ����:"+score[i]+ 
									"  �����:"+subNum[i]+
									"  ���:"+((float)score[i]/subNum[i]));
			}
		}
		//return token;
	}

	public static void main(String [ ] args){
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
		
		calcScore(data);
		
		
	}
}
