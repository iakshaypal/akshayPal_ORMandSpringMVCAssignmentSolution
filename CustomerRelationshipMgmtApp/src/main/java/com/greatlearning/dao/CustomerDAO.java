package com.greatlearning.dao;

import java.util.List;

import com.greatlearning.entity.Customer;

public interface CustomerDAO {
	
	public void saveCustomer(Customer customer);
	
	public Customer findCustomerById(int id);

	public List<Customer> getAllCustomer();

	public void deleteCustomerById(int id);

}
