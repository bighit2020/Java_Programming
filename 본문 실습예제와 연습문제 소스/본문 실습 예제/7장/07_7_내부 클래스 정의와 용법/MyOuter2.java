package ch7.ex11;

public class MyOuter2{

	private String name;
	private int age;

	public MyOuter2( String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){ return name; }
	public int getAge(){ return age; }

     public void test(){
		int num = 4;
	    class Inner{
			 private String address;
			 public Inner( String address){
					this.address = address;
			 }	
			public String getCustomerInfo(){
				//�������� ���ٺҰ�
				//System.out.println("inner_test() : " + num);
				
				return  "�̸�: "+name + ",����: " + age + ",�ּ�: "+ address;
			}
		}//end Inner_class	
			Inner inner = new Inner("������ ������");
			System.out.println("������: " +inner.getCustomerInfo());
		
	 } //end inner_test;
}//end Outer_class