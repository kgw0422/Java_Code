package day_1;

public class Human {
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	//Earth.javaのインスタンス変数の値を受け取るため、コンストラクタを生成
	//構文は、public + クラス名
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}
	
	
	public void speak() {
		System.out.println("Hello, My name is " + name);
		System.out.println("I'm " + heightInInches + "inches tall");
		System.out.println("I'm " + age + "years old");
		System.out.println("My eye color is" + eyeColor);
	}
	
	public void eat() {
		System.out.println("eating....");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void work() {
		System.out.println("Working...");
	}

}
