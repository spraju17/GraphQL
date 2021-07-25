package com.spraju.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spraju.graphql.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
