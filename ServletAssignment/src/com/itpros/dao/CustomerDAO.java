package com.itpros.dao;

import com.itpros.dto.Customer;

//import com.itpros.beans.Customer;

public interface CustomerDAO {
	Boolean createCustomer(Customer cust);
	
	Customer updateCustomer(Customer cust);

	Customer getCustomer(Integer custID);
	
	Boolean deleteCustomer(Integer custID);

}
