package ch7.ex11;

public class MyOuter1{

	private String name;
	private int age;

	public MyOuter1( String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){ 
		return name; 
	}
	public int getAge(){ 
		return age; 
	}
	
    //내부 클래스를 정의한다.
    public class Inner{
		 private String address;
		 public Inner( String address){
				this.address = address;
		 }	
		 
		public String getCustomerInfo(){
			return  "이름: "+name + ",나이: " + age + ",주소: "+ address;
		}
	}

}


