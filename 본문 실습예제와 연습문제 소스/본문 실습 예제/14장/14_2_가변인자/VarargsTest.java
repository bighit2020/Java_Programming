package ch14.ex1;


public class VarargsTest {
	public static void main ( String [ ] args){

		 Varargs var  = new Varargs();
		
			var.method1( "������" ,"������","�̼���" );
			var.method2( "������" , 1 ,2 ,3 ,4 );
	}
}

class Varargs{
	 //�޼ҵ� ���ڰ� �ڵ����� �迭�� ��ȯ�ȴ�.
	public void  method1( String ... name){
 
		for( int i = 0; i < name.length ; i++){
			System.out.println( name[i] );
		}
	}//end test

	public void method2( String name , int ... num ){
	
			System.out.println( name );
		
			for( int i = 0 ;i < num.length; i++){
					System.out.println( num[i] );
			}
	}//end test2
}

