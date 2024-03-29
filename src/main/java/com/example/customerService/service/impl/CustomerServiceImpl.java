package com.example.customerService.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerService.exceptions.ResourceNotFoundException;
import com.example.customerService.model.Customer;
import com.example.customerService.repository.CustomerRepository;
import com.example.customerService.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		
		String customerId = "CustomerId-" + UUID.randomUUID().toString();
		customer.setCustomerId(customerId);
		return customerRepository.save(customer);
		
	}


	@Override
	public Customer getSpecificCustomer(String customerId) {
		
		return customerRepository.findById(customerId).orElseThrow(()-> new ResourceNotFoundException("User with "+ customerId + " not found on server!!"));
	
	}

	
	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	
	
	@Override
	public Customer updateCustomer(String customerId, Customer customer) {
		
		Customer getCustomer = customerRepository.findById(customerId).orElseThrow(()-> new ResourceNotFoundException("User with " + customerId + " not found on Server!!"));
		
		getCustomer.setCustomerName(customer.getCustomerName());
		getCustomer.setAddress(customer.getAddress());
		getCustomer.setGmail(customer.getGmail());
		getCustomer.setDateOfBirth(customer.getDateOfBirth());
		getCustomer.setPhnNo(customer.getPhnNo());
		getCustomer.setPincode(customer.getPincode());
		
		return customerRepository.save(getCustomer);
		
	}

	@Override
	public String deleteCustomer(String customerId) {

		Customer getCustomer = customerRepository.findById(customerId).orElseThrow(()-> new ResourceNotFoundException("User with " + customerId + " not found on Server!!"));
		customerRepository.deleteById(customerId);
			
		return "Successfully removed customer " + customerId;
			
	
	}
	

}
