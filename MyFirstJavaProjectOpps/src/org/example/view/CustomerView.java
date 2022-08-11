package org.example.view;
import org.example.model.Customer;
public class CustomerView {
	int getCustomerIdFromCustomer(Customer custObj) {
		int custId=custObj.getCustomerId();
		return custId;
		
	}
	public static void main (String[] args) {
		Customer customer1 = new Customer(1,"pandhari");
		CustomerView mainViewObj = new CustomerView();
				mainViewObj.getCustomerIdFromCustomer(customer1);
		int id = customer1.getCustomerId();
		System.out.println(id);
	}

}
