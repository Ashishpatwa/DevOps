package com.example.customerService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customerService.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
