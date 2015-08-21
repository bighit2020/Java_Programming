package ch10.ex6;

public class Product {
	private String code;  //제품코드번호
	private String name;   //제품이름
	private String color;  //제품 색상
	private int qty  ;		//제품수량
	
	public Product(){
		this("0001","스마트폰","블랙",100);
		
	}
	
	public Product(String code, String name,String color, int qty){
		this.code=code;
		this.name=name;
		this.color=color;
		this.qty=qty;
		
	}

	//setter ,getter
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
	

}
