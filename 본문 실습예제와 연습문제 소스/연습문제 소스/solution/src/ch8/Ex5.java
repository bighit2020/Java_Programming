package ch8;

public class Ex5 {
	private static boolean palindrome(String str){
		boolean isPalindrome=true;

		int len=str.length();
		for(int i=0; i<len/2;i++){
			if(str.charAt(i)!=str.charAt(len-1-i)){
				isPalindrome=false;
				break;
			}
		}
		
		return isPalindrome;
		
		
	}
	public static void main(String[] args) {
		String str1="level";
		String str2="hello";
		

		if(palindrome(str1))
			System.out.println(str1+"은 회문입니다..");
		else
			System.out.println(str1+"은 회문이 아닙니다.");
		
		if(palindrome(str2))
			System.out.println(str2+"은 회문입니다..");
		else
			System.out.println(str2+"은 회문이 아닙니다.");		
	}
}
