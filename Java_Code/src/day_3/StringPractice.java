package day_3;

public class StringPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ 
		
		
		String a = "Hello";
		String b = "there";
		
		if (a == "Hellow") {
			//==論理演算子は文字列の比較にしてできない。整数やboolean型で使用できる
		}
		
		if (!a.equals("Hello")) {
			//処理が実行される
			//文字列を使って比較するときはequalメソッドを使用すること
		}
		
		if (b.equalsIgnoreCase("There")) {
			//文字列が大文字か小文字で比較しない場合はequalsIgnoreCase()メソッドを使用する
			System.out.println(b);
		}
		
		/* 文字列のメソッドについて */
		//charAt(): 文字列が長い時に特定の文字を検索するときに使用するメソッド
		System.out.println(a.charAt(4));
		
		
		

	}

}
