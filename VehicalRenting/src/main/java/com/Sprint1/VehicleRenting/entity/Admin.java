package com.Sprint1.VehicleRenting.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name= "admin")
@DiscriminatorValue ("A")

public class Admin extends User {
	
	public Admin() {
		
	}
	public Admin(String username, String PAN, String password, String address, String mobileNumber, String email) {
		super(username,PAN,password,address,mobileNumber,email);
	}
	
	@Override
	public String toString() {
		return "Admin [adminId=" + this.getId()+ "]";
		
	}
	


}
