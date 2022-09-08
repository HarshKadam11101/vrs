package com.Sprint1.VehicleRenting.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "users")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="PAN")
	private String PAN;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="address")
	private String address;
	
	@Column(name="mobile_number")
	private long mobileNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="Roles")
	private String role;
	

	
	public User() {
		
	}

	public User(String username, String PAN, String password, String address, long mobileNumber, String email, String role) {
	
		this.username = username;
		this.PAN = PAN;
		this.password = password;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.role = role;
	}
	
	
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getUserId() {
		return id;
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
		this.id=id;
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

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
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
		return "User [id=" + id + ", PAN=" + PAN + ", username=" + username + ", password=" + password
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", email=" + email + ", role=" + role
				+ "]";
	}

	

	
	
}

