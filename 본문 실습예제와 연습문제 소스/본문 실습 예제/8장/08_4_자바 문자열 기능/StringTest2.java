package ch8.ex4;

public class StringTest2 {
	public static void main ( String [ ] args ){
		String fluitData="��� �ٳ��� �� ����";
		String deptData="�λ��,ȸ���,���ߺ�,������";
		String prodData="����ƮTV-����Ʈ��-��Ʈ��-�º�";
		String[] data=null;
		
		data=fluitData.split(" "); //�������� ���ڿ��� �и��ؼ� �迭�� �����Ѵ�.
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
		
		data=deptData.split(","); //","���� ���ڿ��� �и��ؼ� �迭�� �����Ѵ�.
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
		
		data=prodData.split("-"); //","���� ���ڿ��� �и��ؼ� �迭�� �����Ѵ�.
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}		
	}
}
