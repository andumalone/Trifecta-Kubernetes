package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entiteien.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {

	
}
