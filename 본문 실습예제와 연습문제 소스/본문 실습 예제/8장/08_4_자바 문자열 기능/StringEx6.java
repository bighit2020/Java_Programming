package ch8.ex4;

public class StringEx6 {
	public static String[] parseVoca(String str,String delimiter){
		String [] token =null;
		token=str.split(delimiter);
		return token;
	}
	
	public static void main(String [ ] args){
		String fruitData="��� �ٳ��� �� ����";
		String deptData="�λ��,ȸ���,���ߺ�,������";
		String prodData="����ƮTV-����Ʈ��-��Ʈ��-�º�";
		
		String data[]=null;
		//�޼ҵ� ȣ��
		data=parseVoca(fruitData," ");
		
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
		
		data=parseVoca(deptData,",");
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}

		data=parseVoca(prodData, "-");
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
	}

}
