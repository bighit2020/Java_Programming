package ch4;

//1+2+3+4+....+n ���� ���� ���ʷ� 1000�̻��� �Ǵ� n�� ����
//�� ����  ���ϴ� ����
public class WhileTest {
	
	public static void main(String[] args){
		int n=0;
		int sum=0;
		while(true){
		 sum +=n;	
		  
		  if(sum>=1000)
			  break;
		  else
			  n++;			  
		  }
		System.out.println("1000�̻��� �ǰ��ϴ� ������ n ����  "+n);
		System.out.println("n���� ���� ���� " + sum );
		
	}
}


