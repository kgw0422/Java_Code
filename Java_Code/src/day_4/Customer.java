package day_4;

public class Customer {
	
	private String name;
	private String address;
	private int cashOnHand;
	
	
	
//	public Customer(String name, String address, double cashOnHand) {
//		super();
//		this.name = name;
//		this.address = address;
//		this.cashOnHand = cashOnHand;
//	}



	public Customer() {
		// TODO 自動生成されたコンストラクター・スタブ
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public double getCashOnHand() {
		return cashOnHand;
	}



	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = (int) cashOnHand;
	}



	//Hint1: 車を購入するメソッドを書く
	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finnance) {
		emp.handleCustomer(this, finnance, vehicle);
		
	}
}
