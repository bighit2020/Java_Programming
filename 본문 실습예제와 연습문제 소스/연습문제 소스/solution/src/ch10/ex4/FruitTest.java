package ch10.ex4;

public class FruitTest {
	public static void calcGasu(String[] _fruit){
		int len=_fruit.length;
		String [] fruit_name=new String[len]; 
		int [] gasu=new int[len]; 
		String name=null;
		
		for(int i=0; i<len;i++){
			name=_fruit[i];

			for(int j=0;j<len;j++){
				if(name.equals(fruit_name[j])){ 
					gasu[j]++;//�̹� ���� �̸��� �����ϸ� ������ 1���� ��Ų��.
					break;
				}else if(fruit_name[j]==null){ //name �迭�� ������ ��ҿ� ���ο��̸��� �߰��Ѵ�.
					fruit_name[j]=name;
						gasu[j]++;//gasu�迭�� ���� �迭��ҿ�  ������ ���Ѵ�.
						break;
				}
			}
		}
		
		System.out.println("���Ϻ� ����");
		System.out.println("=============");
		for(int i=0;i<len;i++){
			if(fruit_name[i]!=null){
				System.out.println(fruit_name[i]+ ":"+gasu[i]+"��");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		String [] fruit={"���","�ٳ���","��","����","���","���","��","����","����","�ٳ���",
	                      "��","���","���","����","��","�ٳ���","��","�ٳ���","���","��","��"};
		
		calcGasu(fruit);
	}
}
