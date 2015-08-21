package ch7.ex11;

public class MyOuter3{
	private String name;
	private int age;

	public MyOuter3( String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){ return name; }
	public int getAge(){ return age; }

    static  class Inner{
		 private String address;
		 static String tel ="010-1111-2222";

		 public Inner( String address){
				this.address = address;
		 }	
		public String getUserInfo(){
			//static ���� Ŭ�������� �ܺ� Ŭ������ ��� ������ ������ �Ұ����ϴ�.
			//return  name + " " + age;   
			 return "�ּҴ�:" +address +" , ��ȭ��ȣ: " + tel;
		}

	}  //end Inner_class

}  //end Outer_class


