package org.simplilearn.workshop.service;

import java.util.List;

import org.simplilearn.workshop.model.Customer;
import org.simplilearn.workshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
//@Scope(value = "prototype")
public class CustomerServiceImpl implements CustomerService {

	// declare a variable of customerRepository (property)
	@Autowired
	private CustomerRepository customerRepository;
	
	//default constructor
	public CustomerServiceImpl() {
		super();
	}
	
	//parameterized constructor
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("spring container as called constructor to inject customerRepository bean --->");
		this.customerRepository = customerRepository;
	}
	
	// defined a setter method
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("spring container as called setter method to inject customerRepository bean --->");
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> retrieveAllCustomers() {
		return customerRepository.findAll();
	}
	
	@Override
	public void insertCustomer(String name, String phone, String email) {
		customerRepository.createCustomer(name, phone, email);
		
	}

}
