package com.greatlearning.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	private SessionFactory factory;

	private Session session;

	@Autowired
	public CustomerDAOImpl(SessionFactory factory) {
		// TODO Auto-generated constructor stub

		this.factory = factory;

		try {
			session = factory.getCurrentSession();

		} catch (HibernateException e) {
			session = factory.openSession();
		}
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub

		Transaction transaction = session.beginTransaction();

		session.save(customer);

		transaction.commit();

	}

	@Override
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub

		Transaction transaction = session.beginTransaction();

		Customer customer = session.get(Customer.class, id);

		transaction.commit();

		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub

		Transaction transaction = session.beginTransaction();

		List<Customer> customerList = session.createQuery("from Customer").list();

		transaction.commit();

		return customerList;
	}

	@Override
	public void deleteCustomerById(int id) {
		// TODO Auto-generated method stub

		Transaction transaction = session.beginTransaction();

		Customer customer = session.get(Customer.class, id);

		session.delete(customer);

		transaction.commit();

	}

}
