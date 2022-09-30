package day_2;

public abstract class  Animal{
	
	//フィールドを記述
	int age;
	String gender;
	int weight;
	
	
	//コンストラクタの生成
	public Animal(int age, String gender, int weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

	//動物の行動を記述
	public void eat() {
		System.out.println("Eating.....");
	}

	public void sleep() {
		System.out.println("Sleeping....");
	}
	
	//具体的な中身の処理は記述しないが継承先のクラスがメソッドを使用できるために記述する。
	public abstract void move();

}
