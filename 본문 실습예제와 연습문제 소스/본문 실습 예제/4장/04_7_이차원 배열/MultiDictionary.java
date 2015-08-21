package ch4.ex4b;

public class MultiDictionary {
	public static void main(String[] args) {
		String[][][] dictionary=
				{
				 {{"apple","사과","リンゴ" },
				  {"actor","배우","はいゆう" },
				  {"address","주소","じゅうしょ" },
				  {"age","나이","とし"  },
				  {"advice","충고","ちゅうこく"  }},
				  
				  {{"book","책","ほん"},
				  {"baby","아기","おさなご"},
				  {"bad","나쁘다","わるい" },
				  {"ball","공","たま" },
				  {"banana","바나나","バナナ" }},
				  
				  {{"cabbage","양배추","キャベツ" },
				  {"cable","전선","ぜんせん" },
				  {"car","자동차","くるま" },
				  {"candle","양초","せいよう" },
				  {"camera","사진기","カメラ" }}
				};

		
		System.out.println("일차원 요소 개수: "+dictionary.length);
		System.out.println("이차원 요소 개수: "+dictionary[0].length);
		System.out.println("삼차원 요소 개수: "+dictionary[0][0].length);
		
		
		for(int i=0; i<dictionary.length;i++){
			for(int j=0 ;j<dictionary[i].length;j++){
				for(int k=0; k<dictionary[0][j].length;k++){
					System.out.println(dictionary[i][j][k]);
				}
			}
			System.out.println();
		}
		
		
		String word="camera";
		for(int i=0; i<dictionary.length;i++){
			for(int j=0 ;j<dictionary[i].length;j++){
				if(word.equals(dictionary[i][j][0])){
					System.out.println("영어:"+dictionary[i][j][0]);
					System.out.println("한국어:"+dictionary[i][j][1]);
					System.out.println("일본어:"+dictionary[i][j][2]);
					break;
				}
				
			}
			System.out.println();
		}
		
		
	}

}
