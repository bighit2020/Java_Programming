package ch12.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�л��� ���� ���� ���� ���ϴ� ����
public class InputTest2 {
	public static void main(String [] args){

		int [] score=new int[5]; //�Է��� ���������� �����ϴ� �迭
		int count=0;  //�Է��� ȸ���� �����ϴ� ����
		int total=0; //���� ������ �����ϴ� ����
		
		String  data= null;
		InputStreamReader ir = new InputStreamReader(System.in); //Ű����� �Է¹��� �����͸� ���ڷ� ��ȯ�Ѵ�.		
		BufferedReader in = new BufferedReader(ir); //���ۿ� �ٽ� �����Ѵ�.
		
		System.out.println("exit: Ctrl+Z");  
		System.out.println("���������� �Է��� �ּ���");
		try{
			//���๮�ڰ� �Էµ� ������ ���ۿ� �����͸� �Է��Ѵ�.
			do{
				data = in.readLine();
				System.out.println("����:" + data);
				score[count]=Integer.parseInt(data); //�Է��� ������ score�迭�� ���ʴ�� �����Ѵ�.
				count++;
				
			}while(count<5);

			in.close();
			ir.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		for(int i=0; i<score.length;i++){
			//System.out.println(score[i]);
			total+=score[i];
		}
		
		System.out.println("���� ������ "+ total);
	}
}
