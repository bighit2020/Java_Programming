package ch7.ex2;

public class Number {
	private int num;
    static int numCounter=10;
    
    public Number(){
		num=numCounter;
	}
    
	public static int getNumCounter(){
		return numCounter;
	}
	
	
	
	public static int getNumber(){
		int num1=0; //���������� ��밡��
		num1=numCounter;  //static ������ ��밡��
		//return num;
		return num1;
	}
	
	
	public void increaseNum(){
		numCounter++;
	}
}


