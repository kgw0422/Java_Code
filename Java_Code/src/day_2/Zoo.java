package day_2;

public class Zoo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//各インスタンスに引数を入力。順番注意
		//抽象クラスとなったAnimalはインスタンスを生成できない
//		Animal animal1 = new Animal(1, "M", 5);
//		animal1.eat();
		
		Animal sparrow1 = new Sparrow(1, "M", 4);
		sparrow1.move();
		
		fish fish1 = new fish(1 , "F" , 50);
		fish1.move();
	}
}
