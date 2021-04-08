package org.simplilearn.workshop.repository;

import java.util.List;

import org.simplilearn.workshop.model.Customer;

public interface CustomerRepository {

	public List<Customer> findAll();
	
	public void createCustomer(String name, String phone, String email);
	
}
