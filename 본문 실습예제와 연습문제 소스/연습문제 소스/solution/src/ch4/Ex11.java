package ch4;

public class Ex11 {
	public static void main(String[] args) {
		//1.���� ���� ����
		char ch[] ={'h','e','l','l','o'} ;
		char temp=0;
		 //2.��� ����
	    for(int i=0; i<ch.length;i++){
	    	for(int j=i+1; j<ch.length;j++){
	    		if(ch[i]> ch[j]){
	    			temp=ch[i];
	    			ch[i]=ch[j];
	    			ch[j]=temp;
	    		}
	    	}
	    }
	    
	    //3.��� ���
	    for(int i=0;i< ch.length;i++){
	    	System.out.print(ch[i]+"\t");
	    }
	}		
}
