package ch3.ex2;

public class CharTest3 {
	public static void main(String[] args) {
		char ch1='h'; //아스키 코드값:104
		char ch2='e';  //101
		char ch3='l';  //108
		char ch4='l';  //108
		char ch5='o';  //111
		
		System.out.println((ch1)+""+(ch2)+""+ch3+""+ch4+""+ch5);
		//개행문자
		System.out.println((ch1)+"\n"+(ch2)+"\n"+ch3+"\n"+ch4+"\n"+ch5);
		//탭문자
		System.out.println((ch1)+"\t"+(ch2)+"\t"+ch3+"\t"+ch4+"\t"+ch5);
		
		System.out.println((ch1)+"\r"+(ch2)+"\r"+ch3+"\r"+ch4+"\r"+ch5);
		
		System.out.println((ch1)+"\\"+(ch2)+"\\"+ch3+"\\"+ch4+"\\"+ch5);
		
		System.out.println("\'"+(ch1)+""+(ch2)+""+ch3+""+ch4+""+ch5+"\'");
		
		System.out.println("\""+(ch1)+""+(ch2)+""+ch3+""+ch4+""+ch5+"\"");
	}

}
