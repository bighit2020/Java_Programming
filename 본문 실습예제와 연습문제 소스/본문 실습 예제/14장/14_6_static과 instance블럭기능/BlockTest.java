package ch14.ex5;

public class BlockTest {
    static int a = 100;
    static {
    	System.out.println("Static Block 호출");
    	a+=1000;
    }
    
    {
    	System.out.println("인스턴스 초기화 Block 호출");
    	a+=1000;
    }
    public BlockTest(){
    	System.out.println("생성자 호출");
    }
    
	    
	public static void main(String[] args) {
		System.out.println("a= "+a);
		BlockTest s1=new BlockTest();
		System.out.println("a= "+a);
		
		BlockTest s2=new BlockTest();
		System.out.println("a= "+a);
	}

}
