package ch4;

public class Ex9 {
	public static void main(String[] args) {
		//1.���� ���� ����
	    int [] num={12,34,2,56,7,19,57,9,18};
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
