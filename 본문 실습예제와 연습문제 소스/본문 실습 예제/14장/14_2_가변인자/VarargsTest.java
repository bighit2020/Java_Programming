package ch14.ex1;


public class VarargsTest {
	public static void main ( String [ ] args){

		 Varargs var  = new Varargs();
		
			var.method1( "박지성" ,"차범근","이순신" );
			var.method2( "박지성" , 1 ,2 ,3 ,4 );
	}
}

class Varargs{
	 //메소드 인자가 자동으로 배열로 변환된다.
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

