package ch4.ex1;
/*
  var1�� ���� increase �޼ҵ��� ���ڷ� ���޵Ǹ� ,
  �� ����   ���ú���  n�� ����Ǿ var1�� ���� increase�޼ҵ尡 ������ 
  �� ���� ������ �ʴ´�.

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