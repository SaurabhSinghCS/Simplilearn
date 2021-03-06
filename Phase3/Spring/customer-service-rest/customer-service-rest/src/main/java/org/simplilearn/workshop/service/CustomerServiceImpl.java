package org.simplilearn.workshop.service;

import java.util.List;

import org.simplilearn.workshop.model.Customer;
import org.simplilearn.workshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public List<Customer> getCustomers() {
		return customerRepository.getCustomers();
	}

	@Override
	public Customer saveCustomer(Customer theCustomer) {
		return customerRepository.saveCustomer(theCustomer);
	}

	@Override
	public Customer getCustomer(Integer theId) {
		return customerRepository.getCustomer(theId);
	}

	@Override
	public void deleteCustomer(Integer theId) {
		customerRepository.deleteCustomer(theId);
	}

}
