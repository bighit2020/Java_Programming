package ch4.ex1;

public class CallByString {
	public void setAddress(String addr){
		addr="��⵵ ������ ��ȵ�";
	}
	
	public static void main(String[] args){
		String address="����� ������ ������";
		
		CallByString st=new CallByString();
		System.out.println("�޼ҵ� ȣ�� ��");
		System.out.println("address= " +address);
		
		st.setAddress(address);
		
		System.out.println("�޼ҵ� ȣ�� ��");
		System.out.println("address= " +address);		
	}
}

