package com.spraju.graphql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spraju.graphql.entity.Customer;
import com.spraju.graphql.service.CustomerService;
import com.spraju.graphql.service.MessageService;
import com.spraju.graphql.service.OrganisationService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class QueryResolver implements GraphQLQueryResolver {
	
	@Autowired
	MessageService messageService;
	
	@Autowired
	OrganisationService organisationService;
	
	@Autowired
	CustomerService customerService;
	

	
	public String getMessage() {
		return messageService.getMessage();
	}
	
	public Integer getId() {
		return organisationService.getId();
	}
	
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}
	


}
