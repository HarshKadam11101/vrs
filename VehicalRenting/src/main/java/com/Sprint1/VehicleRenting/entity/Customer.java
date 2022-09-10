package com.Sprint1.VehicleRenting.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name= "customer")
@DiscriminatorValue ("C")

public class Customer extends User {
	
	public Customer() {
		
	}
	public Customer(String username, String PAN, String password, String address, String mobileNumber, String email) {
		super(username,PAN,password,address,mobileNumber,email);
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + this.getId()+ "]";
		
	}}