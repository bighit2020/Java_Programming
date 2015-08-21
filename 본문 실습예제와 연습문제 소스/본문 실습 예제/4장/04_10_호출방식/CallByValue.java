package ch4.ex1;
/*
  var1의 값이 increase 메소드의 인자로 전달되면 ,
  그 값이   로컬변수  n에 복사되어서 var1의 값은 increase메소드가 수행한 
  후 에도 변하지 않는다.

*/

   public class CallByValue
   {
	   public int increase(int n){
			++n;
			return n;
	   }

	   public static void main(String [] args){
			int var1 = 100;
			CallByValue val = new CallByValue();
			int result = val.increase(var1);

			System.out.println("var1 : " + var1 + " , result: " + result);
			
	   }
   }