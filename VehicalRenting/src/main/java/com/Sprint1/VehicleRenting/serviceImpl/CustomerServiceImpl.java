package com.Sprint1.VehicleRenting.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.entity.Customer;
import com.Sprint1.VehicleRenting.repository.CustomerRepository;
import com.Sprint1.VehicleRenting.service.CustomerService;



@Service

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repository;
	@Override
	public void insertCustomer(Customer customer) {
		repository.save(customer);
	}
	@Override
	public void updateCustomer(Customer customer) {
		repository.save(customer);
	}
	@Override
	public void deleteCustomer(int customerId) {
		repository.deleteById(customerId);
	}
	@Override
	public List<Customer> viewCustomers(){
		List<Customer> allCustomers = (List<Customer>) repository.findAll();
		return allCustomers;
	}
	@Override
	public Customer viewCustomer(int customerId){
		List<Customer> customerList = repository.findAll();
		for(Customer customer:customerList) {
			if(customer.getId()==customerId) {
				return customer;
			}
		}
		return null;
	}
	@Override
	public Customer viewCustomer(String userName){
		List<Customer> customerList = repository.findAll();
		for(Customer customer:customerList) {
			if(customer.getUsername().equals(userName) || customer.getEmail().equals(userName)) {
				return customer;
			}
		}
		return null;
	}

	@Override
	public boolean validateCustomer(String username, String password,String role) {
		if(role.equals("C")) {
			List<Customer> customersList = repository.findAll();
			for(Customer customer:customersList) {
				if(customer.getEmail().equalsIgnoreCase(username) || customer.getUsername().equalsIgnoreCase(username)) {
					if(customer.getPassword().equals(password)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
}
	

