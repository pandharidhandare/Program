package org.example.model;

public class Customer {

	private int customerId;
	private String customerName;
	public Customer() {
		
	}
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
		
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerNmae(String customerName) {
		this.customerName = customerName;
	}
	
}
 public class Product    {
	 private String productName;
	 private int productPrice;
    }
   
 public Product(String productName, int productPrice) {
	 this.productName = productName;
	 this.productPrice=productPrice;
    }
 public int getProductprice() {
	  return productprice;
 }
 
 }
