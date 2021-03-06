package org.simplilearn.workshop.repository;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.simplilearn.workshop.model.Customer;

public interface CustomerRepository extends Repository<Customer, Integer> {

	public List<Customer> getCustomers();
	
	public Customer saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(Integer theId);
	
	public Customer deleteCustomer(Integer theId);
}
