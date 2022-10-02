package day_3;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*While メソッドについて条件式が正しい間は処理を継続すること
		 * 
		 * */
		//変数宣言と初期値設定
//		int h = 0;
		//変数hが100以上になれば処理は終わるがそれ以外は処理を続ける
//		while ( h <= 100 ) {
//			System.out.println("KGW: " + h);
//			//h++でhの値を1ずつ増やす処理を行う
//			h++;
//		}
		
		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apperal and the slightly"
				+ "more in demand category:makeup along with the category:furnitureand ...";
				
		printCategories(str);
	}
	
	public static void printCategories(String str) {
		
		int i = 0;
		while(true) {
			int found = str.indexOf("Category: " , i);
			if(found == -1) break;
			int start = found + 9;
			int end = str.indexOf("　", start);
			System.out.println(str.substring(start, end));
			i = end + 1;
		}
		
		
		
	}

}
