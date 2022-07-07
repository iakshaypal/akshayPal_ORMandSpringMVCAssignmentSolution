package com.greatlearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.dao.CustomerDAO;
import com.greatlearning.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAOImpl;

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDAOImpl.saveCustomer(customer);
	}

	@Override
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDAOImpl.findCustomerById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerDAOImpl.getAllCustomer();
	}

	@Override
	public void deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		customerDAOImpl.deleteCustomerById(id);
	}

}
