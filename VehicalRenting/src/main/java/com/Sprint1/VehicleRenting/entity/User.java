package com.Sprint1.VehicleRenting.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="PAN")
	private String PAN;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="address")
	private String address;
	
	@Column(name="mobile_number")
	private int mobileNumber;
	
	@Column(name="email")
	private String email;
	
	public User() {
		
	}

	public User(String username, String PAN, String password, String address, int mobileNumber, String email) {
		super();
		this.username = username;
		this.PAN = PAN;
		this.password = password;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		
	}
	
	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getPassword() {
		return password;
	}
	
	public void setUserId(int id)
	{
		this.userId=id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", PAN=" + PAN + ", username=" + username + ", password=" + password
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}

	
	
}

