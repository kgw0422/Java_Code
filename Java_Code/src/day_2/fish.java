package day_2;

public class fish extends Animal {
	//子クラス extends 親クラス{}の構文で子クラスは親クラスの機能を継承している
	//継承先のコンストラクタと互換性のあるコンストラクタを定義する必要がある
	public fish(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void swim() {
		System.out.println("Swimming");
	}

	@Override
	public void move() {
		System.out.println("fish is swimming");
		
	}

}
