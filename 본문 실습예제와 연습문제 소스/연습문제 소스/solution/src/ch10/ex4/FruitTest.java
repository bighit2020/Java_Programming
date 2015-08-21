package ch10.ex4;

public class FruitTest {
	public static void calcGasu(String[] _fruit){
		int len=_fruit.length;
		String [] fruit_name=new String[len]; 
		int [] gasu=new int[len]; 
		String name=null;
		
		for(int i=0; i<len;i++){
			name=_fruit[i];

			for(int j=0;j<len;j++){
				if(name.equals(fruit_name[j])){ 
					gasu[j]++;//이미 과일 이름이 존재하면 개수를 1증가 시킨다.
					break;
				}else if(fruit_name[j]==null){ //name 배열의 마지막 요소에 새로운이름을 추가한다.
					fruit_name[j]=name;
						gasu[j]++;//gasu배열의 같은 배열요소에  점수를 더한다.
						break;
				}
			}
		}
		
		System.out.println("과일별 개수");
		System.out.println("=============");
		for(int i=0;i<len;i++){
			if(fruit_name[i]!=null){
				System.out.println(fruit_name[i]+ ":"+gasu[i]+"개");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		String [] fruit={"사과","바나나","귤","수박","사과","사과","귤","수박","수박","바나나",
	                      "귤","사과","사과","수박","귤","바나나","귤","바나나","사과","귤","귤"};
		
		calcGasu(fruit);
	}
}
