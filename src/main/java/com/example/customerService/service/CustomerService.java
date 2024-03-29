package com.example.customerService.service;

import java.util.List;

import com.example.customerService.model.Customer;

public interface CustomerService {
	
	Customer addCustomer(Customer customer);
	Customer getSpecificCustomer(String customerId);
	List<Customer> getAllCustomer();
	Customer updateCustomer(String customerId, Customer customer);
	String deleteCustomer(String customerId);

}
