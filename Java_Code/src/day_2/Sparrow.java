package day_2;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	//Zoo.javaファイルの呼び出しはここから呼び出されている
	//どこからオーバーライドしているのか→implementsしているFlyableへ
	public void fly() {
		System.out.println("Sparrow flying high....");
	}


}
