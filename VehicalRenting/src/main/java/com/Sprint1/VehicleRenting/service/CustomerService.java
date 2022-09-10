package com.Sprint1.VehicleRenting.service;

import java.util.List;

import com.Sprint1.VehicleRenting.entity.Customer;

public interface CustomerService {

	void insertCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(int customerId);

	List<Customer> viewCustomers();

	Customer viewCustomer(int customerId);

	Customer viewCustomer(String userName);

	boolean validateCustomer(String username, String password, String role);

}
