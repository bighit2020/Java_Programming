package ch14.ex5;

public class BlockTest {
    static int a = 100;
    static {
    	System.out.println("Static Block ȣ��");
    	a+=1000;
    }
    
    {
    	System.out.println("�ν��Ͻ� �ʱ�ȭ Block ȣ��");
    	a+=1000;
    }
    public BlockTest(){
    	System.out.println("������ ȣ��");
    }
    
	    
	public static void main(String[] args) {
		System.out.println("a= "+a);
		BlockTest s1=new BlockTest();
		System.out.println("a= "+a);
		
		BlockTest s2=new BlockTest();
		System.out.println("a= "+a);
	}

}
