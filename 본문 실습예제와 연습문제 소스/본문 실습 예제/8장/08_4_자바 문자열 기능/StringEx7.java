package ch8.ex4;

//�л��� ���� ������ ������ ����� ���϶�.
public class StringEx7 {
	
	public static void calcAverage(String[] str){
		int total=0; //����
		float average=0.0f;
		
		String [] token =null;
		for(int i=0;i<str.length;i++){
			token=str[i].split(",");
			total+=Integer.parseInt(token[3]); //���������� ���������� ��ȯ�Ѵ�.
		}
		
		average=(float)total/str.length;
		
		System.out.println("������ ="+total);
		System.out.println("����� ="+average);
		
		
	}
	
	
	public static void main(String [ ] args){
		String []data={"ȫ�浿,3,����,80", //�̸�,�г�,����,��������
		               "�̼���,3,����,90",
		               "�Ӳ���,3,����,78"
					};
		
		
		calcAverage(data);
		
	}
}
