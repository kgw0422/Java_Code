package day_4;

public class Employee {
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		
		
		
		if (finance == true) {
			int loanPrice = (int) (vehicle.getPrice() - cust.getCashOnHand());
			runCreditHistory(cust, loanPrice);
		} else if (vehicle.getPrice() <= cust.getCashOnHand()) {
			processaction(cust, vehicle);
			
		} else {
			System.out.println(" Customer will need more Money to purchase Vehicle : " + vehicle);
		}
		
		
	}
	
	public void runCreditHistory(Customer cust, int loanPrice) {
		System.out.println("Ran credit history for Customer,,,");
		System.out.println("Customer has been approved to purchase the Vihicle");
		
	}
	
	
	public void processaction(Customer cust, Vehicle vehicle ) {
		System.out.println("Customer has puechased the Vehicle: " + vehicle + "for the price" + vehicle.getPrice());
	}
}
