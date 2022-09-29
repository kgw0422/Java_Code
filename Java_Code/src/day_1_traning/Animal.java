package day_1_traning;

public class  Animal{
	
	//フィールドを記述
	String Type;
	int age;
	String sex;
	int weight;
	
	
	//コンストラクタの生成
	public Animal(String type, int age, String sex, int weight) {
		super();
		Type = type;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
	}

	//動物の行動を記述
	public void eat() {
		System.out.println(Type + " is eating Meat");
	}

}
