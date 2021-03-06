package org.simplilearn.workshop.service;

import java.util.List;

import org.simplilearn.workshop.model.Customer;
import org.simplilearn.workshop.repository.CustomerRepository;
import org.simplilearn.workshop.repository.ListCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	// depends on CustomerRepository
	private CustomerRepository customerRepository = new ListCustomerRepositoryImpl();
	
	@Override
	public List<Customer> retrieveAllCustomers() {
		return customerRepository.findAll();
	}

}
