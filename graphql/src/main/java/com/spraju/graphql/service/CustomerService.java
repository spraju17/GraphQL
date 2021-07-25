package com.spraju.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spraju.graphql.entity.Customer;
import com.spraju.graphql.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}
}
