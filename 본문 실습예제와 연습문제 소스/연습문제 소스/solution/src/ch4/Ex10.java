package ch4;

public class Ex10 {
	public static void main(String[] args) {
		//1.���� ���� ����
		int num[] ={34,56,78,99,23,66,78,46,43,55};
		int temp=0;
		
		//2.��� ����
		for(int i=0; i<num.length;i++){
	    	for(int j=i+1; j<num.length;j++){
	    		if(num[i]> num[j]){
	    			temp=num[i];
	    			num[i]=num[j];
	    			num[j]=temp;
	    		}
	    	}
	    }
		
		//3.��� ���
	    for(int i=0;i< num.length;i++){
	    	System.out.print(num[i]+"\t");
	    }
	}
}
