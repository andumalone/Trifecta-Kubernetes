package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.ICustomerRepository;
import com.example.demo.entiteien.Customer;

@Service
public class CustomerService {

	@Autowired
	private ICustomerRepository repo;

	public void save() {
		repo.save(new Customer());
	}

	public boolean save(Customer a) {
		repo.save(a);
		return true;
	}

	public List<Customer> findAll() {
		return repo.findAll();
	}

	public Customer findById(long id) {
		return repo.findById(id).get();
	}

	public boolean update(Customer a, long id) {
		Customer customer = repo.findById(id).get();
		customer.setGender(a.getGender());
		customer.setAge(a.getAge());
		customer.setRegion(a.getRegion());
		customer.setPhoneNumber(a.getPhoneNumber());
		customer.setFavoriteBand(a.getFavoriteBand());

		repo.save(customer);
		return true;
	}

	public boolean delete(long id) {
		repo.deleteById(id);
		return true;
	}

}
