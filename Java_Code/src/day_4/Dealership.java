package day_4;

public class Dealership {

	public static void main(String[] args) {
		//カーディーラーの販売シュミレートを記述する
		//営業する社員が1人、一人で営業活動を行い、敷居の外に車を停めている。
		//車を買うためにお客さんがいる
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("Osaka");
		cust1.setCashOnHand(12000);
		
		Vehicle vehicle = new Vehicle();
		vehicle.setNake("Honda");
		vehicle.setModel("Accord");
		vehicle.setPrice(100000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, true);
		

	}

}
