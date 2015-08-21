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
				//지역변수 접근불가
				//System.out.println("inner_test() : " + num);
				
				return  "이름: "+name + ",나이: " + age + ",주소: "+ address;
			}
		}//end Inner_class	
			Inner inner = new Inner("세종시 세종구");
			System.out.println("고객정보: " +inner.getCustomerInfo());
		
	 } //end inner_test;
}//end Outer_class