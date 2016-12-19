package com.itpros.dto;

public class Customer {

	private int customerID;
	private int storeID;
	private String firstName;
	private String lastName;
	private String email;
	private int addressID;
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName + " "+ lastName +" "+email;
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer  anotherCustomer = (Customer)obj;
		if(this.firstName.equals(anotherCustomer.firstName) && 
		  (this.lastName.equals(anotherCustomer.lastName)) &&
		  (this.email.equals(anotherCustomer.email)))
			return true;
		else return false;

	}

}
